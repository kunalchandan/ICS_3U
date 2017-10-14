import java.util.*;
public class Salary
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many sales did you make this month?");
    int sales = input.nextInt();
    int base = 1000;
    double totalMoney = ((double)sales*base)/100 + base;
    System.out.printf("%n%s%.2f", "Your salary for this month is $", totalMoney);
  }
}