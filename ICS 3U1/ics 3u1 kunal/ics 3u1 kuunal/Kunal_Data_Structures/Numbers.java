import java.util.*;
public class Numbers
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    //Part a
    double[] array;
    array = new double[6];
    //Part b
    for(int x = 0; x < 6; x++)
    {
      array[x] = input.nextDouble();
    }
    //Part c
    for(int x = 6; x < 0; x--)
    {
      System.out.println(array[x]);
    }
    //Part d
    for(int x = 0; x < 6; x++)
    {
      array[x]= (array[x]*1.1);
    }
    //Part e
    for(int x = 0; x < 6; x++)
    {
      if (array[x] > 50)
      {
        System.out.println(array[x]);
      }
    }
  }
}