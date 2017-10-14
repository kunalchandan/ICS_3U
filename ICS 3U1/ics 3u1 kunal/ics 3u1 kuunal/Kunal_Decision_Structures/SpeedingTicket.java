import java.util.Scanner;
public class SpeedingTicket
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    int postedSpeed;
    int yourSpeed;
    
    System.out.printf("%45s","ONTARIO SPEEDING PENALTIES");
    System.out.printf("\n\n%s","Enter the posted speed limit (km):    ");
    postedSpeed=input.nextInt();
    System.out.printf("%s","Enter your speed (km):                ");
    yourSpeed= input.nextInt();
    input.close();
    
    int speeding=yourSpeed-postedSpeed;
    
    System.out.println("-------------------------------------------------------------");
    System.out.printf("%s%s%s","Kilometres over the speed limit:        ",speeding," km/h");
    System.out.printf("\n%s","-------------------------------------------------------------");
    
    if(speeding>=1&&speeding<=19)
    {
      double fine=2.50;
      double totalFine= fine*speeding;
      System.out.printf("\n%s%30s%.2f","TOTAL FINE:","$",totalFine);
    }
    else if(speeding>=20&&speeding<=29)
    {
      double fine=3.75;
      double totalFine= fine*speeding;
      System.out.printf("\n%s%30s%.2f","TOTAL FINE:","$",totalFine);
    }
    else if(speeding>=30&&speeding<=49)
    {
      double fine=6.00;
      double totalFine= fine*speeding;
      System.out.printf("\n%s%30s%.2f","TOTAL FINE:","$",totalFine);
    }
    else if(speeding>=50)
    {
      double fine=9.75*1.25;
      double totalFine= fine*speeding;
      System.out.printf("\n%s%30s%.2f","TOTAL FINE:","$",totalFine);
    }
    
    if(speeding>=0&&speeding<=15)
    {
      int dermitPoint =0;
      System.out.printf("\n%s%27s","DERMIT POINTS:",dermitPoint);
    }
    else if(speeding>=16&&speeding<=29)
    {
      int dermitPoint =3;
      System.out.printf("\n%s%27s","DERMIT POINTS:",dermitPoint);
    }
    else if(speeding>=30&&speeding<=49)
    {
      int dermitPoint =4;
      System.out.printf("\n%s%27s","DERMIT POINTS:",dermitPoint);
    }
    else if(speeding>=50)
    {
      int dermitPoint =6;
      System.out.printf("\n%s%27s","DERMIT POINTS:",dermitPoint);
    }
  }
}