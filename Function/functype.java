public class functype {
  static void print2katable(){
  for(int i=1;i<=10;i++){
    int ans = 2*i ; 
    System.out.println("2 * " + i + "=" + ans );
  }
}
static void printsum (int x,int y){
  System.out.println("the sum of x+y is :"+ (x+y));
}
static void  subtract(int x ,int y){
  System.out.println("subtract:"+ (x - y));
}
public static void main(String[]args){
  System.out.println("hi");
print2katable();
printsum(5,8);
subtract(5,9);
System.out.println("bye");
}
}