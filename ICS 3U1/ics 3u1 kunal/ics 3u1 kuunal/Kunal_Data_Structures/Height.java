import java.util.*;
public class Height
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner(System.in);
    int[] heights;
    heights = new int[20];
    int average = 0;
    for(int x = 0; x < 20; x++)
    {
      System.out.println("What is the height of person " + x + " in cm?");
      heights[x] = input.nextInt();
      while (heights[x] <= 0)
      {
        System.out.println("What is the actual height?");
        heights[x] = input.nextInt();
      }
      average+= heights[x];
    }
    average=(average / 20);
    System.out.println("Below average heights are less than " + average);
    for(int x = 0; x < 20; x++)
    {
      if (heights[x] < average)
      {
        System.out.println("Height:" + heights[x]);
      }
    }
  }
}