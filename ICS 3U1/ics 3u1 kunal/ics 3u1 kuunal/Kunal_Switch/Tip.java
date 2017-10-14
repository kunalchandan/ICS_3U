import java.util.*;
public class Tip 
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your Computer Science mark(A, B, C, D, F)?");
    char mark = input.next().charAt(0);
    switch(mark)
    {
      case 'a': case 'A':
        System.out.println("Much nice, such approve.");
        break;
      case 'b': case 'B':
        System.out.println("Much average, little approve");
        break;
      case 'c': case 'C':
        System.out.println("Much bad, no approve");
        break;
      case 'd': case 'D':
        System.out.println("Such fail, much poor");
        break;
      case 'f': case 'F':
        System.out.println("such dissappoint, so fail");
        break;
      default:
        System.out.println("Invalid input!");
    }
  }
}