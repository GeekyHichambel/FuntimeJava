import java.util.*;
import java.io.IOException;
public class greaterone
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the 1st no.");
        x=input.nextInt();
        System.out.println("Enter the 2nd no.");
        y=input.nextInt();
        System.out.println("Enter the 3rd no.");
        z=input.nextInt();
        if (x>=y&&x>=z)
        System.out.println("X is the greatest number");
        if (y>=z&&y>=x)
        System.out.println("Y is the greatest number");
        if (z>=y&&z>=x)
        System.out.println("Z is the greatest number");
    }
}

