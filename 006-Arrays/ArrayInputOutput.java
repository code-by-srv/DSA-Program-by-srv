import java.util.*;

public class ArrayInputOutput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Array declaration
        int marks[] = new int[10];

        // taking input from users
        System.out.print("Enter marks of Physics: ");
        marks[0] = input.nextInt();
        System.out.print("Enter marks of Chemistry: ");
        marks[1] = input.nextInt();
        System.out.print("Enter marks of Maths: ");
        marks[2] = input.nextInt();

        // printing the marks
        System.out.println("Phy: "+marks[0]);
        System.out.println("Che: "+marks[1]);
        System.out.println("Maths: "+marks[2]);

        // we can update value of an array using index
        marks[2] = marks[2] + 1;
        System.out.println("Maths: "+marks[2]);

        // Average 
        int avg = (marks[0]+marks[1]+marks[2])/3;

        // calculate length of an Array
        System.out.print("The length of array is: "+ marks.length);



    }
}