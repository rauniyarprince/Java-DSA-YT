public class Returnlargestnum {
  static String largestnum(int a,int b,int c){
    if(a>b && a>c){
      return "a is greater" ;
    }
    else if(b>a && b>c){
      return "b is greater" ;
    }
    else{
      return "c is greater" ;
    }
  }
  public static void main(String[] args) {
    String store = largestnum(5,9,10);
    System.out.println(store);
  }
}
