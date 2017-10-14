public class Countdown
{
  public static void main(String[] args)
  {
    int count = 11;
    while (count > 0)
    {
      count--;
      if (count == 10)
      {
        System.out.println("We are ready for launch in T minus " + count + "...");
      }
      if (count == 8)
      {
        System.out.println("Ignition sequence start!");
      }
      System.out.println(count + "...");
    }
    System.out.println("All engines running!");
    System.out.println("Liftoff! We have liftoff!");
  }
}