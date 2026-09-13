
import java.util.Scanner;

public class Break {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number :");
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      System.out.print(i);
    if(i==5){
      break;
    }
  }
}
}
  
