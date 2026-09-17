public class pattern11 {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int row = 1; row <= n; row++) {

            // spaces
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        for (int row = 2; row <= n; row++) {

            // spaces
            for (int col = 1; col <= 2 * (row - 1); col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}