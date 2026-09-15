public class InsertionSorting{
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        
        insertionSort(arr);
        printArray(arr);
    }
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            //finding out the current position to insert
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
        
    }
    public static void printArray(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+", ");
            }
        }
}

/*
 Insertion Sort builds the sorted portion of the array one element at a time. It starts from the second element 
 and treats the first element as already sorted. For each element, it stores its value in a temporary variable (curr),
 then compares it with the elements to its left. Any larger elements are shifted one position to the right to create 
 space. Finally, the stored value is inserted into its correct position. Repeating this process for every element 
 results in a fully sorted array.
 */