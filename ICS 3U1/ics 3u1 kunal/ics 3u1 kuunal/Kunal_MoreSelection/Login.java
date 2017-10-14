import java.util.*;
public class Login
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    
    final int ID = 324024124;
    final int pass = 324024124;
    System.out.printf("%n%10s", "Login to some random website");
    System.out.printf("%n%s", "User ID: ");
    int inputID = input.nextInt();
    System.out.printf("%n%s", "Password: ");
    int inputPASS = input.nextInt();
    
    if((inputID == pass) && (inputPASS == ID))
    {
      System.out.println("Congratulations!! You logged in!");
    }
    else
    {
      System.out.println("Ha! you failed");
    }
  }
}