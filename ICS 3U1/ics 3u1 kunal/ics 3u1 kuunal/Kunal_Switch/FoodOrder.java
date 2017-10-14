import java.util.*;
public class FoodOrder 
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      System.out.println("What would you like?");
      System.out.println("1) juice, muffin, coffee");
      System.out.println("2) cereal, toast, milk");
      System.out.println("3) egg, toast, coffee");
      System.out.println("4) banana, granola, milk");
      System.out.println("5) grapefruit, bacon, eggs, coffee");
      int food = input.nextInt();
      switch (food) 
      {
        case 1: case 2:
          System.out.println("The meal is $2.50");
          break;
        case 3:
          System.out.println("The meal is $3.00");
          break;
        case 4:
          System.out.println("The meal is $3.50");
          break;
        case 5:
          System.out.println("The meal is $5.00");
          break;
        default:
          System.out.println("Please select a valid input!");
          break;
      }
    }
}
