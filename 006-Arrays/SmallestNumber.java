import java.util.*;

public class SmallestNumber{
    public static void main(String[] args){
        int num[] = {1,0,2,3,5,7,8};

        System.out.print("Smallest Number is: "+ getSmallest(num));

    }
    public static int getSmallest(int[] num){
        int smallest = Integer.MAX_VALUE; // + infinity

        for(int i=0; i<num.length; i++){
            if(num[i] < smallest){
                smallest = num[i];
            }
        }
        return smallest;
    }
}