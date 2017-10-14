import java.util.*;
import java.lang.*;
public class PrimeMethod
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    long prime = input.nextLong();
    primeNum(prime);
    if (primeNum(prime) == true)
    {
      System.out.println("It is prime");
    }
    else
    {
      System.out.println("It is not a prime");
    }
  }
  public static boolean primeNum(Long prime)
  {
    boolean result = true;
    for(int x = 2; x < Math.sqrt(prime); x++)
    {
      if (prime%x == 0)
      {
        result = false;
      }
    }
    return result;
  }
}