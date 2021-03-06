import javax.swing.*;
import java.util.Random;
public class Dice 
{
  private ImageIcon imgDice;
  private Random rnd;
  private int rollValue, width, height;
  public Dice() 
  {
    imgDice = new ImageIcon("0.png");
    rnd = new Random();
    rollValue = 0;
    width = imgDice.getIconWidth();
    height = imgDice.getIconWidth();
  }
  public void roll() 
  {
    rollValue = rnd.nextInt(6) + 1;
    switch(rollValue) 
    {
      case 1: 
        imgDice = new ImageIcon("1.png");
        break;
      case 2:
        imgDice = new ImageIcon("2.png");
        break;
      case 3:
        imgDice = new ImageIcon("3.png");
        break;
      case 4:
        imgDice = new ImageIcon("4.png");
        break;
      case 5:
        imgDice = new ImageIcon("5.jpeg");
        break;
      case 6:
        imgDice = new ImageIcon("6.jpeg");
        break;
    }
  }
  public int getDiceWidth() 
  {
    width = imgDice.getIconWidth();
    return width;
  }
  public int getDiceHeight() 
  {
    height = imgDice.getIconHeight();
    return height;
  }
  public ImageIcon getDice() 
  {
    return imgDice;
  }
  public int getRollValue() 
  {
    return rollValue;
  }
}