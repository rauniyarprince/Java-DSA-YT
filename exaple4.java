import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
        System.out.println("------------------");
    }

    String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "Fail";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Rahul", 85));
        students.add(new Student(102, "Aman", 92));
        students.add(new Student(103, "Priya", 67));

        System.out.println("1. Display All Students");
        System.out.println("2. Search Student");
        System.out.println("3. Show Topper");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (Student s : students) {
                    s.display();
                }
                break;

            case 2:
                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                boolean found = false;

                for (Student s : students) {
                    if (s.id == id) {
                        s.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student Not Found!");
                }
                break;

            case 3:
                Student topper = students.get(0);

                for (Student s : students) {
                    if (s.marks > topper.marks) {
                        topper = s;
                    }
                }

                System.out.println("Topper Details:");
                topper.display();
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}