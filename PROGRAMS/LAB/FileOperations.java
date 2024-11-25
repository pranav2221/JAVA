import java.io.*;
import java.util.Scanner;
public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename (with extension): ");
        String filename = scanner.nextLine();
        try {
            writeToFile(filename);
            readFromFile(filename);
            appendToFile(filename);
            readFromFile(filename);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    private static void writeToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("This is the first line of the file.\n");
            writer.write("This is the second line of the file.\n");
            System.out.println("Data written to the file successfully.");
        }
    }
    private static void readFromFile(String filename) throws IOException {
        System.out.println("\nReading from the file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
    private static void appendToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write("This line is appended to the file.\n");
            System.out.println("Data appended to the file successfully.");
        }
    }
}
