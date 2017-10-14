import java.util.*;
public class Hangman_Kunal
{
  public static void main(String[]args)
  {
    Scanner input = new Scanner(System.in);
    Random rnd = new Random();
    String[] topic = {"Games","Books","Movies","Songs","Animals","Celebrities","Programming Languages","Languages","Anime","10"};
    String[][] answers = {
      //Games
      {"Far Cry", "Street Fighter", "Uncharted", "Dawn of War", "This War of Mine", "Rogue Legacy", "SUPERHOT", "Sins of a Solar Empire", "Call of Duty", "Grand Theft Auto"},
      //Books
      {"Moby Dick", "To Kill a Mockingbird", "Hamlet", "War and Peace", "The Odyssey", "The Great Gatsby", "The Adventures of Huckleberry Finn", "Alices Adventures in Wonderland", "The Catcher in the Rye", "Gulliver's Travels"},
      // Movies
      {"Schindlers List", "The Wizard of Oz", "The Godfather", "Star Wars A New Hope", "Amadeus", "The Lord of the Rings", "Rocky", "Jaws", "Good Will Hunting", "The Maltese Falcon"},
      //Songs
      {"Single Ladies", "Somebody To Love", "Sympathy for the Devil", "Stand By Me", "Stairway To Heaven", "Working Class Hero", "Imagine", "Losing My Religion", "Cry Me a River", "All You Need Is Love"},
      //Animals
      {"Alligator", "Bear", "Seahorse", "Raccoon", "Monitor Lizard", "Monkey", "Octopus", "Jellyfish", "Kangaroo", "Cheetah"},
      //Celebrities
      {"Oprah Winfrey", "Megan Fox", "Robert Downey Jr", "Kristen Stewart", "Will Smith", "Shakira", "Selena Gomez", "Miley Cyrus", "Madonna", "Brad Pitt"},
      //Programming Languages
      {"Java", "Python", "Ruby", "JavaScript", "Janus", "Basic", "HTML", "PHP", "ALGOL", "Visual Basic"},
      //Languages
      {"English", "Arabic", "American Sign Language", "Mandarin", "Korean", "Japanese", "Hindi", "Spanish", "Latin", "French"},
      //Anime
      {"Steins Gate", "Naruto", "Sword Art Online", "Ergo Proxy", "Sailor Moon", "One Piece", "Deadman Wonderland", "Neon Genesis Evangelion", "Fullmetal Alchemist", "Cowboy Beebop"},
      //Body Parts
      {"skin", "eye", "nose", "leg", "back", "neck", "finger", "fist", "shoulder", "elbow"}
    };
    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String ahpla = "";
    String guessWord = "";
    String a;
    int numTopic = rnd.nextInt(10);
    int numAns = rnd.nextInt(10);
    int wrong = 6;
    String guess;
    String play;
    boolean key = true;
    for(int x = 0; x < (answers[numTopic][numAns].length()); x++)
    {
      if((answers[numTopic][numAns].substring(x,x+1).compareToIgnoreCase(" ") == 0))
      {
        guessWord += " ";
      }
      else
      {
        guessWord += "-";
      }
    }
    System.out.printf("%40s", "WELCOME TO HANGMAN!");
    System.out.println("");
    System.out.println("");
    while (key == true)
    {
      System.out.println("============================================================================");
      System.out.printf("%s%40s", "Topic:", topic[numTopic]);
      System.out.printf("\n%s%33s", "Secret Word:", guessWord);
      System.out.println("");
      System.out.printf("%s%53s","Letters Remaining:", alpha);
      System.out.printf("\n%s%53s","Letters Used:", ahpla);
      System.out.printf("\n%s%30d","Guesses Remaining:", wrong);
      System.out.println("");
      System.out.println("============================================================================");
      System.out.println("Enter a letter (! to guess entire word):");
      guess = input.nextLine();
      while(guess.compareToIgnoreCase("") == 0)
      {
        guess = input.nextLine();
      }
      for(int x = 0; x < (answers[numTopic][numAns].length()); x++)
      {
        if(guess.compareToIgnoreCase(answers[numTopic][numAns].substring(x,x+1)) == 0)
        {
          guessWord = guessWord.substring(0,x) + (answers[numTopic][numAns]).substring(x,x+1) + guessWord.substring(x+1,answers[numTopic][numAns].length());
        }
      }
      if (guess.compareTo("!") != 0) //code for guesses
      {
        a = guess.substring(0,1);
        boolean thing = false;
        for (int x = 0; x < (answers[numTopic][numAns]).length(); x++)
        {
          if(a.compareToIgnoreCase(answers[numTopic][numAns].substring(x,x+1)) == 0)
          {
            thing = true;
          }
        }
        if(thing == false)
        {
          wrong--;
          System.out.println("The letter " + a.toUpperCase() + " is not in the word");
        }
        for(int x = 0; x < (ahpla.length()); x++) //compare to see if the guess is part of guessed letters
        {
          if (a.compareToIgnoreCase(ahpla.substring(x,x+1)) == 0)
          {
            System.out.println(a.toUpperCase() + " has already been used!");
          }
        }
        for(int x = 0; x < (alpha.length()); x++) //compare to see if the guess is in the word
        {
          if (a.compareToIgnoreCase(alpha.substring(x,x+1)) == 0)
          {
            alpha = alpha.substring(0,x) + alpha.substring(x+1, alpha.length());
            ahpla = ahpla + a.toUpperCase(); // places letter into the word
          }
        }
      }
      else //If they pick !
      {
        System.out.println("Enter the secret word:");
        guess = input.nextLine();
        if(guess.compareToIgnoreCase(answers[numTopic][numAns]) == 0)
        {
          System.out.println("Congratulations..." + answers[numTopic][numAns] + " is correct!");
        }
        else
        {
          System.out.println(guess.toUpperCase() + " is incorrect!  The correct answer was " + answers[numTopic][numAns] + "!");
        }
        System.out.printf("\n\n%s", "Would you like to play again(Y or N)?");
        play = input.nextLine();
        if(play.compareToIgnoreCase("n") == 0)
        {
          key = false;
        }
        else
        {
          guessWord = "";
          ahpla = "";
          alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          wrong = 6;
          numTopic = rnd.nextInt(10);
          numAns = rnd.nextInt(10);
          for(int x = 0; x < (answers[numTopic][numAns].length()); x++)
          {
            if((answers[numTopic][numAns].substring(x,x+1).compareToIgnoreCase(" ") == 0))
            {
              guessWord += " ";
            }
            else
            {
              guessWord += "-";
            }
          }
        }
      }
      if(guessWord.compareToIgnoreCase(answers[numTopic][numAns]) == 0)
      {
        guessWord = "";
        guess = "";
        System.out.println("Congratulations..." + answers[numTopic][numAns] + " is correct!");
        System.out.printf("\n\n%s", "Would you like to play again(Y or N)?");
        play = input.nextLine();
        if(play.compareToIgnoreCase("n") == 0)
        {
          key = false;
        }
        else
        {
          wrong = 6;
          numTopic = rnd.nextInt(10);
          numAns = rnd.nextInt(10);
          for(int x = 0; x < (answers[numTopic][numAns].length()); x++)
          {
            if((answers[numTopic][numAns].substring(x,x+1).compareToIgnoreCase(" ") == 0))
            {
              guessWord += " ";
            }
            else
            {
              guessWord += "-";
            }
          }
          ahpla = "";
          alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
      }
      if (wrong == 0)
      {
        System.out.println("");
        System.out.println("GAME OVER!  The secret word was " + answers[numTopic][numAns] + "!");
        System.out.printf("\n\n%s", "Would you like to play again(Y or N)?");
        play = input.nextLine();
        if(play.compareToIgnoreCase("n") == 0)
        {
          key = false;
        }
        else
        {
          wrong = 6;
          numTopic = rnd.nextInt(10);
          numAns = rnd.nextInt(10);
          guessWord = "";
          for(int x = 0; x < (answers[numTopic][numAns].length()); x++)
          {
            if((answers[numTopic][numAns].substring(x,x+1).compareToIgnoreCase(" ") == 0))
            {
              guessWord += " ";
            }
            else
            {
              guessWord += "-";
            }
          }
          ahpla = "";
          alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
      }
    }
  }
}