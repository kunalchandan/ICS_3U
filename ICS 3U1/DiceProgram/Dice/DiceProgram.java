import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DiceProgram extends JFrame {
  
  private JFrame f;
  private JPanel p;
  private JButton b1;
  private JLabel lab;
  
  Dice d = new Dice();
  
  public DiceProgram() {
    gui();
  }
  
  public void gui() {
    f = new JFrame("test");
    
    f.setSize(600, 400);
    f.setResizable(false);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    p = new JPanel(new GridBagLayout());
    
    b1 = new JButton("ROLL");
    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        rollDice();
      }
    });
    
    lab = new JLabel("Click ROLL to begin!");
    JLabel dice1 = new JLabel(d.getDice());
    JLabel dice2 = new JLabel(d.getDice());
    
    GridBagConstraints c = new GridBagConstraints();
    
    c.insets = new Insets(10, -20, 10, -20);
    c.gridx = 1;
    c.gridy = 1;
    p.add(dice1, c);
    c.gridx = 100;
    c.gridy = 1;
    p.add(dice2, c);
    c.gridx = 50;
    c.gridy = 2;
    p.add(b1, c);
    c.gridx = 50;
    c.gridy = 3;
    p.add(lab, c);
    p.repaint();
    f.add(p);
    
    f.setVisible(true);
    
  }
  public void rollDice() {
    p.removeAll();
    d.roll();
    JLabel dice1 = new JLabel(d.getDice());
    int dice1Value = d.getRollValue();
    d.roll();
    JLabel dice2 = new JLabel(d.getDice());
    int dice2Value = d.getRollValue();
    int sum = dice1Value + dice2Value;
    JLabel lab = new JLabel("You rolled a " + sum);
    GridBagConstraints c = new GridBagConstraints();
    
    c.insets = new Insets(10, -20, 10, -20);
    c.gridx = 1;
    c.gridy = 1;
    p.add(dice1, c);
    c.gridx = 100;
    c.gridy = 1;
    p.add(dice2, c);
    c.gridx = 50;
    c.gridy = 2;
    p.add(b1, c);
    c.gridx = 50;
    c.gridy = 3;
    p.add(lab, c);
    
    p.revalidate();
    p.repaint();
    f.add(p);
    f.setVisible(true);
  }
  public static void main(String[] args) {
    new DiceProgram();
  }
}
