import java.util.*;

public class Question2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice;
        int i;
        int sub = 3;                                                                   
        System.out.println("Enter number of students");
        int stdid = scan.nextInt();
        int marks[][] = new int[stdid][sub];
        do{
            System.out.println("\n1.Add student marks");
            System.out.println("2.Average and total mark of a student");
            System.out.println("3.Average of a subject");                                 
            System.out.println("4.Exit");                                                 
            System.out.println("Enter your choice");
            choice = scan.nextInt();

            switch(choice){                                                                  
            case 1:                                                                           
                  System.out.println("Enter studentID");
                  i = scan.nextInt();                                                             
                  if(i >= 0 && i < stdid){                                                        
                       System.out.println("Maths");
                       marks[i][0] = scan.nextInt();                                                   
                       System.out.println("Physics");                                                  
                       marks[i][1] = scan.nextInt();                                                   
                       System.out.println("Chemistry");                                                
                       marks[i][2] = scan.nextInt();
                }else{
                    System.out.println("Invaild studentID");                                   
                }
                    break;
                case 2:
                System.out.println("Enter studentID");
                i = scan.nextInt();
                if(i >= 0 && i < stdid){
                    int total = 0;                                                                  
                    for( int j = 0; j < sub; j++){                                                     
                    total += marks[i][j];
                    }                                                                               
                    double average = (double)total / 3;
                    System.out.println("Student total mark is" + total + " and average marks is " + average);
                }
                    break;
                case 3:
                String[] subNames = {"Maths", "Physics", "Chemistry"};
                    for (int j = 0; j < sub; j++) {
                        int sum = 0;
                        for (int k = 0; k < stdid; k++) {
                            sum += marks[k][j];
                        }
                        double avg = (double)sum / stdid;
                        System.out.println("Average marks for " + subNames[j] + ":" + avg);                                                                                    
                }
                    break;
                case 4:
                System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invaild input");
            }
    }while(choice != 4 );
    }
}
