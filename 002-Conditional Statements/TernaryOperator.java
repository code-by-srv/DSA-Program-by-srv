import java.util.*;

public class TernaryOperator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        String type = (num%2==0)?"even":"odd";

        System.out.printf("The number %d is %s",num,type);
    }
}