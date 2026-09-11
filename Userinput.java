import java.util.Scanner;

public class Userinput {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the number: ");
    int num1 = sc.nextInt();
     System.out.println("enter the number 2 : ");
     int num2 = sc.nextInt();
     System.out.println("add of two number:" + (num1+num2 ));

  }
  
}
