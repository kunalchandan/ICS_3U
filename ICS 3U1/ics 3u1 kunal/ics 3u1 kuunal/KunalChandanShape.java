import java.util.*;
public class KunalChandanShape
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    
    int width;
    int length;
    int count = 1;
    int hCount = 0;
    int vCount = 0;
    int rCount = 0;
    int ltCount = 0;
    int itCount = 0;
    String str = "y";
    
    System.out.printf("%n%s", "Welcome to the Shape Generator:");
    
    while (str.compareToIgnoreCase("y") == 0)
    {
      width = 0;
      length = 0;
      count = 1;
      System.out.printf("%n%s", "1) Horizontal line");
      System.out.printf("%n%s", "2) Vertical line");
      System.out.printf("%n%s", "3) Rectangle");
      System.out.printf("%n%s", "4) Left slant right angle triangle");
      System.out.printf("%n%s", "5) Isosceles triangle");
      System.out.printf("%n%s", "Enter your choice (1-5):");
      int shape = input.nextInt();
      while (shape > 5 || shape < 1)
      {
        System.out.println("Invalid choice!  Your choice must be between 1 and 5.");
        shape = input.nextInt();
      }
      if (shape == 1)
      {
        System.out.println("Enter the length of the line (1-20):");
        length = input.nextInt();
        while (length > 20 || length < 1)
        {
          System.out.println("Invalid dimension!  The dimension must be between 1 and 20.");
          length = input.nextInt();
        }
        for(int l = length; l > 0; l--)
        {
          System.out.printf("*");
        }
        hCount++;
      }
      if (shape == 2)
      {
        System.out.println("Enter the length of the line (1-20):");
        length = input.nextInt();
        while (length > 20 || length < 1)
        {
          System.out.println("Invalid dimension!  The dimension must be between 1 and 20.");
          length = input.nextInt();
        }
        for(int l = length; l > 0; l--)
        {
          System.out.println("*");
        }
        vCount++;
      }
      if (shape == 3)
      {
        System.out.println("Enter the width of the rectangle (1-20):");
        width = input.nextInt();
        while (width > 20 || width < 1)
        {
          System.out.println("Invalid dimension!  The dimension must be between 1 and 20.");
          width = input.nextInt();
        }
        System.out.println("Enter the length of the rectangle (1-20):");
        length = input.nextInt();
        while (length > 20 || length < 1)
        {
          System.out.println("Invalid dimension!  The dimension must be between 1 and 20.");
          length = input.nextInt();
        }
        System.out.println("Here is the rectangle:");
        for(int l = length; l > 0; l--)
        {
          System.out.println("");
          for(int w = width; w > 0; w--)
          {
            System.out.printf("*");
          }
        }
        rCount++;
      }
      if (shape == 4)
      {
        System.out.println("Enter the height of the triangle (1-20):");
        width = input.nextInt();
        while (width > 20 || width < 1)
        {
          System.out.println("Invalid dimension!  The dimension must be between 1 and 20.");
          width = input.nextInt();
        }
        System.out.println("");
        for(int w = width; w >= 0; w--)
        {
          for(int i = w; i < width; i++)
          {
            System.out.print("*");
          }
          System.out.println("");
        }
        ltCount++;
      }
      if (shape == 5)
      {
        System.out.println("Enter the height of the triangle (1-20):");
        width = input.nextInt();
        while (width > 20 || width < 1)
        {
          System.out.println("Invalid dimension!  The dimension must be between 1 and 20.");
          width = input.nextInt();
        }
        for(int w = width; w > 0; w--)
        {
          System.out.println("");
          for(int x = w; x > 0; x--)
          {
            System.out.print(" ");
          }
          for(int z = count; z > 0;z--)
          {
            System.out.print("*");
          }
          count +=2;
        }
        itCount++;
      }
      while (str.compareToIgnoreCase("y") == 0 || str.compareToIgnoreCase("n") == 1)
      {
        System.out.printf("%n%s", "Would you like to draw another shape (y/n)?");
        str = input.next();
      }
    }
    while (str.compareToIgnoreCase("y") != 0 && str.compareToIgnoreCase("n") != 0)
    {
      System.out.println("Invalid input!  Your input must be ‘y’ or ‘n’.");
      str = input.next();
    }
    System.out.println("Here is a summary of the shapes that were drawn.");
    System.out.printf("%n%n%s%23d", "Horizontal Line", hCount);
    System.out.printf("%n%s%25d", "Vertical Line", vCount);
    System.out.printf("%n%s%29d", "Rectangle", rCount);
    System.out.printf("%n%s%7d", "Left slant right angle triangle", ltCount);
    System.out.printf("%n%s%20d", "Isosceles triangle", itCount);
    System.out.println("");
    System.out.println("Thank you for using Shape Generator.  Good Bye!");
  }
}