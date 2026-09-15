import java.util.*;
public class InbuiltSorting{
    public static void main(String args[]){
        int arr[] = {5,4,2,3,1};

        // sortArray1(arr);
        sortArray2(arr);
        printArray(arr);
        
    }
    // public static void sortArray1(int arr[]){
    //     Arrays.sort(arr);
    // }

    public static void sortArray2(int arr[]){
        Arrays.sort(arr, 0, 3);
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
}