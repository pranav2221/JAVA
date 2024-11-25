
import java.util.Scanner;

public class Vowelchecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter the string: ");
            String input = scanner.nextLine();
            if(!input.matches(".*[AEIOUaeiou].*")){
                throw new Exception("no vowels");
            }
            System.out.println("contains vowels");

        } catch (Exception e) {
            System.out.println("Exception caught "+e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}
