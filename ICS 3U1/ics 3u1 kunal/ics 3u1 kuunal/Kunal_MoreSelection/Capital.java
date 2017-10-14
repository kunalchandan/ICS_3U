import java.util.*;
public class Capital
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the capital of Canada?");
    String capital = input.next();
    
    if (capital.compareToIgnoreCase("Ottawa")==0)
    {
      System.out.println("You are right!");
    }
    else 
    {
      System.out.println("You are wrong!");
    }
  }
}