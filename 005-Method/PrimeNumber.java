import java.util.*;

public class PrimeNumber{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        boolean result = isPrime(num);
        if(result){
            System.out.print("Given number is prime");
        }else{
            System.out.print("Given number is not prime");

        }
    }
    // //Un-optimized way
    // public static boolean isPrime(int num){
    //     for(int i=2; i<num; i++){
    //         if(num % i == 0){
    //             return false;
    //         }
    //     }    
    //     return true;  
    // }

    // Optimized way
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}