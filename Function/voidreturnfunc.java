public class voidreturnfunc {

static int fact (int x){
  int fact = 1;
  for (int i=1; i<=x; i++){
   fact *=i;
  }
  return fact;
}
  public static void main(String[] args) {
    int factorial = fact(5);
    System.out.println(factorial);
  }
}
