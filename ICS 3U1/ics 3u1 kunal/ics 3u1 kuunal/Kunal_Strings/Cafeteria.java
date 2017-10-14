import java.util.*;
public class Cafeteria
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    int numBurgers;
    int numFries;
    int numPop;
    
    double burgers = 2.99;
    double fries = 1.99;
    double pop = 0.99;

    
    System.out.println("Enter the number of burgers:\t\t");
    numBurgers = input.nextInt();
    System.out.println("Enter the number of fries:\t\t");
    numFries = input.nextInt();
    System.out.println("Enter the number of pops:\t\t");
    numPop = input.nextInt();
    
    double subtotal = (numBurgers*burgers+numFries*fries+numPop*pop);
    double hst = (subtotal*0.13);
    
    System.out.printf("\n%s\t%.2f", "SUBTOTAL:", subtotal);
    System.out.printf("\n%s%4.2f", "HST:             ", hst);
    System.out.printf("\n%s%4.2f", "GRAND TOTAL:     ", subtotal + hst);
  }
}