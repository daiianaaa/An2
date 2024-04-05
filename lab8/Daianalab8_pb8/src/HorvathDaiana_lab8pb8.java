import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//Write a Java application which reads a file with the following format: */rnd1_001.lab
//A 0001
//C 0003
//D 0004
//F 0003
//A 0006
//. */rnd2_002.lab C 0003
//F 0001 Z 0010 M 0011 .
//.....
//Separate the information from the file into distinct files which are named
// according to the line which starts with */ .
public class HorvathDaiana_lab8pb8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("data.txt"))) {
            String inputString = scanner.nextLine();

            File outFile = null;
            FileWriter fileWriter = null;

            while (scanner.hasNext()) {
                if (inputString.startsWith("*/")) {
                    String fileName = inputString.substring(2) + ".txt";
                    outFile = new File(fileName);
                    outFile.createNewFile();
                    System.out.println("File created: " + fileName);
                } else if (outFile != null) {
                    fileWriter = new FileWriter(outFile, true);
                    fileWriter.write(inputString + "\n");
                    fileWriter.close();
                }
                inputString = scanner.nextLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
