public class LinearSearch{
    public static void main(String[] args){
        int num[] = {1,3,5,8,10,12,7};
        int key = 10;

        int index = search(num, key);
        if(index == -1){
            System.out.print("Key Not found");
        }else{
            System.out.print("Key found at index: "+index);
        }

    }
    public static int search(int num[], int key){
        for(int i=1; i<num.length; i++){
            if(num[i]== key){
                return i;
            }
        }
        return -1;
    }
}