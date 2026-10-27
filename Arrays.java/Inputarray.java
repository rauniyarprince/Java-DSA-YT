
import java.util.Scanner;

public class Inputarray {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int arr [] = new int[5];
  for(int i=0;i<=arr.length-1; i++){
    System.out.println("provide the value of index "+ i);
    arr[i] = sc.nextInt();
  }

  for (int var :arr){
    System.out.println("array is: " +var );
  }
 } 
}
