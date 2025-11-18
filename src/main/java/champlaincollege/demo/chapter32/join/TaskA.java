package champlaincollege.demo.chapter32.join;

class TaskA implements Runnable {
    private String name;

    public TaskA(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(">>> " + name + " started.");
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + ": Count " + i);
                Thread.sleep(500); // Wait for 500ms
            }
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
            Thread.currentThread().interrupt();
        }
        System.out.println("<<< " + name + " finished.");
    }
}