import java.util.*;
public class Marks
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    String[] name;
    name = new String[4];
    int[] marks;
    marks = new int[4];
    boolean thing = false;
    
    for(int i = 0; i < 4; i++)
    {
      System.out.println("what is your name");
      name[i] = input.next();
      System.out.println("what is your mark");
      marks[i] = input.nextInt();
    }
    
    System.out.println("what is the mark you're looking for?");
    int look = input.nextInt();
    
    for(int i = 0; i < 4; i++)
    {
      if (look == marks[i])
      {
        System.out.println("The person with an " + look + " is " + name[i]);
        thing = true;
      }
    }
    if (thing == false)
    {
      System.out.println("There is nobody with this mark.");
    }
  }
}