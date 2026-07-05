import java.util.*;

public class StudentsMarks{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the percentage marks of the Student: ");
        int marks = input.nextInt();

        String result = (marks>=33)?"Passed":"Failed";

        System.out.printf("The student is %s in the exam.",result);
    }
}