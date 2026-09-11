
import java.util.Scanner;

public class Gradeprint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int number = sc.nextInt();
    if(number >= 80 ){
      System.out.println("grade A ");
    }
    else if(number >= 60){
      System.out.println("Grade B");
    }
    else if(number >=50){
      System.out.println("Grade C ");

    }
    else if(number >= 33 ){
      System.out.println("Grade D");
    }
    else{
      System.out.println("Fail");
    }

  }
}
