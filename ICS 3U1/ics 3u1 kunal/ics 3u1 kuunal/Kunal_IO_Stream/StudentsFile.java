import java.io.*;
import java.util.*;
public class StudentsFile
{
  public static void main(String[]args)
  {
    int array[][] = new int[10][5];
    
    try
    {
      BufferedWriter bf = new BufferedWriter(new FileWriter("result.txt"));
      BufferedReader in = new BufferedReader(new FileReader("marks.txt"));
      String temp[][] = new String[10][5];
      String a;
      double average = 0;
      double high = 0;
      bf.write("Averages of Students");
      bf.newLine();
      for(int x = 0; x < 10; x++)
      {
        average = 0;
        a = in.readLine();
        temp[x] = a.split(" ");
        for(int y = 0; y < 5; y++)
        {
          array[x][y] = Integer.parseInt(temp[x][y]);
          average += array[x][y];
        }
        average = average/5;
        bf.write(average + "");
        bf.newLine();
        while(average > high)
        {
          high = average;
        }
      }
      bf.newLine();
      bf.write("Highest Average");
      bf.newLine();
      bf.write(high+"");
      bf.newLine(); 
      bf.write("Test Averages");
      bf.newLine();
      for(int y = 0; y < 5; y++)
      {
        average = 0;
        for(int x = 0; x < 10; x++)
        {
          average += array[x][y];
        }
        average = average/10;
        bf.newLine();
        bf.write(average + "");
      }
      bf.close();
    }
    catch (IOException ex)
    {
      System.out.println("Bad input");
    }
  }
}