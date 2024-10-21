
package myfirstproject.katia;
import java.util.Scanner;
public class Exercise {
 public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();

        if (a > 0)
        {
            System.out.println("Number is positive");
        }
        else if (a < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }

    
}
