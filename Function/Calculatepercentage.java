public class Calculatepercentage { 
  static void Calcpercentage(int obtained,int total){
    double percentage =(double) obtained / total * 100;
    System.out.println("percentage is :" + percentage);
  }
  public static void main(String[] args) {
    Calcpercentage(435, 600);
  }
}
