import java.util.Scanner;
public class StringLength
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    String str;
    
    boolean run = true;
    
    while (run == true)
    {
      System.out.println("Enter a word (Q to quit):");
      str = input.next();
      if (str.compareToIgnoreCase("q")==0)
      {
        System.out.println("GOODBYE!");
        run = false;
        input.close();
      }
      else
      {
          System.out.printf("%s%s%d%s\n", str.toUpperCase(), " is ", str.length(), " characters long!"); 
      }
    }
  }
}