public class BinarySearch{
    public static void main(String[] args){
        int num[] = {1,2,3,4,5,6,7,8,9};  //given
        int key = 8;   //given

        System.out.println("The index of key is: "+getBinary(num, key));
    }

    public static int getBinary(int[] num, int key){
        int start=0, end=num.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            // comparison
            if(num[mid] == key){  // if key exist in array then this conition will achieved sooner or later
                return mid;
            }
            if(num[mid]< key){  // right
                start = mid + 1;
            }else{   // left
                end = mid-1;
            }
        }
        return -1;  // if key does not exist in array
    }
}