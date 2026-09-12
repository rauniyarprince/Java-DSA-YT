import java.util.Scanner;
public class switch2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the fitst num: ");
    double num1 = sc.nextDouble();
        System.out.println("enter the operator('+','-','*','/'): ");
    char operator = sc.next().charAt(0);
        System.out.println("enter the second num: ");
    double num2 = sc.nextDouble();
double result = 0 ;
    switch(operator){
      case '+':
        result = num1 + num2 ;
        break;
      case '-':
        result = num1 - num2 ;
        break ;
    case '*' :
      result = num1 * num2 ;
      break ;
      case '/':
        result = num1 / num2;
        break ;
        default:
          System.out.println("invalid ");
          return ; // when we give the wrong operator then return invalid other wise print result 
        
  }
  System.out.println("result  =" + result );

}
}
