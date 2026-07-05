import java.util.*;

public class SumOfNNaturalNunbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to calculate the sum: ");
        int num = input.nextInt();

        int sum = 0;  // accumulator
        int i = 1;
        while(i<=num){
            sum = sum + i;
            i++;
        } 
        System.out.printf("The sum of first %d natural number is: %d",num,sum);
    }
}