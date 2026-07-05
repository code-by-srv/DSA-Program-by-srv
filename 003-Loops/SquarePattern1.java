import java.util.*;

public class SquarePattern1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++){
            System.out.print("* ");
            for(int j=1; j<num; j++){
              System.out.print("* ");
            }
            System.out.println();
        }
    }
}