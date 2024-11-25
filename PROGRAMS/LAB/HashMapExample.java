
import java.util.HashMap;


public class HashMapExample{
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap= new HashMap<>();
        
        hashMap.put(1,"Apple");
        hashMap.put(2,"Banana");
        hashMap.put(3,"Orange");
        hashMap.put(4,"Pinapple");
        hashMap.put(5,"Mango");

        System.out.println("Initial HashMap: " + hashMap);
        String fruit = hashMap.get(2);
        System.out.println("Value for key 2:" + fruit);

        hashMap.remove(3);
        System.out.println("HashMap after removing key 3: " + hashMap);

        boolean hasKey = hashMap.containsKey(1);
        System.out.println("Does key 1 exist? " + hasKey);

        boolean hasValue = hashMap.containsValue("Banana");
        System.out.println("Does value 'Banana' exist? " + hasValue);

        System.out.print("Keys: ");
        for (Integer key : hashMap.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        System.out.print("Values: ");
        for (String value : hashMap.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Size of the HashMap: " + hashMap.size());

        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    

    }
}