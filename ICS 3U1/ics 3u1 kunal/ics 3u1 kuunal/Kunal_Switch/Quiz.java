import java.util.*;
public class Quiz 
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many 'else if' statements can you have?");
      System.out.println("1) 0");
      System.out.println("2) 1");
      System.out.println("3) 100");
      System.out.println("4) Infinte");
      System.out.println("5) I don't know");
    int ans = input.nextInt();
    switch(ans)
    {
      case 1: case 2: case 4: case 5: 
        System.out.println("Wrong, the answer is infinite.");
        break;
      case 3:
        System.out.println("Correct!");
        break;
        
      default:
        System.out.println("Invalid input!");
        break;
    }
  }
}