import java.util.*;

public class BinomailCoeff{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.print("Enter the value of r: ");
        int r = input.nextInt();
        
        System.out.println("Binomial coeff = "+binomialCoeff(n,r));
    }

    public static int factorial(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int binomialCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;

    }
}