import java.awt.*;
import javax.swing.*;
public class DominicanRepublic extends JFrame
{
  public static void main(String[]args)
  {
    new DominicanRepublic(); 
  }
  public DominicanRepublic()
  {
    setTitle("Dominican Republic"); 
    setSize(450, 450);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    Font title = new Font("Britannic Bold",Font.PLAIN, 36);
    Font header = new Font("Britannic Bold",Font.ITALIC, 30);
    Color blue = new Color(0, 41, 132);
    Color red = new Color(222, 16, 24);
    g2.setColor(Color.WHITE);
    g2.fillRect(50, 100, 350, 250);
    g2.setColor(Color.blue);
    g2.setFont(title);
    g2.drawString("Dominican Republic", 60, 70);
    g2.setFont(header);
    g2.drawString("God, Fatherland, Liberty", 60, 400);
    g2.fillRect(50, 100, 150, 100);
    g2.fillRect(250, 250, 150, 100);
    g2.setColor(Color.red);
    g2.fillRect(50, 250, 150, 100);
    g2.fillRect(250, 100, 150, 100);
    g2.setColor(Color.BLACK);
    g2.drawRect(50, 100, 350, 250);
  }
}