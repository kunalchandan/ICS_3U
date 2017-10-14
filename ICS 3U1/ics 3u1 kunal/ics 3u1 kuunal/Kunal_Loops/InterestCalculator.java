import java.util.*;
public class InterestCalculator
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double principal;
    System.out.printf("Please enter the starting balance:");
    principal = input.nextDouble();
    
    int startYear;
    System.out.printf("Please enter the current year:    ");
    startYear = input.nextInt();
    
    int endYear;
    System.out.printf("Please enter the ending year:     ");
    endYear = input.nextInt();
    
    double interestRate;
    System.out.printf("Please enter the interest rate:   ");
    interestRate = input.nextDouble();
    
    System.out.printf("%s%20s%f", "OPENING BALANCE", "$", principal);
    System.out.printf("%n%s", "----------------------------------------------");
    
    while(startYear < endYear)
    {
      double interest = principal * interestRate;
      principal += interest;
      System.out.printf("%n%d%s%35s%.2f", startYear, ":", "$", principal);
      startYear++;
    }
  }
}