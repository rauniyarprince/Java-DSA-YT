public class productsofarray {
  public static void main(String[] args) {
    int array[] = {1,2,3,4,5};
    int Product = 1;
    for (int i = 0; i <= array.length-1; i++) {
       int value = array[i] ; 
       Product *= value ;
       System.out.println(Product);

    }
  }
  
}