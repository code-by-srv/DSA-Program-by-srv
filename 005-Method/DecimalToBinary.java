import java.util.*;

public class DecimalToBinary{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Decimal number: ");
        int decNum = input.nextInt();

        decToBin(decNum);
    }

    public static void decToBin(int decNum){
        int power = 0;
        int binNum = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (int)(rem * Math.pow(10, power));
            power++;
            decNum = decNum / 2; 
        }
        System.out.print("Binary of given Decimal is: "+binNum);
    }
}