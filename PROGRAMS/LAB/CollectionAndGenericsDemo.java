import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAndGenericsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(30);

        System.out.println("Original List: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
        int maxNumber = findMax(numbers);
        System.out.println("Maximum Number: " + maxNumber);
        numbers.remove(Integer.valueOf(15));
        System.out.println("List after removing 15: " + numbers);
        System.out.println("Iterating through the list:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    public static <T extends Comparable<T>> T findMax(List<T> list) {
        T max = list.get(0);
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

