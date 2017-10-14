class PayrollProgram
{  
  public static void main ( String[] args )  
  {
    long   hoursWorked = ;    
    double payRate     = 10.0;
    double taxRate = 0.10;    
    System.out.println("Hours Worked: " + hoursWorked );
    System.out.println("pay Amount  : " + (hoursWorked * payRate) );
    System.out.println("tax Amount  : " + (hoursWorked * payRate * taxRate) );
  }
}