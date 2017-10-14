import java.util.*;
public class SortThreeLetters
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    char ch1;
    char ch2;
    char ch3;
    System.out.println("Type in 3 lowercase letters to order them.");
    ch1 = input.next().charAt(0);
    ch2 = input.next().charAt(0);    
    ch3 = input.next().charAt(0);
    
    if (ch1>96 && ch1<123 && ch2>96 && ch2<123 && ch3>96 && ch3<123)
    {
      if (ch1 < ch2 && ch1 < ch3)
      {
        System.out.print(ch1);
      }
      else if (ch2 < ch1 && ch2 < ch3)
      {
        System.out.print(ch2);
      }
      else
      {
        System.out.print(ch3);
      }
      
      if ((ch1 < ch2 && ch1 > ch3)||(ch1 < ch3 && ch1 > ch2))
      {
        System.out.print(ch1);
      }
      else if ((ch2 < ch1 && ch2 > ch3)||((ch2 < ch3 && ch2 > ch1)))
      {
        System.out.print(ch2);
      }
      else
      {
        System.out.print(ch3);
      }
      
      if (ch1 > ch2 && ch1 > ch3)
      {
        System.out.print(ch1);
      }
      else if (ch2 > ch1 && ch2 > ch3)
      {
        System.out.print(ch2);
      }
      else
      {
        System.out.print(ch3);
      }
    }
    else
    {
      System.out.println("Error, wrong letters!");
    }
  }
}