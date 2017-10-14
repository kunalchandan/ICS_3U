import java.util.*;
public class Pass
{
  public static void main(String[]args)
  { 
    Scanner input = new Scanner(System.in);
    
    int num1 = (int)(Math.random() * 50 + 1);
    int num2 = (int)(Math.random() * 50 + 1);
    int sum = num1 + num2;
    
    System.out.println("Add the following " + num1 + " + " + num2 + " =");
    int answer = input.nextInt();
    
    if ((sum)==answer)
    {
      System.out.println("You're Right!");
    }
    else
    {
      System.out.println("You're Wrong!");
    }
  }
}