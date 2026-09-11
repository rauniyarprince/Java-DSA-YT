import java.util.Scanner;

public class Nestedif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String su = "prince@123";

        System.out.println("Enter the Password for lock");
        String s = sc.next();

        if (s.equals(su)) {

            System.out.println("Enter the 2nd Password for lock");
            String s2 = sc.next();

            if (s2.equals("lock")) {

                System.out.println("Lock is open:");

            } else {

                System.out.println("2nd password is incorrect");

            }

        } else {

            System.out.println("1st password is incorrect");

        }

        sc.close();
    }
}