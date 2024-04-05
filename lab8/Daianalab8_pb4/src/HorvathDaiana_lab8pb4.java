//You are given a binary file which contains a sequence of characters representing
// a private Bitcoin key (256 characters). From the keyboard read a sequence of characters
// which represents the public key for a Bitcoin. Generate the transaction id for this
// information by using the XOR bitwise operator applied upon the private and public keys.
// Write the result in another binary file
import java.io.*;

public class HorvathDaiana_lab8pb4 {

    public static void main(String[] args) {
        String privateKeyFilePath = "private.key";
        String transactionIdFilePath = "transaction.id";

        try {
            // Read private key from binary file
            FileInputStream privateInput = new FileInputStream(privateKeyFilePath);
            byte[] privateKeyBytes = privateInput.readAllBytes();
            privateInput.close();

            // Read public key from console
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter public key: ");
            String publicKey = reader.readLine();

            // Convert public key to byte array
            byte[] publicKeyBytes = publicKey.getBytes();

            // XOR the two keys to get transaction ID
            byte[] transactionIdBytes = new byte[privateKeyBytes.length];
            for (int i = 0; i < privateKeyBytes.length; i++) {
                transactionIdBytes[i] = (byte) (privateKeyBytes[i] ^ publicKeyBytes[i]);
            }

            // Write transaction ID to binary file
            FileOutputStream transactionOutput = new FileOutputStream(transactionIdFilePath);
            transactionOutput.write(transactionIdBytes);
            transactionOutput.close();

            System.out.println("Transaction ID successfully generated and saved to file!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
