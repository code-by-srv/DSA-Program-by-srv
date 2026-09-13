public class MaxSubarraySum3{
    public static void main(String args[]){
        int num[] = {-2,-3,4,-1,-2,1,5,-3};

        kadanes(num);
    }
    
    public static void kadanes(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0; i<num.length; i++){
            currSum = currSum + num[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.print("Max subarray sum = "+maxSum);
    }
}

/*
 Kadane's Algorithm finds the maximum subarray sum by maintaining a running sum (currSum) while traversing 
 the array only once. Each new element is added to the current sum. If the running sum becomes negative, 
 it is reset to zero because a negative sum can only decrease the sum of any future subarray. After
 processing each element, the algorithm compares the current sum with the maximum sum found so far and 
 updates it if necessary. Instead of checking every possible subarray, Kadane's Algorithm intelligently 
 discards unhelpful negative prefixes, allowing it to find the maximum subarray sum in a single pass.
 */