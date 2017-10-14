import java.util.*;
public class AllArrays1
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Type the nuber of array things you want");
    int n = input.nextInt();
    int[] array = new int[n];
    int samplesum = 0;
    for(int x = 0; x < n; x++)
    {
      array[x] = 1;
      System.out.println(array[x]);
    }
    System.out.println("Type in " + n + " intregers");
    for(int x = 0; x < n; x++)
    {
      array[x] = input.nextInt();
    }
    for(int x = 0; x < n; x++)
    {
      System.out.println(array[x]);
    }
    int z = array[0];
    array[0] = array[n-1];
    array[n-1] = z;
    for(int x = 0; x < n; x++)
    {
      array[x] = Math.abs(array[x]);
    }
    System.out.println("First and last flipped");
    for(int x = 0; x < n; x++)
    {
      System.out.println(array[x]);
    }
    for(int x = 0; x < n; x++)
    {
      samplesum += array[x];
    }
    System.out.println("Total is: " + samplesum);
    for(int x = 0; x < n; x++)
    {
      System.out.println("All even nums:");
      if (array[x]%2==0)
      {
        System.out.println(array[x]);
      }
    }
  }
}