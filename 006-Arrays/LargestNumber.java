import java.util.*;

public class LargestNumber{
    public static void main(String[] args){
        int num[] = {1,2,3,4,5,6,8,7};

        System.out.print("Largest number is: "+getLargest(num));

    }
    public static int getLargest(int[] num){
        int largest = Integer.MIN_VALUE;  // - infinity

        for(int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }
}