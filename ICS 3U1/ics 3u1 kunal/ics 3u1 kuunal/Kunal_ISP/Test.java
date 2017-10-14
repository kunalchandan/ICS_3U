import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test extends Frame implements WindowListener,ActionListener
{
  private String str = "1.png";
  TextField text = new TextField(20);
  Button b;
  private int numClicks = 0;
  public static void main(String[] args) 
  {
    Test myWindow = new Test("Test");
    myWindow.setSize(600,600);
    myWindow.setVisible(true);
  }
  public void paint(Graphics g)
  {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    ImageIcon img = new ImageIcon(str);
    g2.drawImage(img.getImage(), 100, 100, this);
  }
  public Test(String title) 
  {
    super(title);
    setLayout(new FlowLayout());
    addWindowListener(this);
    b = new Button("Click me");
    add(b);
    add(text);
    b.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e) 
  {
    numClicks++;
    str = numClicks + ".png";
    text.setText("Button Clicked " + numClicks + " times");
  }
  public void windowClosing(WindowEvent e) 
  {
    dispose();
    System.exit(0);
  }
  public void windowOpened(WindowEvent e) {}
  public void windowActivated(WindowEvent e) {}
  public void windowIconified(WindowEvent e) {}
  public void windowDeiconified(WindowEvent e) {}
  public void windowDeactivated(WindowEvent e) {}
  public void windowClosed(WindowEvent e) {}
}