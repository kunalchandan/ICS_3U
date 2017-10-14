import java.util.*;
public class ReverseWord
{
  public static void main(String[]args)
  {
    Scanner input= new Scanner(System.in);
    String str;
    System.out.println("Enter a word:");
    str = input.next();
    StringBuffer str2= new StringBuffer(str);
    str2.reverse();
    System.out.println(str2);
  }
}