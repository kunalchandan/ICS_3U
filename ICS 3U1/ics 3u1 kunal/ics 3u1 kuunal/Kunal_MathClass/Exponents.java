import java.util.*;
import java.lang.*;
public class Exponents
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner(System.in);
    int b = input.nextInt();
    int e = input.nextInt();
    int x = (int)(Math.pow(b,e));
    System.out.println(x);
  }
}