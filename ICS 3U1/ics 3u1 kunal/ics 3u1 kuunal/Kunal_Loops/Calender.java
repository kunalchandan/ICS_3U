import java.util.*;
public class Calender
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner (System.in);
    String month;
    int startDay;
    int days;
    System.out.printf ("%s%30s", "Enter the name of the month:", "");
    month = input.next();
    System.out.printf ("%s%10s", "Enter the day of the week that the month begins:", "");
    startDay = input.nextInt();
    System.out.printf ("%s%20s", "Enter the number of days in the month:", "");
    days = input.nextInt();
    
    System.out.printf ("%36s%s", month.substring(0,1).toUpperCase(), month.substring (1));
    System.out.printf ("\n%10s%10s%10s%10s%10s%10s%10s", "Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat");
    if (startDay == 1)
    {
      System.out.printf ("%10d", 1);
      for (int day = 2; day < days + 1; day++)
      {
      System.out.printf ("%10d", day);
      if (day%7 == 0)
      {
       System.out.printf ("\n"); 
      }
     }
    }
    else if (startDay == 2)
    {
      System.out.printf ("%20d", 1);
      for (int day = 2; day < days + 1; day++)
      {
       System.out.printf ("%10d", day);
       if ((day+1)%7 == 0)
       {
         System.out.printf ("\n"); 
       }
      }
    }
    else if (startDay == 3)
    {
      System.out.printf ("%30d", 1);
      for (int day = 2; day < days + 1; day++)
      {
       System.out.printf ("%10d", day);
       if ((day+2)%7 == 0)
       {
         System.out.printf ("\n"); 
       }
      }
    }
    else if (startDay == 4)
    {
      System.out.printf ("%40d", 1);
      for (int day = 2; day < days + 1; day++)
      {
       System.out.printf ("%10d", day);
       if ((day+3)%7 == 0)
       {
         System.out.printf ("\n"); 
       }
      }
    }
    else if (startDay == 5)
    {
      System.out.printf ("%50d", 1);
      for (int day = 2; day < days + 1; day++)
      {
       System.out.printf ("%10d", day);
       if ((day+4)%7 == 0)
       {
         System.out.printf ("\n"); 
       }
      }
    }
    else if (startDay == 6)
    {
      System.out.printf ("%60d", 1);
      for (int day = 2; day < days + 1; day++)
      {
       System.out.printf ("%10d", day);
       if ((day+5)%7 == 0)
       {
         System.out.printf ("\n"); 
       }
      }
    }
    else if (startDay == 7)
    {
      System.out.printf ("%70d", 1);
      for (int day = 2; day < days + 1; day++)
      {
       if ((day+5)%7 == 0)
       {
         System.out.printf ("\n"); 
       }
       System.out.printf ("%10d", day);
      }
    }
    else
    {
      System.out.print ("This does not work!");
    }
  }
}
