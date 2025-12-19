import java.io.*;

public class FileHandlingUtility {

    // Method to write data into a file
    public static void writeFile(String fileName, String content) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e){ 
            System.out.println("Error while writing to file.");
        }
    }

    // Method to read data from a file
    public static void readFile(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nReading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
    }

    // Method to modify file content (append text)
    public static void modifyFile(String fileName, String newContent) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.newLine();
            writer.write(newContent);
            writer.close();
            System.out.println("\nFile modified successfully.");
        } catch (IOException e) {
            System.out.println("Error while modifying the file.");
        }
    }

    // Main method
    public static void main(String[] args) {
        String fileName = "sample.txt";

        // Write to file
        writeFile(fileName, "Hello,Iam Varshitha.");

        // Read from file
        readFile(fileName);

        // Modify file
        modifyFile(fileName, "Iam intern at Codtechit solutions.");

        // Read modified file
        readFile(fileName);
    }
}
