
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained in each subject :");
        System.out.print("Enter number of subjects: ");
        int sub = scanner.nextInt();
        int[] marks = new int[sub] ;
        for (int i = 0; i < sub; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            int mark = scanner.nextInt();
            while (mark < 0 || mark > 100) {
                System.out.println("Invalid input! Marks must be between 0 and 100 ");
                System.out.print("Enter marks for subject " + (i + 1) + " again: ");
                mark = scanner.nextInt();
           }
            marks[i] = mark;}

        int totale = 0;
        for (int mark : marks) {
            totale += mark;
        }

        
        double moyenne = (double) totale / sub;
        char grade;
        if (moyenne >= 90) {
            grade = 'A';
        } else if (moyenne >= 80) {
            grade = 'B';
        } else if (moyenne >= 70) {
            grade = 'C';
        } else if (moyenne >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

    



        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totale);
        System.out.println("Average Percentage: " + moyenne + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
