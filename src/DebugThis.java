import java.util.Scanner;

public class DebugThis {
    public static void main(String[] args) {
        char grade;
        int testScore;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a score: ");
        testScore = input.nextInt();

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'B';
        } else { // <=59
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }

}
