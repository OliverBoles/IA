import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileHandler {

    public static void readFromFile(String fileName) {
        // read and print out the contents of a text file
        // using all the exception handling best practices

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeToFile(String fileName, String text, boolean append) {
        // write text to fileName
        // either overwriting (append = false)
        // or appending (append = true)
        // using all the exception handling best practices

        try (PrintWriter pr = new PrintWriter(new FileWriter(fileName, append))) {
            pr.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

