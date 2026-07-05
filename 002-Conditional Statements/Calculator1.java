import java.util.*;

public class Calculator1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter the Second number: ");
        float num2 = input.nextFloat();
        System.out.print("Enter the Arithmetic operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        float output = switch(operator){
            case '+' -> (num1 + num2);
            case '-' -> (num1 - num2);
            case '*' -> (num1 * num2);
            case '/' -> (num1 / num2);
            case '%' -> (num1 % num2);
            default ->  throw new IllegalArgumentException("Invalid Operator");
        };
        System.out.print("The output is: "+output);

        input.close();
    }
}