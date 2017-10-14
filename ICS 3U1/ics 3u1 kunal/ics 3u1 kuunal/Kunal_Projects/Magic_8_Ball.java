import java.util.*;
public class Magic_8_Ball
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    Random rnd = new Random();
    
    int num = rnd.nextInt(12);
    String[] reply = {"Outlook not so good!", "Reply hazy, try again!", "Most likely", "Without a doubt!", "Don�t count on it!", "Yes definitely!", "You can count on it!", "As I see it, yes!", "My sources say no!", "My reply is no!", "Outlook good!", "Very doubtful!"};
    String ans;
    boolean key = true;
    
    System.out.println("WELCOME TO MAGIC 8 BALL");
    while (key == true)
    {
      num = rnd.nextInt(12);
      System.out.println("Enter a question (Q to quit):");
      ans = input.next();
      if (ans.compareToIgnoreCase("q") == 0)
      {
        key = false;
        break;
      }
      System.out.println( reply[num] );
    }
    if (ans.compareToIgnoreCase("q")==0)
    {
      System.out.println("Thank you for playing! Goodbye!");
    }        
  }
}