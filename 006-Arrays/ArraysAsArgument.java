public class ArraysAsArgument{
    public static void main(String[] args){
        int marks[] = {96,97,98,99};

        update(marks);

        // printing all marks
        for(int i= 0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
    }
    // defining a method to update all marks by 1 & we will call it in main() method later.
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
}