public class attern10 {

    public static void main(String []args) {

        int n = 5;

        for(int row = 1; row <= n; row++) {

            // first and last row
            if(row == 1 || row == n) {

                for(int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }

            }
            else {

                // first star
                System.out.print("* ");

                // middle spaces
                for(int col = 1; col <= row - 2; col++) {
                    System.out.print("  ");
                }

                // last star
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}