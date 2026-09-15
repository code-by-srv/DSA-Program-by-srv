import java.util.*;

public class CountingSorting{
    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,4,3,7};

        countingSort(arr);
        printArray(arr);
    }
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];  // +1 because, counting starts from 0;
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        } 

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
}

/*

Counting Sort works by **counting the frequency of each element instead of comparing elements with one another.
 First, it finds the largest element in the array to determine the size of the counting array. Then, it creates 
 a `count[]` array where each index represents a possible value from the original array, and the value stored at 
 that index represents how many times that number appears. Next, it traverses the `count[]` array from the smallest 
 index to the largest. For every index whose count is greater than zero, it writes that index back into the original
  array as many times as its frequency indicates. By reconstructing the array in increasing order of the indices,
   the original array becomes sorted. Since it relies on counting occurrences rather than comparing elements, 
   Counting Sort is very efficient when the range of input values is small.

 */