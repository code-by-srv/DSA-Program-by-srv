import java.util.*;

public class IncomeTaxCalculator{
    public static void main(String[] args){
        System.out.print("Enter your income in lacs: ");
        Scanner input = new Scanner(System.in);
        int income = input.nextInt();

        int tax;

        if(income<5){
            tax = 0;
        }else if(income>=5 && income<10){
            tax = (int)(income*.2);
        }else{
            tax = (int)(income*.3);
        }
        System.out.printf("your tax is %d lac",tax);
    }
}