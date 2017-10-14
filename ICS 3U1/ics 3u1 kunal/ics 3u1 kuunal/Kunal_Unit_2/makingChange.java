public class makingChange
{  
  public static void main(String[] args)
  {
    double change;
    change= 1.86;
    int toonies = (int)(change/2);
    int loonies = (int)(change%2/1);
    int quarters = (int)(change%2%1/0.25);
    int dimes = (int)(change%2%1%0.25/0.1);
    int nickels = (int)(change%2%1%0.25%0.1/0.05);
    int pennies = (int)(change%2%1%0.25%0.1%0.05/0.01);
    
      System.out.printf("%17s","AMOUNT OF CHANGE:    $");       
      System.out.printf("%s",change);
      System.out.printf("\n%23s","Toonies:               ");
      System.out.printf("%d",toonies);
      System.out.printf("\n%23s","Loonies:               ");
      System.out.printf("%d",loonies);
      System.out.printf("\n%22s","Quarters:              ");
      System.out.printf("%d",quarters);
      System.out.printf("\n%17s","Dimes:                 ");
      System.out.printf("%d",dimes);
      System.out.printf("\n%18s","Nickels:               ");
      System.out.printf("%d",nickels);
      System.out.printf("\n%23s","Pennies:               ");
      System.out.printf("%d",pennies);
  }
}
    