import java.util.*;

public class LeapYear{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = input.nextInt();

        if((year%400==0) || (year%4==0  &&  year%100!=0)){
            System.out.print("Leap Year");
        }else{
            System.out.print("Not Leap Year");
        }
    }
}