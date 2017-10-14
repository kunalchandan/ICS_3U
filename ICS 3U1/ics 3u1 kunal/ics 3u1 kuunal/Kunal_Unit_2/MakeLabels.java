public class MakeLabels
{
  public static void main(String[] args)
  {
    String name = "Kunal Chandan";
    String studentNumber = "324-024-124";
    int grade = 10;
    String birthday = "October 11, 2000";
    System.out.println("********************************");
    System.out.printf("%s%25s\n", "NAME:", name);
    System.out.printf("%s%15s\n", "STUDENT NUMBER:", studentNumber);
    System.out.printf("%s%24s\n", "GRADE:", grade);
    System.out.printf("%s%21s\n", "BIRTHDAY:", birthday);
    System.out.println("********************************");
  }
}