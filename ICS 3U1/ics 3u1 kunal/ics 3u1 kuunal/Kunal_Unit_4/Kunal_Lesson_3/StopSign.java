import java.awt.*;
import javax.swing.*;
public class StopSign extends JFrame
{
  public static void main(String[]args)
  {
    new StopSign(); 
  }
  public StopSign()
  {
    setTitle("Stop Sign"); 
    setSize(250, 275);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    Font stop = new Font("Calibri",Font.PLAIN, 65);
    g2.setFont(stop);
    g2.setColor(Color.RED);
    Polygon hex = new Polygon();
    hex.addPoint(75, 50);
    hex.addPoint(175, 50);
    hex.addPoint(225, 100);
    hex.addPoint(225, 200);
    hex.addPoint(175, 250);
    hex.addPoint(75, 250);
    hex.addPoint(25, 200);
    hex.addPoint(25, 100);
    g2.fillPolygon(hex);
    g2.setStroke(new BasicStroke(5));
    g2.setColor(Color.WHITE);
    hex.addPoint(75, 50);
    hex.addPoint(175, 50);
    hex.addPoint(225, 100);
    hex.addPoint(225, 200);
    hex.addPoint(175, 250);
    hex.addPoint(75, 250);
    hex.addPoint(25, 200);
    hex.addPoint(25, 100);
    g2.drawPolygon(hex);
    g2.drawString("STOP", 60, 170);
  }
}