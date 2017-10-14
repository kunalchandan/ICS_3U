import java.awt.*;
import javax.swing.*;
public class Rectangle extends JFrame
{
  public static void main(String[]args)
  {
    new Rectangle(); 
  }
  public Rectangle()
  {
    setTitle("Rectangle"); 
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    g2.drawRect(50, 100, 200, 100);
  }
}