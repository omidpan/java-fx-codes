package champlaincollege.demo.chapter32.pool;

import champlaincollege.demo.chapter32.PrintChar;
import champlaincollege.demo.chapter32.PrintNum;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
  public static void main(String[] args) {
    // Create a fixed thread pool with maximum three threads
    ExecutorService executor = Executors.newFixedThreadPool(3);
    ExecutorService executor2 = Executors.newCachedThreadPool() ;
    // Submit runnable tasks to the executor
    executor.execute(new PrintChar('a', 100));
    executor.execute(new PrintChar('b', 100));
    executor.execute(new PrintChar('c', 30));
    executor.execute(new PrintChar('d', 30));
    //2nd executor
    executor2.execute(new PrintChar('e', 100));
    executor2.execute(new PrintChar('f', 100));
    executor2.execute(new PrintChar('g', 100));
    executor2.execute(new PrintNum(10));
    // Shut down the executor
    executor.shutdown();


    executor2.shutdown();
  }
}