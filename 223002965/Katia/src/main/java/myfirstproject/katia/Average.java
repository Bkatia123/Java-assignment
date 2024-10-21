
package myfirstproject.katia;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int []Array = { 10,12,34,23,56,78 };
        int sum = 0;

        for (int n: Array) {
           sum += n;
        }

        double average = sum / Array.length;
        System.out.printf("The average is: %.2f", average);
    }

    
}
