import java.util.*;
public class NumberOfRepeats
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a String then a char");
    String str = input.nextLine();
    char ch = input.next().charAt(0);
    System.out.println(repeats(str, ch));
  }
  public static int repeats(String str, char ch)
  {
    int repeats = 0;
    for(int x = 0; x < str.length()-1; x++)
    {
      if (str.charAt(x) == ch)
      {
        repeats++;
      }
    }
    return repeats;
  }
}