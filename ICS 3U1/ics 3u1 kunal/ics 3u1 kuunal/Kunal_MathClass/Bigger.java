import java.util.*;
public class Bigger
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Input 2 numbers");
    int x = input.nextInt();
    int y = input.nextInt();
    if (x>y)
    {
      System.out.println("The bigger number is "+ x);
    }
    else if (x==y)
    {
      System.out.println("They are the same");
    }
    else 
    {
      System.out.println("The bigger number is "+ y);
    }
  }
}