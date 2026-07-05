public class DigitReversing{
    public static void main(String[] args){
        int num = 10899;
        while(num>0){
            int lastDigit = num % 10;
            System.out.print(lastDigit+" ");
            num = num / 10;
        }
    }
}

// here we are only printing the reverse of number using print(), but actual value of the variable remain same. 