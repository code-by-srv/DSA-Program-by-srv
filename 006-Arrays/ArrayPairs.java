public class ArrayPairs{
    public static void main(String args[]){
        int num[] = {2,4,6,8,10};
        printPairs(num);

    }
    public static void printPairs(int num[]){
        int tp = 0; // accumulation variable to count total pairs
        for(int i=0; i<num.length; i++){
            int curr = num[i];
            for(int j=i+1; j<num.length; j++){
                System.out.print("("+curr+", "+num[j]+")");

                tp++;  // after printing each pairs, increase the total count by 1
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+tp);

    }
}

// Here we are printing all pairs and also counting number of pairs