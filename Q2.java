// Java program to find the largest element in an array
public class Q2 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 35, 40, 15};
        int largest = numbers[0];
        
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        
        System.out.println("Largest element: " + largest);
    }
}