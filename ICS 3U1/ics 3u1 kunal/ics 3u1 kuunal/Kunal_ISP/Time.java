import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Time {
  static int interval;
  static Timer timer;
  
  public static void main(String[] args) {
    
    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = 0;
    
    timer.scheduleAtFixedRate(new TimerTask() {
      
      public void run() {
        System.out.println(setInterval());
      }
    }, delay, period);
    
  }
  
  private static final int setInterval() {
    return interval++;
  }
}