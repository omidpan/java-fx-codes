package champlaincollege.demo.chapter32.join;

class TaskB implements Runnable {
    private String name;

    public TaskB(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(">>> " + name + " started.");
        char letter = 'A';
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(name + ": Letter " + (char)(letter + i));
                Thread.sleep(700); // Wait for 700ms (slightly slower)
            }
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
            Thread.currentThread().interrupt();
        }
        System.out.println("<<< " + name + " finished.");
    }
}