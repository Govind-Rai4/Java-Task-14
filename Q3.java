// Java program to find the smallest element in an array
public class Q3 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 35, 40, 15};
        int smallest = numbers[0];
        
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        
        System.out.println("Smallest element: " + smallest);
    }
}
