import java.util.Scanner;
public class project2 
{   public static void main(String args[])
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Your good name: ");
    String name=input.nextLine();
    System.out.println("Your name:"+name);
    System.out.println("Your marks: ");
    int b=input.nextInt();
    System.out.println("Your marks:"+b);
    input.close();
    {
        if (b>50)
        {
        System.out.println("You are eligible");
        }
        else
        {
            System.out.println("You are not eligible");
        }  
    }
}
}