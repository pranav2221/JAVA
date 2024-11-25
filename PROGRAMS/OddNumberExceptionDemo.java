import java.util.Scanner;

public class OddNumberExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            
            if (number % 2 != 0) {
                throw new Exception("The number " + number + " is odd.");
            }

            System.out.println("The number " + number + " is even.");
        } catch (Exception e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close(); 
    }
}
}