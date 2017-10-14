import java.util.*;
public class StarTable
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many rows do you want?");
    int rows = input.nextInt();
    System.out.println("How many coloumns do you want");
    int coloumns = input.nextInt();
    
    String [][] array = new String[rows][coloumns];
    
    for(int x = 0; x < rows; x++)
    {
      for(int y = 0; y < coloumns; y++)
      {
        array[x][y] = "*";
      }
    }
    for(int x = 0; x < rows; x++)
    {
      for(int y = 0; y < coloumns; y++)
      {
        System.out.printf("%3s" , array[x][y]);
      }
      System.out.println("");
    }
  }
}