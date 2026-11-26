public class Minvalue {
  public static void main(String[] args) {
int arr[] = {5,8,9,9,6,3,6};
int n = arr.length;
int Minvalue = arr[0];
for (int i = 0; i<n; i++){
  if (arr[i]<= Minvalue){
    Minvalue = arr[i];
  }
}
System.out.println(Minvalue);

  }
  
}
