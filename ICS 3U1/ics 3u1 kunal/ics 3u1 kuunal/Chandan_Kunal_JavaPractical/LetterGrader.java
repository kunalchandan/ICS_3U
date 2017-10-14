import java.util.*;
public class LetterGrader
{
  public static void main(String[]args)
  {
    int mark;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Percentage:");
    mark = in.nextInt();
    if((mark >= 0) && (mark <= 49))
    {
      System.out.println("Grade is: F");
    }
    else if((mark >= 50) && (mark <= 59))
    {
      System.out.println("Grade is: D");
    }
    else if((mark >= 60) && (mark <= 69))
    {
      System.out.println("Grade is: C");
    }
    else if((mark >= 70) && (mark <= 79))
    {
      System.out.println("Grade is: B");
    }
    else if((mark >= 80) && (mark <= 100))
    {
      System.out.println("Grade is: A");
    }
  }
}