import java.awt.*;
import javax.swing.*;
public class Olympics extends JFrame
{
  public static void main(String[]args)
  {
    new Olympics();
  }
  public Olympics()
  {
    setTitle("Rio"); 
    setSize(450, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
    getContentPane().setBackground(Color.WHITE);
  }
  public void paint(Graphics g)
  {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    ImageIcon img = new ImageIcon("rio.jpeg");
    g2.drawImage(img.getImage(), 63, 20, this);
    Color gold = new Color (255, 215, 0);
    g2.setStroke(new BasicStroke(13));
    g2.setColor(Color.BLUE);
    g2.drawArc(35, 280, 120, 120, 0, 360);
    g2.setColor(gold);
    g2.drawArc(100, 340, 120, 120, 0, 360);
    g2.setColor(Color.BLACK);
    g2.drawArc(165, 280, 120, 120, 0, 360);
    g2.setColor(Color.GREEN);
    g2.drawArc(230, 340, 120, 125, 0, 360);
    g2.setColor(Color.RED);
    g2.drawArc(295, 280, 120, 120, 0, 360);
    
  }
}