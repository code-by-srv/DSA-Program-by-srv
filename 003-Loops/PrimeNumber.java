import java.util.*;

public class PrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int num = input.nextInt();

            boolean isPrime = true;

            if(num<=1){
                isPrime = false;
            }else{
                for(int i = 2; i<=num-1; i++){
                    if(num % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.print("Number is Prime");
            }else{
                System.out.print("Number is not prime");
            }
    
    }
 }
