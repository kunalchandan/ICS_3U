import java.util.Scanner;
public class CheckInt
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a Number: ");
    int num = input.nextInt();
    
    if(num %2 == 1){
      System.out.println("It is a odd number");
    }
    else
    {
      System.out.println("It is a even number");
      
      if(num < 0 ){
        System.out.println("This is a negative number");
      }
      else
      {
        System.out.println("This is a possitive number");
        
        if(num %7 == 0){
          System.out.println("This is a multiple of 7 ");
        }
        else
        {
          System.out.println("This is not a multiple of 7");
          
        }
      }
    }
  }
}
