import java.io.*;
import java.util.*;
public class StarTable
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the amount of rows:");
    int rows = input.nextInt();
    System.out.println("Enter the amount of columns:");
    int columns= input.nextInt();
    input.close();
    String array[][]= new String[rows][columns];
    try
    {
      BufferedWriter bf = new BufferedWriter(new FileWriter("star.txt"));
      for(int x = 0; x < rows; x++)
      {
        for(int y = 0; y < columns; y++)
        {
          array[x][y] = "*";
          bf.write(array[x][y]);
        }
        bf.newLine();
      }
      bf.close();
    }
    catch (IOException ex)
    {
      System.out.println("");
    }
  }
}