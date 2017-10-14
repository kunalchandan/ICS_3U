public class CanadaComputers
{
  public static void main(String[] args)
  {
    double hardDrive =  99.99;
    double monitor = 249.99;
    double hst = .13;
    double subtotal = (hardDrive + monitor);
    double tax = (subtotal * hst);
    System.out.printf("\t%s\n", "CANADA COMPUTERS INC.");
    System.out.printf("\t%s\n", "---------------------");
    System.out.printf("\t%s%20s\n", "DATE:", "June 24, 2011");
    System.out.printf("\t%s%17s\n", "NAME:", "Jack Black");
    System.out.printf("\t%s%18s\n", "PHONE:", "905-967-1234");
    System.out.printf("%s%11s%36s\n", "QTY", "ITEM", "PRICE");
    System.out.println("---------------------------------------------------");
    System.out.printf("%s%35s%14s\n", "1", "WD 2TB External Hard Drive", hardDrive);
    System.out.printf("%s%29s%20s\n", "1", "ASUS 24\" LED Monitor", monitor);
    System.out.println("---------------------------------------------------");
    System.out.printf("\t%s%31s\n", "SUBTOTAL:", subtotal);
    System.out.printf("\t%s%36.2f\n", "HST:", tax);
    System.out.printf("\t%s%28.2f\n", "GRAND TOTAL:", (subtotal+tax));
  }
}