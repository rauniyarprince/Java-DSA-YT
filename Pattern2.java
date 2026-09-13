
import java.util.Scanner;
public class Pattern2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number for print");
    int n = sc.nextInt();
  for(int row=1; row<=n; row++){
    for(int col=1; col<=5; col++){
      System.out.print("- ");
    }
    System.out.println(" ");
  }
    
  }
}
