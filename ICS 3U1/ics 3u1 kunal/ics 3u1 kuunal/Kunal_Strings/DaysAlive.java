import java.util.*;
public class DaysAlive
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    int yearBorn;
    int monthBorn;
    int dayBorn;
    
    int thisYear;
    int thisMonth;
    int thisDay;
    
    System.out.println("Enter your birthdate.....");
    System.out.println("YEAR;  ");
    yearBorn = input.nextInt();
    System.out.println("MONTH; ");
    monthBorn = input.nextInt();
    System.out.println("DAY;   ");
    dayBorn = input.nextInt();
    
    System.out.println("Enter today's date:");
    System.out.println("YEAR;  ");
    thisYear = input.nextInt();
    System.out.println("MONTH; ");
    thisMonth = input.nextInt();
    System.out.println("DAY;   ");
    thisDay = input.nextInt();
    
    int daysAlive = (((thisYear-yearBorn)*365)+((thisMonth-monthBorn)*30)+(thisDay-dayBorn));
    int hoursSlept = daysAlive*24/3;
    
    System.out.println("You have been alive for "+daysAlive+" days!");
    System.out.println("You have slept for "+hoursSlept+" hours!");
    
  }
}
