import java.util.*;

public class BinaryToDecimal{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int binNum = input.nextInt();

        binToDec(binNum);
    }

    public static void binToDec(int binNum){
        int power = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }
        System.out.print("Decimal of the given binary number is = "+decNum);
    }
}