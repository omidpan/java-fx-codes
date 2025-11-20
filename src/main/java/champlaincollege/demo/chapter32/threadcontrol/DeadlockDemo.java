package champlaincollege.demo.chapter32.threadcontrol;

public class DeadlockDemo {

    private static final Object object1 = new Object();
    private static final Object object2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (object1) {
                System.out.println("Thread 1: Locked object1");

                try { Thread.sleep(200); } catch (InterruptedException e) {}

                synchronized (object2) {
                    System.out.println("Thread 1: Locked object2");
                }
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            synchronized (object2) {
                System.out.println("Thread 2: Locked object2");

                try { Thread.sleep(200); } catch (InterruptedException e) {}

                synchronized (object1) {
                    System.out.println("Thread 2: Locked object1");
                }
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        // Keep program alive so jstack can inspect it
        while (true) {
            try { Thread.sleep(1000); } catch (Exception ignored) {}
        }
    }
}

