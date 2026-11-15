
import java.util.Scanner;

public class Checkage {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the Age: ");
    int age = sc.nextInt();
    if(age <= 18){
      }
    else{
      System.out.println("eligible vote");
    }
  }
}
