package champlaincollege.demo.chapter32.multiprocessing;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 * @Author: Omid Panahi
 */
public class DoubleIntegerRecursiveActionWithDelayDemo {
    private static int SIZE = 10000;
    public static void main(String[] args) throws InterruptedException {
        int[] data = new int[SIZE];
        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }

        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(" ########## Start Using Recursive Action ##########");
        long startTime = System.currentTimeMillis();
        pool.invoke(new DoubleActionTask(data, 0, data.length));
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel processing time: " + (endTime - startTime) + " ms");

        System.out.println(" ########## End Using Recursive Action ##########");

        System.out.println(" ########## Start Using Sequential Processing (No Parallelism) ##########");

        for (int i = 0; i < data.length; i++) {
            data[i] = i + 1;
        }
         startTime = System.currentTimeMillis();

        // Sequential processing (NO parallelism)
        for (int i = 0; i < data.length; i++) {
            data[i] *= 2;
            Thread.sleep(1);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Sequential processing time: " + (endTime - startTime) + " ms");
        // I commented out printing values
//       Arrays.stream(data).forEach(i -> System.out.print(i + " "));

    }

    static class DoubleActionTask extends RecursiveAction {
        private static final int THRESHOLD =300;
        private int[] data;
        private int from;
        private int to;

        DoubleActionTask(int[] data, int from, int to) {
            this.data = data;
            this.from = from;
            this.to = to;
        }

        @Override
        protected void compute() {
            int length = to - from;

            if (length <= THRESHOLD) {
                //No More split task
                for (int i = from; i < to; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    data[i] *= 2;
                }
            } else {
                // Split into two subtasks
                int mid = from + length / 2;
                DoubleActionTask left  = new DoubleActionTask(data, from, mid);
                DoubleActionTask right = new DoubleActionTask(data, mid, to);

                //Forks the subtasks to the pool
                //Joins them (waits) before returning.
                invokeAll(left, right);


            }
        }
    }
}