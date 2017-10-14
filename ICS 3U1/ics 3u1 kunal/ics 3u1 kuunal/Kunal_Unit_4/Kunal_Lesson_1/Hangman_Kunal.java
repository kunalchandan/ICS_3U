import java.util.*;
public class Hangman_Kunal
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    Random rnd = new Random();
    String[] topic = {"1","2","3","4","5","6","7","8","9","10"};
    String[][] answers = {
      {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
      {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
      {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
      {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
      {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
      {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
      {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
      {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
      {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"},
      {"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
    };
    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int numTopic = rnd.nextInt(10);
    int numAns = rnd.nextInt(10);
    System.out.printf("%40s", "WELCOME TO HANGMAN!");
    System.out.println("");
    System.out.println("");
    System.out.println("============================================================================");
    System.out.printf("%s%40s", "Topic:", topic[numTopic]);
    System.out.printf("\n%s%33s", "Secret Word:", " ");
    for(int x = 0; x < (answers[numTopic][numAns].length()); x++)
    {
      if((answers[numTopic][numAns].substring(x,x+1).compareToIgnoreCase(" ") == 0))
      {
        System.out.print(" ");
      }
      else
      {
        System.out.printf("-");
      }
    }
    System.out.println("");
    System.out.printf("%s%53s","Letters Remaining:", alpha);
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
}