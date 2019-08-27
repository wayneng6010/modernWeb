package javarefresh;
import java.util.Scanner;

public class JavaIfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int marks;
        do{
            System.out.print("Please input marks: ");
            marks = input.nextInt();
            if (marks >= 80 && marks <= 100){
                System.out.println("A");
            } else if (marks >= 60 && marks <= 100) {
                System.out.println("B");
            } else if (marks >= 50 && marks <= 100) {
                System.out.println("C");
            } else if (marks >= 40 && marks <= 100) {
                System.out.println("D");
            } else if (marks < 40 && marks > 0) {
                System.out.println("Failed");
            } else {
                System.out.println("Invalid marks");
            }
        }while(true);
    }
    
}
