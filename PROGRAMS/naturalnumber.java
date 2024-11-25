import java.util.Scanner;
public class naturalnumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.println("The first"+ n +" natural numbers are:");
        for (int i=1;i<=n;i++)
        {
           System.out.print(i+ " ");
           sum += i;
        }
        System.out.println("\nThe sum of this natural numbers is: "+sum);
    }
}