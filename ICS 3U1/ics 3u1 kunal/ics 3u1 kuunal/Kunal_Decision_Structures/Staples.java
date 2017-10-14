import java.util.Scanner;
public class Staples
{
  public static void main(String[] args)
  {
    System.out.printf("%s","****************************************");
    System.out.printf("\n\n%35s","STAPLE'S COPY AND PRINT SERVICES");
    System.out.printf("\n\n%s","****************************************");
    System.out.printf("\n\n%s%23s","COPIES","COST");
    
    System.out.printf("\n%s%33s","1 - 99","$0.30 per copy");
    System.out.printf("\n%s%30s","100 - 499","$0.28 per copy");
    System.out.printf("\n%s%30s","500 - 749","$0.27 per copy");
    System.out.printf("\n%s%29s","750 - 1000","$0.26 per copy");
    System.out.printf("\n%s%33s","> 1000","$0.26 per copy");
    
    int copies;
    System.out.printf("\n\n%s","Enter number of copies:");  
    Scanner input= new Scanner(System.in);
    copies=input.nextInt();
    input.close();
    
    if( copies>=1 && copies<=99)
    {
      double price=0.30;
      System.out.printf("\n%s%s%s%.2f%s","PRICE PER COPY:          ",copies," @ $",price,"/copy");
      double cost=price*copies;
      System.out.printf("\n%s%15s%.2f","TOTAL COST:","$",cost);
    }
    else if( copies>=100 && copies<=499)
    {
      double price=0.28;
      System.out.printf("\n%s%s%s%.2f%s","PRICE PER COPY:          ",copies," @ $",price,"/copy");
      double cost=price*copies;
      System.out.printf("\n%s%15s%.2f","TOTAL COST:","$",cost);
    }
    else if( copies>=500 && copies<=749)
    {
      double price=0.27;
      System.out.printf("\n%s%s%s%.2f%s","PRICE PER COPY:          ",copies," @ $",price,"/copy");
      double cost=price*copies;
      System.out.printf("\n%s%15s%.2f","TOTAL COST:","$",cost);
    }
    else if( copies>=750 && copies<=1000)
    {
      double price=0.26;
      System.out.printf("\n%s%s%s%.2f%s","PRICE PER COPY:          ",copies," @ $",price,"/copy");
      double cost=price*copies;
      System.out.printf("\n%s%15s%.2f","TOTAL COST:","$",cost);
    }
    else if( copies>1000)
    {
      double price=0.25;
      System.out.printf("\n%s%s%s%.2f%s","PRICE PER COPY:          ",copies," @ $",price,"/copy");
      double cost=price*copies;
      System.out.printf("\n%s%15s%.2f","TOTAL COST:","$",cost);
    }
  }
}
