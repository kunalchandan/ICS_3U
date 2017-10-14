import java.awt.*;
import javax.swing.*;
public class Dice extends JFrame
{
  public static void main(String[]args)
  {
    new Dice(); 
  }
  public Dice()
  {
    setTitle("Dice"); 
    setSize(250, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.WHITE);
    g2.fillRoundRect(35, 80, 80, 80, 15, 15);
    g2.fillRoundRect(135, 80, 80, 80, 15, 15);
    g2.setColor(Color.BLACK);
    g2.drawRoundRect(35, 80, 80, 80, 15, 15);
    g2.drawRoundRect(135, 80, 80, 80, 15, 15);
    g2.fillArc(45, 90, 18, 18, 0, 360);
    g2.fillArc(89, 90, 18, 18, 0, 360);
    g2.fillArc(45, 135, 18, 18, 0, 360);
    g2.fillArc(89, 135, 18, 18, 0, 360);
    g2.fillArc(67, 113, 18, 18, 0, 360);
    g2.fillArc(146, 90, 18, 18, 0, 360);
    g2.fillArc(192, 135, 18, 18, 0, 360);
  }
}