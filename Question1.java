import java.util.Scanner;

public class Question1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String name1 = scan.next();
        System.out.println("Enter your last name:");
        String name2 = scan.next();
        System.out.println("Welcome to second year " + name1 + " " + name2);
    }
}