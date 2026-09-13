public class MaxSubarraySum2{
    public static void main(String args[]){
        int num[] = {2,4,6,8,10};

        maxSubarraySum(num);
    }
    public static void maxSubarraySum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        //creating another prefix[] array with same length as num[]
        int prefix[] = new int[num.length];
        // now assign elements value in prefix[] array
        prefix[0] = num[0];  //first prefix value is always equal to the first array element.
        for(int i=1; i<num.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;
                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is = "+maxSum);
    }
}
/*
prefix[i] = it stores the sum of all elements from index 0 to i.
prefix[i-1] = cummulative sum of all previous elements of subarray till ith index
num[i]= curren element value in num[]
  This algorithm improves the brute-force approach by using a Prefix Sum array. Instead of adding the elements 
  of every subarray repeatedly, it first stores the cumulative sum of the array in the prefix array. Once the
  prefix array is built, the sum of any subarray can be calculated in constant time using either prefix[end]
  (when the subarray starts at index 0) or prefix[end] - prefix[start-1] (when it starts later). The algorithm 
  then checks every possible start and end index, computes each subarray's sum using the prefix array, and updates
   the maximum sum whenever a larger value is found. This avoids the repeated addition of elements inside a 
   third loop, reducing the overall time complexity from O(n³) to O(n²).


 */