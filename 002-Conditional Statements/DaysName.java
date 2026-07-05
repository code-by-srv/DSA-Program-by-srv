import java.util.*;

public class DaysName{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1-7: ");
        int day = input.nextInt();

        String output = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.printf("The day corresponding to given number is: %s",output);
    }
}