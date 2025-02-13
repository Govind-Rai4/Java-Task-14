// Java program to check if an array contains a specific value
public class Q10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int valueToFind = 3;
        boolean found = false;
        
        for (int num : numbers) {
            if (num == valueToFind) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Array contains " + valueToFind);
        } else {
            System.out.println("Array does not contain " + valueToFind);
        }
    }
}
