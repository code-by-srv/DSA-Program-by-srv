import java.util.*;

public class BreakStatement1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
        do{
             System.out.print("Enter your number: ");
             int num = input.nextInt();
             if(num%10==0){
                break;
             }
             System.out.println(num);
        }while(true);
    }
}