package champlaincollege.demo.chapter32;

// The task class for printing number from 1 to n for a given n
public class PrintNum implements Runnable {
  private int lastNum;

  /** Construct a task for printing 1, 2, ... i */
  public PrintNum(int n) {
    lastNum = n;
  }

  @Override /** Tell the thread how to run */
  public void run() {
    for (int i = 1; i <= lastNum; i++) {
      if(i>20){
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
      System.out.println(" " + i);
    }
  }
}
