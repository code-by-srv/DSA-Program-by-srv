import java.util.*;

public class ProductOfTwoNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();

        System.out.println("Enter the Second number: ");
        int b = input.nextInt();     

        int product = a * b ;
        System.out.println("The product is: "+product);  

    }
}