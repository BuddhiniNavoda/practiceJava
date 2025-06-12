import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CopyTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. Construct a File object for input
        File inputFile = new File("input.txt");

        // 2. Construct a Scanner object using the File
        Scanner in = new Scanner(inputFile);

        // 3. Construct a PrintWriter object for output
        PrintWriter out = new PrintWriter("output.txt");

        // 4. Read lines from input file and write to output file
        while (in.hasNextLine()) {
            String line = in.nextLine(); // Read a line
            out.println(line); // Write the line to output
        }

        // 5. Close both the input and output files
        in.close();
        out.close();

        System.out.println("File copied successfully.");
    }
}
