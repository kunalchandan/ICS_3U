import java.util.*;
public class ChandanKunal_SIN
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your SIN");
    int sin = input.nextInt();
    if (sin >=999999999)
    {
      System.out.println("This is an invalid SIN");
    }
    int sin1 = sin;
    int first = sin1%10;
    int second = sin1%100 - first;
    int third = sin1%1000 - first - second;
    int fourth = sin1%10000 - first - second - third;
    int fifth = sin1%100000 - first - second - third - fourth;
    int sixth = sin1%1000000 - first - second - third - fourth - fifth;
    int seventh = sin1%10000000 - first - second - third - fourth - fifth - sixth;
    int eigth = sin1%100000000 - first - second - third - fourth - fifth - sixth - seventh;
    int ninth = sin1%1000000000 - first - second - third - fourth - fifth - sixth - seventh - eigth;
    int double1 = (second + fourth + sixth + eigth)*2;
    int double2 = first + third + fifth + seventh;
    System.out.println(double1 + "     " + double2);
    int total = double1 + double2;
    System.out.println(total);
    int last = 10-(total%10);
    if (ninth == last)
    {
      System.out.println("This is valid");
    }
    else
      System.out.println("Invalid SIN");
  }
}