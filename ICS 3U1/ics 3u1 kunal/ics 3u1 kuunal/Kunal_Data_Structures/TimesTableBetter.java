import java.util.*;
public class TimesTableBetter
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many rows do you want?");
    int rows = input.nextInt();
    System.out.println("How many coloumns do you want");
    int coloumns = input.nextInt();
    
    int [][] array = new int[rows][coloumns];
    System.out.printf("     ");
    for(int y = 1; y < (coloumns+1); y++)
    {
      System.out.printf("%5d", y);
    }
    System.out.println("     ");
    System.out.print("    =");
    for(int y = 1; y < (coloumns+1); y++)
    {
      System.out.printf("%s", "=====");
    }
    for(int x = 0; x < rows; x++)
    {
      for(int y = 0; y < coloumns; y++)
      {
        array[x][y] = ((x+1)*(y+1));
      }
    }
    for(int x = 0; x < rows; x++)
    {
      System.out.printf("%n%3d%s", (x+1), "||");
      for(int y = 0; y < coloumns; y++)
      {
        System.out.printf("%5s" , array[x][y]);
      }
    }
  }
}