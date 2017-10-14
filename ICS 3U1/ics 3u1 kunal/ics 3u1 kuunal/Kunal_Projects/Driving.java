import java.util.*;
public class Driving
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Traffic Department rules dictate you can only drive if you are older than 18 and less than 75");
    System.out.println("How old are you?");
    int age = input.nextInt();
    if (age < 18)
    {
    System.out.println("Too young to drive");
    }
    else if (age > 75)
    {
    System.out.println("Sorry, you are over the legal age limit for driving");
    }
    else
    {
    System.out.println("Age OK.  Have you got a driver’s licence?");
    }
  }
}