public class ReportAverage
{
  public static void main(String[] args)
  {
    double math = 86.5;
    double art = 83.5;
    double gym = 89.5;
    double bio = 92.5;
    double average = ((math + art + gym + bio)/4);
    System.out.printf("%s%.2f", "Your average is ", average);
  }
}