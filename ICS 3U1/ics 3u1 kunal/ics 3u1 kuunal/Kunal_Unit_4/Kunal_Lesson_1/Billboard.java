import java.awt.*;
import javax.swing.*;
public class Billboard extends JFrame
{
  public static void main(String[] args)
  {
    new Billboard();
  }
  public Billboard()
  {
    setTitle("Billboard Top 10"); 
    setSize(720,540);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setVisible(true);
    getContentPane().setBackground(Color.BLACK);
  }
  public void paint(Graphics g)
  {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    Font title = new Font("Gulim",Font.BOLD, 31);
    Font header = new Font("Arial",Font.BOLD, 16);
    Font text = new Font("Calibri",Font.BOLD, 16);
    g2.setFont(title);
    g2.setColor(Color.GREEN);
    g2.drawString("Billboard Top 10", 240, 100);
    g2.setFont(header);
    g2.drawString("NUMBER", 20, 170);
    g2.drawString("SONG", 150, 170);
    g2.drawString("ARTIST", 360, 170);
    g2.setFont(text);
    g2.drawString("1                                Happy                                        Pharrell Williams", 20, 200);
    g2.drawString("2                                All of Me                                    John Legend", 20, 220);
    g2.drawString("3                                Dark Horse                                Katy Perry f. Juicy J.", 20, 240);
    g2.drawString("4                                Turn Down for What                DJ Snake and Lil Jon", 20, 260);
    g2.drawString("5                                Let it go                                     Idina Menzel", 20, 280);
    g2.drawString("6                                Fancy                                         Iggy Azalea f. Charil XCX", 20, 300);
    g2.drawString("7                                Pompeii                                     Bastille", 20, 320);
    g2.drawString("8                                Not a Bad Thing                        Justin Timberlake", 20, 340);
    g2.drawString("9                                Best Day Of My Life                  American Authors", 20, 360);
    g2.drawString("10                              Counting Stars                          OneRepublic", 20, 380);
  }
}