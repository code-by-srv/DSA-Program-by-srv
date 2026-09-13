public class PrintSubArray{
    public static void main(String args[]){
        int num[] = {2,4,6,8,10};

        printSubarray(num);
    }
    public static void printSubarray(int num[]){
        int ts = 0;  // to calculate total Subarrays
        for(int i=0; i<num.length; i++){   // to get starting index
            int start = i;
            for(int j=i; j<num.length; j++){  // to get end index
                int end = j;
                for(int k=start; k<=end; k++){  // to print subarrays from starting to end indexes
                    System.out.print(num[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total Subarrays= "+ts);
    }
}

/*
The algorithm prints every possible contiguous subarray of the given array. The first loop selects the starting index, 
the second loop selects the ending index, and the third loop prints all elements between those two indices. After
 printing each subarray, the counter ts is incremented to keep track of the total number of subarrays generated. 
 Since every valid combination of start and end indices is considered, every contiguous subarray is printed exactly 
 once.
 */