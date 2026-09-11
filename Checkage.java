
import java.util.Scanner;

public class Checkage {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the Age: ");
    int age = sc.nextInt();
    if(age <= 18){
      System.out.println("not eligible for vote");
    }
    else{
      System.out.println("eligible for vote");
    }
  }
}
