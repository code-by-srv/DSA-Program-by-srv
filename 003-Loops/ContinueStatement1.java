import java.util.*;

public class ContinueStatement1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter the number: ");
            int num = input.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println(num);
        }while(true);

    }
}