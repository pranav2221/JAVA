import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args)
    {
        int n = 5;
        ArrayList<Integer> arr1 = new ArrayList<>(n);
        arr1.add(10); 
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);
        arr1.add(50);
        System.out.println("Array 1:" + arr1);
        arr1.add(2, 25); 
        System.out.println("After adding 25 at index 2: " + arr1);
        System.out.println("Element at index 3: " + arr1.get(3));
        arr1.set(1, 15);
        System.out.println("After setting index 1 to 15: " + arr1);
        arr1.remove(4);
        System.out.println("After removing element at index 4: " + arr1);
        System.out.println("Size of the ArrayList: " + arr1.size());
        System.out.println("Does ArrayList contain 30? " + arr1.contains(30));
        System.out.println("Is the ArrayList empty? " + arr1.isEmpty());
        arr1.clear();
        System.out.println("After clearing the ArrayList: " + arr1);
    }
}
