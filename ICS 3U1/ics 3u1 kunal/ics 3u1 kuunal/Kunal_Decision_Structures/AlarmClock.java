import java.util.*;
public class AlarmClock
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.printf("%15S", "ALARM CLOCK");
    
    System.out.printf("%n%s%n%s", "Enter the day of the week", "0 = Sunday, 1 = Monday, etc.:");
    int weekday = input.nextInt();
    
    System.out.printf("%n%s%n%s", "Are you on vacation?", "(0 = No, 1 = Yes):");
    int vacation = input.nextInt();
    boolean weekendDay;
    boolean vacationDay;
    String time;
    if(weekday == 0 || weekday == 7)
    {
      weekendDay = true; 
    }
    else
    {
      weekendDay = false;
    }
    if(vacation == 1)
    {
      vacationDay = true;
    }
    else
    {
      vacationDay = false;
    }
    
    if((vacationDay && weekendDay) == true)
    {
      time = "OFF";
      System.out.printf("%n%s%15s", "Alarm:", time);
    }
    else if((!vacationDay && weekendDay) || (vacationDay && !weekendDay))
    {
      time = "10:00 a.m.";
      System.out.printf("%n%s%20s", "Alarm:", time);
    }
    else if((!vacationDay && !weekendDay))
    {
      time = "7:00 a.m.";
      System.out.printf("%n%s%20s", "Alarm:", time);
    }
  }
}