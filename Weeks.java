
import java.util.Scanner;

public class Weeks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int day = sc.nextInt();
    if(day == 1 ){
 System.out.println("today is sunday");
    }
    else if (day == 2){
       System.out.println("today is monday");
    }
        if(day == 3 ){
 System.out.println("today is Tuesaday");
    }
    else if (day == 4){
       System.out.println("today is Wednesday");
    }
        if(day == 5 ){
 System.out.println("today is Thusrday");
    }
    else if (day == 6){
       System.out.println("today is Friday");
    }
        if(day == 7 ){
 System.out.println("today is Saturday");
    }
    else{
      System.out.println("Invalid");
    }
 
  }
}
