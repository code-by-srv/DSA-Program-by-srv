import java.util.*;

public class PrintNumbersFrom1ToN{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print: ");
        int num = input.nextInt();

        int i = 1;
        while(i<=num){
            System.out.print(i+" ");
            i++;
        }
    }
}