public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {

            if (row == 1 || row == 2 || row == n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                // First *
                System.out.print("* ");

                // Spaces between the stars
                for (int col = 1; col <= row - 2; col++) {
                    System.out.print("  ");
                }

                // Last *
                System.out.print("* ");
            }

            // Move to next row
            System.out.println();
        }
    }
}