public class scopeofvar {
    static int localvar = 20;
  static String even_odd(int x){
    int localvar = 20;
    if (x%2==0){
      return "Even";
    }
    else{
      return  "odd";
    }
  }
  public static void main(String[] args) {
   String result =  even_odd(22);
   System.out.println("given nu is: " + result);
   System.out.println(localvar);
  }
}
