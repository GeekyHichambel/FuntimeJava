import java.util.Scanner;
public class tabletime
{
 public static void main(String args[])
 {
     Scanner input = new Scanner(System.in);
     int n,i,z;
     System.out.println("Enter the number whose table is required: ");
     n=input.nextInt();
     for (i=1;i<=10;i++){
         z = n*i;
        System.out.print("THe table of"+n+"is given below: ");
      System.out.println(n+"X"+i+"is"+z);
    }
 }
}
