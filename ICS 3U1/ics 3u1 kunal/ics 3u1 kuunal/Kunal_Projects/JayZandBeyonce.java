import java.util.*;
public class JayZandBeyonce
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    final double platinum = 150.00;
    final double gold = 120.50;
    final double red = 80.75;
    final double green = 50.25;
    final double service = 12.50;
    int platinumTicks;
    int goldTicks;
    int redTicks;
    int greenTicks;
    String name;
    
    System.out.printf("%n%n%26s", "Jay Z and Beyoncé");
    System.out.printf("%n%25s", "On the Run Tour");
    System.out.printf("%n%s%25s", "SECTION", "PRICE");
    System.out.printf("%n%s%19s%.2f", "Platinum", "$", platinum);
    System.out.printf("%n%s%23s%.2f", "Gold", "$", gold);
    System.out.printf("%n%s%25s%.2f", "Red", "$", red);
    System.out.printf("%n%s%23s%.2f", "Green", "$", green);
    System.out.printf("%n%s", "----------------------------------");
    
    System.out.printf("%n%s", "Enter number of Platinum tickets:");
    platinumTicks = input.nextInt();
    System.out.printf("%s", "Enter number of Gold tickets:");
    goldTicks = input.nextInt();
    System.out.printf("%s", "Enter number of Red tickets:");
    redTicks = input.nextInt();
    System.out.printf("%s", "Enter number of Green tickets:");
    greenTicks = input.nextInt();
    System.out.printf("%n%s", "----------------------------------");
    
    double subtotal = ((platinumTicks * platinum) + (goldTicks * gold) + (redTicks * red) + (greenTicks * green));
    double hst = (subtotal * .13);
    double serviceFees = ((platinumTicks + goldTicks + redTicks + greenTicks)*service);
    double total = (subtotal + hst + serviceFees);
    
    System.out.printf("%n%s%19s%.2f", "SUBTOTAL:", "$", subtotal);
    System.out.printf("%n%s%24s%.2f", "HST:", "$", hst);
    System.out.printf("%n%s%15s%.2f", "SERVICE FEES:", "$", serviceFees);
    System.out.printf("%n%s%21s%.2f", "TOTAL:", "$", total);
    System.out.printf("%n%s", "----------------------------------");
    
    System.out.printf("%n%s%n", "How will you be paying?");
    System.out.printf("%n%s","1 - VISA");
    System.out.printf("%n%s","2 - MasterCard");
    System.out.printf("%n%s","3 - American Express");
    System.out.printf("%n%n%s","Enter the payment method:");
    input.nextInt();
    System.out.printf("%n%s","Enter your name:");
    name = input.next();
    System.out.printf("%n%s","Enter the 16-digit number:");
    input.nextLong();
    System.out.printf("%n%s","Enter the expiry date (mmyyyy):");
    input.nextInt();
    System.out.printf("%n%s%s%s","Thank you ", name, "! Your order has been processed!");
    
  }
}