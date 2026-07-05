import java.util.*;

public class AreaOfCircle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = input.nextFloat();

        float area = 3.14f * r * r;
        System.out.println("The Area of Circle is: "+area);
    }
}