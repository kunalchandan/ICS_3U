import java.util.*;
public class Methods
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an intreger");
    int trans = input.nextInt();
    System.out.println(translate(trans));
    String str = input.next();
    int intreger = input.nextInt();
    System.out.println(find(str, intreger));
    double bang1 = input.nextInt();
    double bang2 = input.nextInt();
    double bang3 = input.nextInt();
    printAnswer(bang1, bang2, bang3);
    int brian = input.nextInt();
    System.out.println(translate(trans));
  }
  public static double translate(int trans)
  {
    double translate = trans;
    return translate;
  }
  public static int find(String str, int intreger)
  {
    int find = str.length() + intreger;
    return find;
  }
  public static void printAnswer(double one, double two, double three)
  {
    double printAnswer = one + two + three;
  }
}