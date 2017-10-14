public class VersaillesOutput
{
  public static void main(String[] args)
  {
    String str = "Versailles";
    StringBuffer sb = new StringBuffer("VERSAILLES");
    System.out.println(str);
    System.out.println(str.charAt(0)+str.substring(2,3).toUpperCase());
    System.out.println(str.toUpperCase());
    System.out.println(sb.reverse());
    System.out.println(str.substring(0,1).toUpperCase()+str.charAt(1)+str.substring(2,3).toUpperCase()+str.charAt(3)+str.substring(4,5).toUpperCase());
  }
}