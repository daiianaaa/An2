//Implement a class called UserFile (name, extension, type, size in bytes, constructors,
// mutators, accesors). The types of files are predefined and stored in a Hashtable object
// (for example "image"->0, "text"->1, "application"->2, etc.) Create a list of objects from this
// class and read from the keyboard the associated info. Print all the specific extensions of the
// predefined file types. Order the file list based on size and print the result.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;

public class HorvathDaiana_lab7pb4 {

    public static void main(String[] args) {
        ArrayList<UserFile> files = addFiles();
        orderFilesAndShow(files);
    }

    private static ArrayList<UserFile> addFiles() {
        ArrayList<UserFile> files = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of files: ");
            int noFiles = scanner.nextInt();
            String name, extension, type;
            int sizeInBytes;
            boolean ok;
            for (int i = 0; i < noFiles; i++) {
                System.out.print("\nFile[" + (i + 1) + "]\nName: ");
                name = scanner.next();
                System.out.print("Extension: ");
                extension = scanner.next();
                System.out.print("Type (image, text, or application): ");
                type = scanner.next();
                ok = true;

                Hashtable<Integer, String> tableType = new Hashtable<>();
                switch (type) {
                    case "image":
                        tableType.put(0, type);
                        break;
                    case "text":
                        tableType.put(1, type);
                        break;
                    case "application":
                        tableType.put(2, type);
                        break;
                    default:
                        System.out.println("\nNot a valid input!\nTry again!");
                        i--;
                        ok = false;
                }
                if (ok) {
                    System.out.print("Enter file size in bytes: ");
                    sizeInBytes = scanner.nextInt();
                    UserFile object = new UserFile(name, extension, tableType, sizeInBytes);
                    files.add(object);
                }
            }
            return files;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private static void orderFilesAndShow(ArrayList<UserFile> list) {
        System.out.println("\nYour ordered list: ");
        Collections.sort(list);
        for (UserFile userfile : list) {
            System.out.println("\nFile name: " + userfile.getName());
            System.out.println("File size: " + userfile.getSizeInBytes());
        }
    }
}

import java.util.Hashtable;

public class UserFile implements Comparable<UserFile> {
    private String name;
    private String extension;
    private Hashtable<Integer, String> type;
    private int sizeInBytes;

    public UserFile(String name, String extension, Hashtable<Integer, String> type, int sizeInBytes) {
        this.name = name;
        this.extension = extension;
        this.type = type;
        this.sizeInBytes = sizeInBytes;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public Hashtable<Integer, String> getType() {
        return type;
    }

    @Override
    public int compareTo(UserFile object) {
        if (this.getSizeInBytes() != object.getSizeInBytes()) {
            return this.getSizeInBytes() - object.getSizeInBytes();
        } else {
            return this.getName().compareTo(object.getName());
        }
    }
}
