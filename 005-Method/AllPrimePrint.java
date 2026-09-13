import java.util.*;

public class AllPrimePrint{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till you want to print prime: ");
        int num = input.nextInt();

       primesInRange(num);

    }

    public static void primesInRange(int num){
        for(int i=2; i<=num; i++){
            if(isPrime(i)){
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }

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