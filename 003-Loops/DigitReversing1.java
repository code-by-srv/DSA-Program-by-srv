public class DigitReversing1{
    public static void main(String[] args){
        int num = 10899;  // initialization
        int rev = 0;   // accumulator
        while(num>0){    // condition-> keep the iteration till num is greater than zero.
            int lastDigit = num % 10;
            rev = rev*10 + lastDigit;
            num = num / 10;  // updation
        }
        System.out.print(rev);
    }
}

// here value of variable is reversing(changing) in real.