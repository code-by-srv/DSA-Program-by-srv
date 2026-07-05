import java.util.*;

public class SumOfTwoNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");

        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The sum is: "+sum);
    }
}