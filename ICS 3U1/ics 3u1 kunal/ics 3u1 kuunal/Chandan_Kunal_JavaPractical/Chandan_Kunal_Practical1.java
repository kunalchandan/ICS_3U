import java.util.*;
public class Chandan_Kunal_Practical1
{
  public static void main(String[]args)
  {
    int array[] = new int[3];
    int average = 0;
    Scanner in = new Scanner(System.in);
    for(int x = 0; x < 3; x++)
    {
      System.out.println("Enter Mark " + (x+1) + ":");
      array[x] = in.nextInt();
      average += array[x];
    }
    average = average/3;
    System.out.println("Average:" + average);
  }
}