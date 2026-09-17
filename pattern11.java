public class pattern11{
  public static void main(String[] args) {
    int n=5;
    for(int row=1; row<=n; row++){
      //space
      for(int col=1; col<=n; col++){
        System.out.println(" ");
      }
      //star
      for(int col=1; col<=2*row-1;col++){
        System.out.println("* ");
      }
      //move to next row
    }

  }
}