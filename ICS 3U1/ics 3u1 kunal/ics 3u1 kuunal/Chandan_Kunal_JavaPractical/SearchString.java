import java.util.*;
public class SearchString
{
  public static void main(String[]args)
  {
    int num = 0;
    String word, search;
    Scanner in = new Scanner(System.in);
    System.out.println("Input ->");
    word = in.nextLine();
    search = in.nextLine();
    for(int x = 0; x < word.length(); x++)
    {
      if(word.substring(x,x+1).compareToIgnoreCase(search) == 0)
      {
        num++;
      }
    }
    System.out.println(search.toUpperCase() + "'s -> " + num);
  }
}