
package myfirstproject.katia;
import java. util.Scanner;
public class EvenOdd {
     public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = reader.nextInt();

        if(x % 2 == 0)
            System.out.println(x + " is even");
        else
            System.out.println(x + " is odd");

    
}
}
