import java.io.*;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;
//Using a KB reading mechanism (BufferedReader/InputStreamReader) input: a
// message of String type, a day as an integer, a month as a String and a year as
// an integer variable. The process will end by passing to a new line, or by typing
// a special String. Separate and display the tokens on different rows. Display all fields
// extracted from the stream as appeared.
//Recommendation: use the StreamTokenizer class, the attributes sval, nval and the TT_EOL constant.
//Consider the case in which the application is not aware of the entered data type (numbers, words).
// Use the constants TT_NUMBER, TT_WORD.
public class HorvathDaiana_lab8pb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new InputStreamReader(System.in));
            StreamTokenizer st = new StreamTokenizer(inputStream);
            System.out.println("Enter some inputs! You can enter string for month, integer for day ");
            System.out.println("You can also type a special String to exit the run: exit:) ");
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
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}