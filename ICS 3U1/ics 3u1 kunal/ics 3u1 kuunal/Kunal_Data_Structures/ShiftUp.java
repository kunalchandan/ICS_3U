import java.util.*;
public class ShiftUp
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    int[] array = new int[20];
    int thing;
    for(int x = 0; x < 20; x++)
    {
      array[x]=input.nextInt();
    }
    for(int x = 0; x < 20; x++)
    {
      System.out.println((x+1) + ".  " + array[x]);
    }
    thing = array[0];
    for(int y = 1; y < 20; y++)
    {
      array[y-1] = array[y];
    }
    array[19] = thing;
    for(int x = 0; x < 20; x++)
    {
      System.out.println((x+1) + ".  " + array[x]);
    }
    
    
    
    
  }
}