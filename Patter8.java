public class Patter8 {
    public static void main(String[] args) {
        int n = 4;

        for (int row = 1; row <= n; row++) {

            // For each row -> 6 columns
            for (int col = 1; col <= 6; col++) {

                if (row == 1 || row == n || col == 1 || col == 6) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Move to next row
            System.out.println();
        }
    }
}