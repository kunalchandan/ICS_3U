import java.awt.*;
import javax.swing.*;
public class DiamondProgram extends JFrame {
  private Diamond d;
  private static int FRAME_WIDTH = 400;
  private static int FRAME_HEIGHT = 400;
  public static void main(String[] args) {
    new DiamondProgram();
  }
  public DiamondProgram() {
    d = new Diamond(FRAME_WIDTH / 2 - 150 / 2, FRAME_HEIGHT / 2 - 150 / 2, 250, 250);
    setTitle("DiamondProgram");
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setLocationRelativeTo(null);
    setVisible(true);
  }
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    d.setColor(Color.BLACK);
    d.fillDiamond(g2);
  }
}
