public class MinMaxElement
{
  public static void main(String[]args)
  {
    int pointLow = 0, pointHigh = 0;
    String student[] = {"Peter", "Anthony", "Cada", "Niral", "Jonesy", "Rak"};
    int mark[] = {56,75,80,45,89,82};
    int lowest = mark[1], highest = mark[1];
    for(int x = 0; x < student.length; x++)
    {
      if(mark[x] < lowest)
      {
        lowest = mark[x];
        pointLow = x;
      }
      if(mark[x] > highest)
      {
        highest = mark[x];
        pointHigh = x;
      }
    }
    System.out.println("Highest mark - > " + highest);
    System.out.println("Obtained by - > " + student[pointHigh]);
    System.out.println("Lowest mark - > " + lowest);
    System.out.println("Obtained by - > " + student[pointLow]);
  }
}