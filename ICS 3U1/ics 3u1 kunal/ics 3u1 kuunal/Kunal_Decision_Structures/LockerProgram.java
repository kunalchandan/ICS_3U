import java.util.*;
public class LockerProgram
{
  public static void main(String[] args)
  {
    int num1 = 15;
    int num2 = 25;
    int num3 = 15;
    
    int userNum1;
    int userNum2;
    int userNum3;
    
    Scanner input = new Scanner(System.in);
    System.out.printf("%s","Enter your locker combination...");
    System.out.printf("\n\n%s","Enter your first number: ");
    userNum1 = input.nextInt();
    System.out.printf("\n%s","Enter your second number:");
    userNum2 = input.nextInt();
    System.out.printf("\n%s","Enter your third number: ");
    userNum3 = input.nextInt();
    
    input.close();
    
    if((num1 == userNum1) && (num2 == userNum2) && (num3 == userNum3))
    {
      System.out.printf("\n%s","Congratulations! You have opened your locker!");
    }
    else
    {
      System.out.printf("\n%s","Sorry...you have entered the incorrecet combination!");
    }
  }
}
