// Java program to find the sum of all elements in an array
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of array elements: " + sum);
    }
}