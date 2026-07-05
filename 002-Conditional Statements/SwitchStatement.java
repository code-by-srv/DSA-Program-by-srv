import java.util.*;

public class SwitchStatement{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day Number: ");
        int num = input.nextInt();

        String day = switch(num){
            case 1-> "Monday";
            case 2-> "Tuesday";
            case 3-> "Wednesday";
            case 4-> "Thursday";
            case 5-> "Friday";
            case 6-> "Saturday";
            case 7-> "Sunday";
            default-> "Invalid";
        };
        System.out.printf("The day corresponding to given number is %s.",day);

    }
}