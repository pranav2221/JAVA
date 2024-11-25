import java.io.*;
import java.util.Scanner;
public class StudentInfo {
    public static void main(String[] args) {
        String filename = "studentinfo.dat"; 
        try {
            
            gatherStudentInfo(filename);
            readStudentInfo(filename);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    private static void gatherStudentInfo(String filename) throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        dos.writeInt(rollNo);
        System.out.print("Enter Class: ");
        String className = scanner.next();
        dos.writeUTF(className);
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        dos.writeInt(age);
        System.out.print("Enter Weight (in kg): ");
        float weight = scanner.nextFloat();
        dos.writeFloat(weight);
        System.out.print("Enter Height (in cm): ");
        float height = scanner.nextFloat();
        dos.writeFloat(height);
        System.out.print("Enter City: ");
        String city = scanner.next();
        dos.writeUTF(city);
        System.out.print("Enter Phone: ");
        String phone = scanner.next();
        dos.writeUTF(phone);
        dos.close();
        System.out.println("Student information saved successfully.");
        scanner.close();
    }
    private static void readStudentInfo(String filename) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream(filename));
        System.out.println("\nRetrieving Student Information:");
        System.out.println("Roll No: " + dis.readInt());
        System.out.println("Class: " + dis.readUTF());
        System.out.println("Age: " + dis.readInt());
        System.out.println("Weight: " + dis.readFloat() + " kg");
        System.out.println("Height: " + dis.readFloat() + " cm");
        System.out.println("City: " + dis.readUTF());
        System.out.println("Phone: " + dis.readUTF());
        dis.close();
    }
}
