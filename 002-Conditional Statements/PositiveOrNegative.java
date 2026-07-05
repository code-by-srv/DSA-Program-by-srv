import java.util.*;

public class PositiveOrNegative{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();

        if(num>=0){
            System.out.printf("The Entered number %d is Positive",num);
        }else{
            System.out.printf("The Entered Number %d is Negative",num);
        }
    }
}