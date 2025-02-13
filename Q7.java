// Java program to find the second largest element in an array
public class Q7 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 45, 99};
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        
        System.out.println("Second largest element: " + secondLargest);
    }
}