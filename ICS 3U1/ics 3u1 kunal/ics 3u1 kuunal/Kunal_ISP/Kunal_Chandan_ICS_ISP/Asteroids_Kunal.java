import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.io.*;

public class Asteroids_Kunal extends JFrame 
{
  private java.util.Timer timer;
  private boolean isRunning = true;//Timer\counter
  Random ran = new Random();
  boolean first = true, displayLeaderboards = false;
  int highscore = 0;
  int health = 4;
  int rand;
  int aster[][] = new int[1000][7];
  int bullets[][] = new int[10000][5];
  int totalAsteroids = 1000;
  int fired = 0;
  int x = 400, y = 400, height = y + 92, width = x + 85, wid = 85, len = 92, direction = 1; //spaceship intregers
  ImageIcon gif = new ImageIcon("explosion.gif");
  ImageIcon img = new ImageIcon("spaceshipUp.png");
  ImageIcon ast0 = new ImageIcon("asteroid0.png");
  ImageIcon ast1 = new ImageIcon("asteroid1.png");
  ImageIcon ast2 = new ImageIcon("asteroid2.png");
  ImageIcon bulletUp = new ImageIcon("bulletUp.png");
  ImageIcon bulletRight = new ImageIcon("bulletRight.png");
  ImageIcon bulletLeft = new ImageIcon("bulletLeft.png");
  ImageIcon bulletDown = new ImageIcon("bulletDown.png");
  ImageIcon healthBar = new ImageIcon("4.png");
  long start = (System.currentTimeMillis() / 100);
  long time = (System.currentTimeMillis() / 1000) - (start/10);
  int move = (int)((System.currentTimeMillis() / 100) - start);
  
  public Asteroids_Kunal()
  {
    getContentPane().setBackground(Color.BLACK);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(new Dimension(1360, 700));
    setResizable(false);
    setVisible(true);
    
    asteroids();
    addKeyListener(new KeyAdapter() 
                     {
      public void keyPressed(KeyEvent evt) 
      {
        pressed(evt);
      }
      public void keyReleased(KeyEvent evt)
      {
        released(evt);
      }
    });
    
    timer = new java.util.Timer();
    timer.schedule(new LoopyStuff(), 0, 1000 / 60); //new timer at 60 fps, the timing mechanism
  }
  
  private class LoopyStuff extends java.util.TimerTask
  {
    public void run() //this becomes the loop
    {
      update();
      repaint();
      
      if (!isRunning)
      {
        timer.cancel();
      }
    }
  }
  
  public void update() // updates every value including positions 
  {
    time = (System.currentTimeMillis() / 1000) - (start/10);
    move = (int)((System.currentTimeMillis() / 100) - start);
    
    if(y + wid < 700 && down)
    {
      y += 10;
      img = new ImageIcon("spaceshipDown.png");
      height = y + 92;
      width = x + 85;
      direction = 0;
    }
    if (y > 0 && up)
    {
      y -= 10;
      img = new ImageIcon("spaceshipUp.png");
      height = y + 92;
      width = x + 85;
      direction = 1;
    }
    if (x > 0 && left)
    {
      x -= 10;
      img = new ImageIcon("spaceshipLeft.png");
      height = y + 85;
      width = x + 92;
      direction = 2;
    }
    if (x + len < 1360 && right)
    {
      x += 10;
      img = new ImageIcon("spaceshipRight.png");
      height = y + 85;
      width = x + 92;
      direction = 3;
    }
    if (space)
    {
      fired++;
      shoot();
    }
    for(int i = 0; i < totalAsteroids; i++) //Asteroid mover
    {
      aster[i][1] = aster[i][6] + move * 2;
      aster[i][2] = aster[i][0] + 32;
      aster[i][3] = aster[i][1] + 33;
    }
    for(int i = 0; i < fired; i++) //Bullet mover
    {
      if(bullets[i][4] == 0)
      {
        bullets[i][1] += 15;
      }
      else if(bullets[i][4] == 1)
      {
        bullets[i][1] -= 15;
      }
      else if(bullets[i][4] == 2)
      {
        bullets[i][0] -= 15;
      }
      else if(bullets[i][4] == 3)
      {
        bullets[i][0] += 15;
      }
    }
    bulletCollider();
    collision();
    repaint();
  }
  
  public void paint(Graphics g) //paints everything
  {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    g2.drawImage(img.getImage(), x, y, this);
    Font title = new Font("Calibri",Font.PLAIN, 20);
    g2.setColor(Color.WHITE);
    g2.setFont(title);
    g2.drawString("You've lasted " + time + " seconds", 60, 70);
    for(int i = 0; i < fired; i++) // bullet painter
    {
      if(bullets[i][4] == 0)
      {
        g2.drawImage(bulletDown.getImage(), bullets[i][0], bullets[i][1], this);
      }
      else if(bullets[i][4] == 1)
      {
        g2.drawImage(bulletUp.getImage(), bullets[i][0], bullets[i][1], this);
      }
      else if(bullets[i][4] == 2)
      {
        g2.drawImage(bulletLeft.getImage(), bullets[i][0], bullets[i][1], this);
      }
      else if(bullets[i][4] == 3)
      {
        g2.drawImage(bulletRight.getImage(), bullets[i][0], bullets[i][1], this);
      }
    }
    for(int i = 0; i < totalAsteroids; i++) // asteroid painter
    {
      if(i%3 == 0)
      {
        g2.drawImage(ast0.getImage(), aster[i][0], aster[i][1], this);
      }
      if(i%3 == 1)
      {
        g2.drawImage(ast1.getImage(), aster[i][0], aster[i][1], this);
      }
      if(i%3 == 2)
      {
        g2.drawImage(ast2.getImage(), aster[i][0], aster[i][1], this);
      }
    }
    g2.drawImage(healthBar.getImage(), 1200, 50, this); //draw health bar
    if (displayLeaderboards == true)
    {
      g2.setColor(Color.BLUE);
      g2.fillRect(0, 0, 2000, 2000);
      g2.setColor(Color.WHITE);
      try// read highscores
      {
        FileReader fr = new FileReader("Highscores.txt"); 
        BufferedReader br = new BufferedReader(fr); 
        String s;
        int llen = 300;
        while((s = br.readLine()) != null) 
        {
          g2.drawString(s, 500 , llen);
          llen += 15;
        } 
        fr.close(); 
      }
      catch (Exception ex)
      {
        g2.drawString("ABC",100,100);
      }
    }
  }
  
  public void bulletCollider()//checks if the bullets have collided
  {
    for(int i = 0; i < totalAsteroids; i++)
    {
      for(int o = 0; o < fired; o++)
      {
        if (((bullets[o][0] >= aster[i][0]) && ((bullets[o][0] + 10 <= aster[i][2]))) && ((bullets[o][1] >= aster[i][1]) && (bullets[o][1] + 10 <= aster[i][3])))
        {
          aster[i][0] = 100000;
          aster[i][1] = 100000;
          aster[i][2] = 100000;
          aster[i][3] = 100000;
          aster[i][4] = 100000;
          aster[i][5] = 100000;
          aster[i][6] = 100000; // moves asteroid and bullets to oblivion
          bullets[o][0] = 100000;
          bullets[o][1] = 100000;
          bullets[o][2] = 100000;
          bullets[o][3] = 100000;
          bullets[o][4] = 100000;
          highscore++;// adds to highscore if you shoot the asteroid
        }
      }
    }
  }
  
  public void collision()// checks collision with the asteroid and ship
  {
    try
    {
      FileWriter fw = new FileWriter("Highscores.txt", true);
      for(int i = 0; i < totalAsteroids; i++)
      {
        if (((x <= aster[i][0]) && ((width >= aster[i][2]))) && ((y <= aster[i][1]) && (height >= aster[i][3])))
        {
          health --;
          healthBar = new ImageIcon(health + ".png");
          JOptionPane.showMessageDialog(null, "You Crashed, You lost 1 health");
          aster[i][0] = 100000;
          aster[i][1] = 100000;
          aster[i][2] = 100000;
          aster[i][3] = 100000;
          aster[i][4] = 100000;
          aster[i][5] = 100000;
          aster[i][6] = 100000;// moves asteroid to oblivion
          highscore++;
          right = false;//stops you
          left = false;
          up = false;
          down = false;
          space = false;
          if(health == 00)
          {
            isRunning = false;
            JOptionPane.showMessageDialog(this, "You Crashed and Died", "You Lost", JOptionPane.INFORMATION_MESSAGE, gif);
            String name = JOptionPane.showInputDialog(null, "Enter your name for your highscore on the leaderboards");
            highscore = highscore * move;
            fw.write("");
            if(first == true)
            {
              fw.write("Highscores\n");
              fw.write("\n " + name + "....." + highscore);//writes your score to the text file
            }
            else if (first == false)
            {
              fw.write("\n" + name + "....." + highscore);
            }
            fw.flush();
            int restart = JOptionPane.showConfirmDialog(null, "Would you like to restart?", "Restart?", JOptionPane.YES_NO_OPTION);
            if(restart == JOptionPane.YES_OPTION)// if you chose to restart
            {
              reset();
              isRunning = true;
              first = false;
            }
            else
            {
              fw.close();
              repaint();
              displayLeaderboards = true;
            }
          }
        }
      }
    }
    catch (IOException ex)
    {
    }
  }
  
  public void shoot() // shoots bullets
  {
    switch (direction) //checks your direction
    {
      case 0:
        bullets[fired][0] = x + (85/2) - 4;
        bullets[fired][1] = y + 90;
        bullets[fired][4] = 0;
        break;
      case 1:
        bullets[fired][0] = x + (85/2) - 5;
        bullets[fired][1] = y;
        bullets[fired][4] = 1;
        break;
      case 2:
        bullets[fired][0] = x ;
        bullets[fired][1] = y + (85/2) - 5;
        bullets[fired][4] = 2;
        break;
      case 3:
        bullets[fired][0] = x + 92;
        bullets[fired][1] = y + (85/2) - 5;
        bullets[fired][4] = 3;
        break;
    }
    repaint();
  }
  
  public void asteroids()
  {
    for(int i = 0; i < totalAsteroids; i++)
    {
      rand = ran.nextInt(1360) + 20;//x pos of asteroids
      aster[i][0] = rand;
      aster[i][2] = rand + 33;
      aster[i][3] = rand + 32;
    }
    for(int i = 0; i < totalAsteroids; i++) //y pos of asteroids 
    {
      rand = (ran.nextInt(10000) + 50)*-1;
      aster[i][1] = rand;
      aster[i][6] = rand;
    }
  }
  
  public void reset()
  {
    highscore = 0;
    health = 4;
    fired = 0;
    x = 400;
    y = 400;
    height = y + 92;
    width = x + 85;
    direction = 1;
    healthBar = new ImageIcon("4.png");
    start = (System.currentTimeMillis() / 100);
    time = (System.currentTimeMillis() / 1000) - (start/10);
    move = (int)((System.currentTimeMillis() / 100) - start);
    asteroids();
  }
  
  boolean left = false, right = false, up = false, down = false, space = false;
  
  public void pressed(KeyEvent evt) //checks key pressed, makes true if pressed 
  {
    switch (evt.getKeyCode()) 
    {
      case KeyEvent.VK_DOWN:
        down = true;
        break;
      case KeyEvent.VK_UP:
        up = true;
        break;
      case KeyEvent.VK_LEFT:
        left = true;
        break;
      case KeyEvent.VK_RIGHT:
        right = true;
        break;
      case KeyEvent.VK_SPACE:
        space = true;
        break;
    }
  }
  
  public void released(KeyEvent evt) //checks key released, makes false if released 
  {
    switch (evt.getKeyCode()) 
    {
      case KeyEvent.VK_DOWN:
        down = false;
        break;
      case KeyEvent.VK_UP:
        up = false;
        break;
      case KeyEvent.VK_LEFT:
        left = false;
        break;
      case KeyEvent.VK_RIGHT:
        right = false;
        break;
      case KeyEvent.VK_SPACE:
        space = false;
        break;
    }
  }
  
  public static void main(String[] args) //main method
  {
    new Asteroids_Kunal();
  }
}