public class Pattern9{
  public static void main(String[] args) {
    int n=5;
    for(int row =1; row<=n; row++){
      //for each row  -> variable columns
      if(row == 1 || row == 2 || row==n){
        for(int col=1;col<=row;col++){
          System.out.print("* ");
        }
      }
      else{
        //middle rows
        //1*
        System.out.println("* ");
      }
      for(int col=1; col<=(row-2); col++){
        System.out.println(" ");
      }
      System.out.println("* ");
      //move to next row
      System.out.println();
  }
  