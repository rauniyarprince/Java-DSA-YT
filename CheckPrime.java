
import java.util.Scanner;

public class CheckPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number : ");
    int num = sc.nextInt();
    int count= 0;
    for(int i = 2; i<num; i++){
      if(num%i == 0){
        count = 1;
        break;
      }
      }
      if (num <=1){
        System.out.println("numer in not prime");
      }
      else if(count == 1){
        System.out.println("number is not Prime");
      }
      else{
        System.out.println("number is prime");
      }
    }
  }
