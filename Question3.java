import java.util.*;

public class Question3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        int i;
        int sub = 3;

        System.out.println("Enter number of students");
        int stdid = scan.nextInt();
        int marks[][] = new int[stdid][sub];

        do {
            System.out.println("\n1. Add student marks");
            System.out.println("2. Average and total mark of a student");
            System.out.println("3. Show student grades");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter studentID");
                    i = scan.nextInt();
                    if (i >= 0 && i < stdid) {
                        System.out.println("Maths");
                        marks[i][0] = scan.nextInt();
                        System.out.println("Physics");
                        marks[i][1] = scan.nextInt();
                        System.out.println("Chemistry");
                        marks[i][2] = scan.nextInt();
                    } else {
                        System.out.println("Invalid studentID");
                    }
                    break;

                case 2:
                    System.out.println("Enter studentID");
                    i = scan.nextInt();
                    if (i >= 0 && i < stdid) {
                        int total = 0;
                        for (int j = 0; j < sub; j++) {
                            total += marks[i][j];
                        }
                        double average = (double) total / sub;
                        System.out.println("Student total mark is " + total + " and average marks is " + average);
                    } else {
                        System.out.println("Invalid studentID");
                    }
                    break;

                case 3:
                    System.out.println("Student Grades:");
                    System.out.println("ID\tMaths\tGrade\tPhysics\tGrade\tChemistry\tGrade");

                    for (i = 0; i < stdid; i++) {
                        System.out.print(i + "\t");
                        for (int j = 0; j < sub; j++) {
                            System.out.print(marks[i][j] + "\t" + grade(marks[i][j]) + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting");
                    break;

                default:
                    System.out.println("Invalid input");
            }
        } while (choice != 4);
  }

   public static String grade(int score) {
        if (score >= 90) return "Grade A";
        else if (score >= 80) return "Grade B";
        else if (score >= 70) return "Grade C";
        else if (score >= 60) return "Grade D";
        else return "Fail";
}
}