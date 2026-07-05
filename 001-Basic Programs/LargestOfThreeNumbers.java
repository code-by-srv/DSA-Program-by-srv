import java.util.*;

public class LargestOfThreeNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number");
        int a = input.nextInt();
        System.out.print("Enter Second Number");
        int b = input.nextInt();
        System.out.print("Enter Third Number");
        int c = input.nextInt();

        if(a>=b && a>=c){
            System.out.print("A is Largest");
        }else if(b>=c){
            System.out.print("B is Largest");
        }else{
            System.out.print("C is Largest");
        }



    }
}