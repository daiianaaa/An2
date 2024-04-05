import java.io.*;
import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.util.Scanner;
public class HorvathDaiana_lab8pb3{
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader inputStream = null;
        File file=new File("test.in");

        try(BufferedWriter writer=new BufferedWriter(new FileWriter(file)))
        {
            if (!file.exists())
                file.createNewFile();
            System.out.println("We write some variables in the file. ");
            writer.write("22/09/2002");
            writer.write("5/09/2012");
            System.out.println("File successfully written.");

        }
        catch(FileNotFoundException except)
        {
            except.printStackTrace();
            System.out.println("File could not be found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("test.in")));
            StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
            streamTokenizer.whitespaceChars('/', '/');
            streamTokenizer.wordChars(' ', ' ');
            int iterator = 0;

            NumberFormat nf = NumberFormat.getInstance();
            nf.setGroupingUsed(false); // no split after 3 numbers

            DateFormatSymbols symbols = new DateFormatSymbols();

            while (streamTokenizer.ttype != StreamTokenizer.TT_EOF) {
                int token = streamTokenizer.nextToken();
                if (token == StreamTokenizer.TT_NUMBER) {
                    if (iterator == 1) {
                        int x = (int) streamTokenizer.nval;
                        getYourMonth(symbols.getMonths()[x-1]); // Get month name
                    } else {
                        if (iterator == 0) { // day
                            if (streamTokenizer.nval < 10) {
                                System.out.print("0" + nf.format(streamTokenizer.nval) + " ");
                            } else
                                System.out.print(nf.format(streamTokenizer.nval) + " ");
                        } else { // year
                            System.out.print(nf.format(streamTokenizer.nval));
                            leapYear((int)streamTokenizer.nval);
                        }
                    }
                    iterator++;
                    if (iterator > 2) {
                        iterator = 0;
                        System.out.print("\n");
                    }
                }
            }
            System.out.println("\nEnd of file(EOF)");

        } catch (IOException e) {
            e.printStackTrace();
        }

        exitProgram();
    }

    public static void getYourMonth(String month) {
        System.out.println(month + " ");
    }

    public static void exitProgram() {
        System.out.println("\nPress X to exit the program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your input: ");
        String key = scanner.next();
        while (!key.equalsIgnoreCase("X")) {
            System.out.print("\nTry again\nYour input: ");
            key = scanner.next();
        }
        System.out.print("<<<<<Program terminated>>>>>");
    }

    public static void leapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap == true)
            System.out.print("\n"+year + " is a Leap Year.\n");
    }

}