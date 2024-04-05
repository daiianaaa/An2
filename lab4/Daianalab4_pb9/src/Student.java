import java.util.Arrays;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private String name;
    private String telNumber;
    private double avgMark;

    public Student(String name, String telNumber, double avgMark) {
        this.name = name;
        this.telNumber = telNumber;
        this.avgMark = avgMark;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelNumber() {

        return telNumber;
    }

    public void setTelNumber(String telNumber) {

        this.telNumber = telNumber;
    }

    public double getAvgMark() {

        return avgMark;
    }

    public void setAvgMark(double avgMark) {

        this.avgMark = avgMark;
    }

    @Override
    public int compareTo(Student other) {

        return name.compareTo(other.name);
    }

    public static void HorvathDaiana_lab4pb9(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter data for student " + (i+1) + " (name^^^tel. number^^^average mark): ");
            scanner.nextLine(); // consume the newline character
            String input = scanner.nextLine();
            String[] parts = input.split("\\^\\^\\^");

            // Validate telephone number
            boolean validNumber = parts[1].matches("[0-9\\-\\. ]{10}");
            while (!validNumber) {
                System.out.print("Invalid telephone number. Please enter a 10-digit number with or without spaces, hyphens, or dots: ");
                parts[1] = scanner.nextLine();
                validNumber = parts[1].matches("[0-9\\-\\. ]{10}");
            }

            Student student = new Student(parts[0], parts[1], Double.parseDouble(parts[2]));
            students[i] = student;
        }

        // Sort by name
        Arrays.sort(students);

        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getTelNumber() + " - " + student.getAvgMark());
        }

        // Sort by average mark
        Arrays.sort(students, (s1, s2) -> Double.compare(s2.getAvgMark(), s1.getAvgMark()));

        System.out.println("Students sorted by average mark:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getTelNumber() + " - " + student.getAvgMark());
        }
    }
}