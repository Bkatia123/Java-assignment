
package myfirstproject.katia;
import java.util.Scanner;
public class ReverseArray {
 public static void main(String[] args) { 
        int [] array = new int [] {3,4,6,1,9,7,5,8};  
        System.out.println("Original array: ");  
        for (int i = 0; i < array.length; i++) {  
            System.out.print(array[i] + " ");  
        }  
        System.out.println();  
        System.out.println("Array in reverse order: ");    
        for (int i = array.length-1; i >= 0; i--) {  
            System.out.print(array[i] + " ");  
        }  

    
 }
}
