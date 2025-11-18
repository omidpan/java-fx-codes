package champlaincollege.demo.chapter32.join;

public class JoinDemo {
    public static void main(String[] args) {
        System.out.println("Main Thread: Starting two separate worker threads...");


        Runnable task1 = new TaskA("Worker-A");
        Runnable task2 = new TaskB("Worker-B");


        Thread threadA = new Thread(task1);
        Thread threadB = new Thread(task2);

        // Start the threads
        threadA.start();
        threadB.start();

        System.out.println("Main Thread: Both workers started. Main thread continues without waiting.");

        // Optional: To make the Main Thread wait for both tasks to finish (using join)
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main Thread: All workers completed their execution.");
    }
}