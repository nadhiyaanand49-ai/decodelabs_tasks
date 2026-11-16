import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        System.out.println("================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("================================");

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = sc.nextInt();

            total += marks;
        }

        double average = (double) total / n;

        char grade;

        if (average >= 90) {
            grade = 'A';
        }
        else if (average >= 80) {
            grade = 'B';
        }
        else if (average >= 70) {
            grade = 'C';
        }
        else if (average >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        System.out.println("\n================================");
        System.out.println("             RESULTS");
        System.out.println("================================");

        System.out.println("Total Marks: " + total + " / " + (n * 100));
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        System.out.println("================================");

        sc.close();
    }
}
