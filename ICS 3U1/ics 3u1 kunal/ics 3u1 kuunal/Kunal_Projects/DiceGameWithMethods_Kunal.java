import java.util.*;
public class DiceGameWithMethods_Kunal
{
  public static void main(String[]args)
  {
    game();
  }
  public static void game()
  {
    Scanner input = new Scanner(System.in);
    int compDice1;
    int compDice2;
    int userDice1;
    int userDice2;
    String roll = "R";
    String again;
    int array [] = new int [4];
    boolean key = true;
    int points = points();
    int wager;
    System.out.printf("%n%15s", "DICE GAME");
    while ((key == true) && (points > 0))
    {
      array = roll();
      compDice1 = array [0];
      compDice2 = array [1];
      userDice1 = array [2];
      userDice2 = array [3];
      System.out.printf("%n%s%d%s", "You have ", points, " points.");
      System.out.printf("%n%s", "Enter points to wager (-1 to QUIT):");
      wager = input.nextInt();
      if (wager < -1)
      {
        System.out.println("You cannot wager negative points");
        wager = input.nextInt();
      }
      else if (wager == -1)
      {
        System.out.println("Thank you for playing! Goodbye!");
        key = false;
      }
      else if ((wager == 0))
      {
        System.out.println("You must wager at least one (1) point!");
      }
      else if (wager > points)
      {
        System.out.printf("%n%s%d%s", "You must enter a wager less than or equal to ", points, "!");
      }
      while ((wager <= points) && (wager > 0))
      {
        System.out.printf("%n%s%d%s%d%s", "You rolled a [", userDice1, "][", userDice2, "]");
        System.out.printf("%n%s%d%s%d%s", "Computer rolled a [", compDice1, "][", compDice2, "]");
        if ((compDice1 + compDice2) > (userDice1 + userDice2))
        {
          System.out.println();
          System.out.println("You lose " + wager + " points!");
          points-=wager;
          break;
        }
        else if ((compDice1 + compDice2) == (userDice1 + userDice2))
        {
          System.out.println();
          System.out.println("It's a tie!");
          reRoll();
          array = roll();
          compDice1 = array [0];
          compDice2 = array [1];
          userDice1 = array [2];
          userDice2 = array [3];
          while (roll.compareToIgnoreCase("r") != 0)
          {
            reRoll();
          }
        }
        else if ((compDice1 + compDice2) < (userDice1 + userDice2))
        {
          System.out.println();
          System.out.println("You win " + wager + " points!");
          points+=wager;
          break;
        }
      }      
      if (points == 0)
      {
        System.out.println("GAME OVER! You have zero points left!");
        System.out.println("Would you like to play again (Y or N)?");
        again = input.next();
        if (again.compareToIgnoreCase("n") == 0)
        {
          System.out.println("Thank you for playing! Goodbye!");
        }
        else if (again.compareToIgnoreCase("y") == 0)
        {
          points = points();
        }
        while ((again.compareToIgnoreCase("n") != 0) && (again.compareToIgnoreCase("y") != 0))
        {
          System.out.println("Wrong input, Please retry (Y or N).");
          again = input.next();
        }
        if  (again.compareToIgnoreCase("y") == 0)
        {
          points = points();
        }
      }
    }
  }
  public static int points()
  {
    int points = 5002;
    return points;
  }
  public static int[] roll()
  {
    int[] array = new int[4];
    for(int x=0; x<4; x++)
    {
      array[x] = (int)(Math.random() * 6 + 1);
    }
    return array;
  }
  public static void reRoll()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 'R' to roll again:");
    String roll = input.next();
  }
}