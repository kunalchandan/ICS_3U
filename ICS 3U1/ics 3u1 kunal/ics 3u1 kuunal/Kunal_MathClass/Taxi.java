import java.util.*;
public class Taxi
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of people riding the taxi");
    int p = input.nextInt();
    
    while (p < 0)
    {
      System.out.println("you cant do that");
      System.out.println("Enter the number of people riding the taxi");
      p = input.nextInt();
    }
    
    int taxis = (int)(p/4);
    if ((p%4)>0)
    {
      taxis+=1;
    }
    if ((p%4)<0)
    {
      taxis-=1;
    }
    
    System.out.println("You need "+ taxis + " taxis.");
  }
}