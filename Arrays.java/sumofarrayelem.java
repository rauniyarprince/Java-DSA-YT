
import java.util.Scanner;

public class sumofarrayelem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = {8,9,7,6,3,5,2,4};
    int sum = 0;
    for (int i = 0 ; i<=arr.length-1; i++){
      int value = arr[i];
      sum += value;
      System.out.println("sum of array: "+ sum);
    }
  }
  
}
