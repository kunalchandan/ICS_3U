import java.util.*;
public class ThreeNumbers
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 3 numbers");
    int one = input.nextInt();
    int two = input.nextInt();
    int three = input.nextInt();
    System.out.println(sum(one, two, three));
  }
  public static int sum(int one, int two, int three)
  {
    int sum = one + two + three;
    return sum;
  }
}