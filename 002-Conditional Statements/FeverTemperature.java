import java.util.*;

public class FeverTemperature{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENter the Fever in celcius: ");
        float num = input.nextFloat();

        if(num>=100){
            System.out.print("You have fever");
        }else{
            System.out.print("You don't have fever");
        }
    }
}