import java.util.*;

public class Factorial{
    public static void main(String agrs[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int total = factorial(num);
        System.out.println("Factorial ="+total);
    }

    public static int factorial(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }
}