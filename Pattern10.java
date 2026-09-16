public class pattern10{
  public static void main(String []args){
    int n=10;
    for(int row=1; row<=n; row++){
      //for each rows ->variable columns
      if(row==1 || row==2 || row==n){
        for(int col=1; col<=row; col++){
          System.out.print("* ");
        }
      }
      else{
        //middle rows
        //1*
        System.out.println("* ");
        //(row-2) spaces
        for(int col)
      }
    }
  }
}