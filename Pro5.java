import java.util.Scanner;

    public class Pro5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            
            System.out.print("Enter the marks scored by the student: ");
            int marks = scanner.nextInt();
    
            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input");
            } else {
                
                char grade;
                if (marks >= 90 && marks <= 100) {
                    grade = 'S';
                } else if (marks >= 80 && marks <= 89) {
                    grade = 'A';
                } else if (marks >= 70 && marks <= 79) {
                    grade = 'B';
                } else if (marks >= 60 && marks <= 69) {
                    grade = 'C';
                } else if (marks >= 50 && marks <= 59) {
                    grade = 'D';
                } else {
                    grade = 'E';
                }
    
                
                System.out.println("Grade: " + grade);
            }
    
            scanner.close();
        }
    }
    
        
    

