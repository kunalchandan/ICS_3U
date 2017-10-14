import java.util.*;
public class Temperature 
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the temperature(Celcius)?");
    int temp = input.nextInt();
    if (temp < -18)
    {
      System.out.println("Very cold");
    }
    else if (temp >= -18 && temp < 0)
    {
      System.out.println("Cold");
    }
    else if (temp == 0)
    {
      System.out.println("Freezing point of water");
    }
    else if (temp > 0 && temp <= 10)
    {
      System.out.println("Very cool");
    }
    else if (temp >= 11 && temp <=20)
    {
      System.out.println("Moderate");
    }
    else if (temp >= 21 && temp <=30)
    {
      System.out.println("Warm");
    }
    else if (temp >= 31 && temp <=40)
    {
      System.out.println("Hot");
    }
    else if (temp >= 41 && temp <=99)
    {
      System.out.println("Extremely hot");
    }
    else if (temp == 100)
    {
      System.out.println("Boiling point of water");
    }
  }
}