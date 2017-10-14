import java.util.*;
public class AgeCheck
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    int age;
    int minAge = 18;
    
    System.out.println("How old are you?");
    age = input.nextInt();
    if (age >= minAge)
    {
      System.out.println("OLD ENOUGH TO VOTE");
    }
    else 
    {
      age -= minAge;
      System.out.println("You will be old enough in " + age + " years!");
    }
  }
}