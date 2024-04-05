
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.util.Objects;
import static java.lang.System.exit;
//2. Implement the previous problem using a file as input source.
public class HorvathDaiana_lab8pb2 {
    public static void main(String[] args) {


        BufferedReader inputStream = null;
        File file=new File("ex2.txt");

        try(BufferedWriter writer=new BufferedWriter(new FileWriter(file)))
        {
            if (!file.exists())
                file.createNewFile();
            System.out.println("We write some variables in the file. ");
            writer.write("ana are mere si pere 1 2 3 exit 456");
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

            inputStream = new BufferedReader(new FileReader(file));
            StreamTokenizer st = new StreamTokenizer(inputStream);
            System.out.println("The variables are written from ex2.txt file. ");
            st.eolIsSignificant(true);
            boolean eof;
            do {
                int token = st.nextToken();
                eof = false;
                switch (token) {
                    case StreamTokenizer.TT_EOF -> {
                        System.out.println("End of File encountered.");
                        eof = true;
                    }
                    case StreamTokenizer.TT_EOL -> {
                        System.out.println("End of Line encountered.");
                        exit(1);
                    }

                    case StreamTokenizer.TT_WORD -> {
                        System.out.println("Word: " + st.sval);
                        if (Objects.equals(st.sval, "exit")) {
                            System.out.println("Program exited because the key word 'exit' was found.");
                            exit(1);

                        }
                    }
                    case StreamTokenizer.TT_NUMBER -> System.out.println("Number: " + st.nval);
                    default -> {
                        System.out.println((char) token + " encountered.");

                        if (token == '!') {
                            eof = true;
                        }

                    }
                }
            } while (!eof);
        }
        catch (IOException exc)
        {
            exc.printStackTrace();
        }





    }

}