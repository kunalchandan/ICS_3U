import java.util.*;
import java.lang.*;
public class RandomNumber
{
  public static void main(String[]args)
  {
    Random rnd = new Random();
    int x = rnd.nextInt(100)+1;
    System.out.println(x);
    
    int y = (int)(Math.random() * 100);
    System.out.println(y);
  }
}