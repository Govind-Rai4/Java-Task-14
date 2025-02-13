// Java program to find the frequency of each element in an array
import java.util.HashMap;

public class Q8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 3, 1, 4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Element frequencies: " + frequencyMap);
    }
}