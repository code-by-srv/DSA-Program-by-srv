import java.util.*;

public class PrintOddOrEven{
    public static void main(String[] args){
        System.out.print("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2==0){
            System.out.printf("The number %s is even",num);
        }else{
            System.out.printf("The number %s is odd",num);
        }
    }
}