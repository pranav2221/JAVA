import java.util.Arrays;
public class Removalelementfromarray{
    public static void main(String[] args) {
        int[] array={1,2,3,5,4,5,6,5,6};
        int elementToremove = 5;
        System.out.println("Original array: "+Arrays.toString(array));
        System.out.println("Element to Remove: "+ elementToremove);

        int[] resultArray = removeElement(array,elementToremove);
        System.out.println("Array after removal: "+Arrays.toString(resultArray));
}
    public static int[] removeElement(int[] array,int element){
        int count = 0;
        for(int num : array){
            if(num == element)
            {
                count++;
            }
        }
        int[] result = new int[array.length - count];
        int index=0;
        for(int num:array){
            if(num != element)
            {
                result[index++]=num;
            }
        }
        return result;
    }
}