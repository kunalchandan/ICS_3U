import java.util.*;
public class ChandanKunalPractical
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    //Q1
    /*int num = 0;
    int upper = 0;
    int lowwer = 0;
    System.out.println("Enter a symbol to exit!");
    String str = input.next();
    if (str >= 48 && str <= 57)
    {
      num++;
      System.out.println("Enter a character: ");
      str= input.next();
    }
    else if (str >= 65 && str <= 90)
    {
      upper++;
      System.out.println("Enter a character: ");
      str= input.next();
    }
    else if (str >= 97 && str <= 122)
    {
      lower++;
      System.out.println("Enter a character: ");
      str= input.next();
    }
    System.out.println("Enter a character: ");
    str= input.next();
    System.out.println("There were " + upper + " upper case alphabets.");
    System.out.println("There were " + lower + " lower case alphabets.");
    System.out.println("There were " + num + " digits.");*/
    //Q2
    /*int rf , lf , rr, lr;
    System.out.println("Input right front pressure:");
    rf = input.nextInt();
    System.out.println("Input left front pressure:");
    lf = input.nextInt();
    System.out.println("Input right rear pressure:");
    rr = input.nextInt();
    System.out.println("Input left rear pressure:");
    lr = input.nextInt();
    if ((((rf - lf) > 3) || ((rf - lr) > 3)) || (((rf - rr) > 3) || ((lf - rr) > 3)))
    {
      System.out.println("Inflation is BAD!");
    }
    else
    {
      System.out.println("Inflation is Ok!");
    }*/
    //Q3
    /*int m, n, count = 0, y;
    System.out.println("Enter m:");
    m = input.nextInt();
    System.out.println("Enter n:");
    n = input.nextInt();
    for(int x = m; x < n; x++)
    {
      count = 1;
      y = 1;
      for (y = 1; y < x; y++)
      {
        if (x%y == 0)
        {
          count++;
        }
      }
      System.out.println(x + " has " + count + " Factors.");
    }*/
  }
}