public class MaxSubarraySum1{
    public static void main(String agrs[]){
        int num[] = {2,4,6,8,10};

        maxSubarraySum(num);
    }
    public static void maxSubarraySum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += num[k];
                }
                if(currSum > maxSum){
                    maxSum  = currSum;
                }
            }
        }
        System.out.println("Max Sum = "+maxSum);

    }
}
/*
This program finds the maximum sum among all possible contiguous subarrays using the Brute Force approach. 
It works by generating every possible subarray of the given array. The outer loop selects the starting index,
 the middle loop selects the ending index, and the inner loop calculates the sum of all elements between the 
 start and end indices. After calculating the sum of each subarray, it compares the current sum with the maximum 
 sum found so far. If the current sum is larger, it updates the maximum sum. After checking every possible subarray, 
 the program prints the largest sum obtained. Since it checks all subarrays and recalculates their sums repeatedly,
  the time complexity is O(n³).
*/