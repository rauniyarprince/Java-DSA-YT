
import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n = sc.nextInt();
    switch(n){
      case 1:
        System.out.println("sun");
        break;
        case 2:
        System.out.println("mon");
        break;

        case 3:
        System.out.println("tue");
        break;
        case 4:
        System.out.println("Wed");
        break;
        case 5:
        System.out.println("thur");
        break;
        case 6:
        System.out.println("frida");
        break;
        case 7:
        System.out.println("sat");
        break;
        default:
        System.out.println("invalid");
    }
  }
}
