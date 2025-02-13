// Java program to copy elements from one array to another
public class Q6 {
    public static void main(String[] args) {
        int[] sourceArray = {10, 20, 30, 40};
        int[] destinationArray = new int[sourceArray.length];
        
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        
        System.out.print("Copied array: ");
        for (int num : destinationArray) {
            System.out.print(num + " ");
        }
    }
}
