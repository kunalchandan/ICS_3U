public class FIZZBUZZ{
  public static void main(String[]a){
    for(int x = 1;x < 100;x++){
      if((x%3 == 0) ||(x%5 == 0)){
        if(x%3 == 0){
          System.out.print("Fizz");
        }
        if(x%5 == 0){
          System.out.print("Buzz");
        }
        System.out.println();
      }
      else{
        System.out.println(x);
      }
    }
  }
}  