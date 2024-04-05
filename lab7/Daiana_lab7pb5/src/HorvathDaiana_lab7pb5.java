// Write a class named Student that has the private fields name,
// group, average_mark, and getter / setter methods for all the attributes.
// In the main() method, placed in another class, create a sortedSet collection,
// with Student type objects, initialized with values read from the keyboard, that will
// keep the elements in descending order by average_mark and in ascending order by name
// (the students that have the same average will appear in alphabetic order). Browse the
// collection using for-loop and display all the items. Then browse the collection with an
// iterator and display all students with average_mark> = 8. Browse the collection with
// forEach () and display all student data in a particular group.

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
class Student implements Comparable<Student> {
    private String name;
    private int group;
    private double average;

    public Student() {}

    public Student(String name, int group, double average) {
        this.name = name;
        this.group = group;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getAverage() != o.getAverage()) {
            return (int) (o.getAverage() - this.getAverage());
        } else {
            return o.getName().compareTo(this.getName());
        }
    }

}
public class HorvathDaiana_lab7pb5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Set<Student> students = addStudents();
        show(students);
    }

    private static Set<Student> addStudents() {

            System.out.print("Enter the number of students: ");
            int number = scanner.nextInt();
            if (number == 0)
                return null;

            Set<Student> stud = new HashSet<>();
            System.out.println("Enter name, group, average: ");
            String name;
            int group;
            double average;

            for (int i = 0; i < number; i++) {
                System.out.print("\nStudent" + (i + 1) + "\nName: ");
                name = scanner.next();
                System.out.print("Group: ");
                group = scanner.nextInt();
                System.out.print("Average: ");
                average = scanner.nextDouble();

                Student aux = new Student();
                aux.setName(name);
                aux.setGroup(group);
                aux.setAverage(average);
                stud.add(aux);
            }
            return stud;

    }

    private static void show(Set<Student> set) {

            if (set.size() == 0)

                System.out.println("There are no students!");

            for (Student i : set) {
                System.out.println("\nName: " + i.getName());
                System.out.println("Group: " + i.getGroup());
                System.out.println("Average: " + i.getAverage());
            }

            Iterator<Student> itr = set.iterator();
            System.out.println("\nStudents with grades >=8 ");
            while (itr.hasNext()) {
                Student x = itr.next();

                if (x.getAverage() >= 8) {
                    System.out.print(x.getName()+" ");
                }
            }

            System.out.println("\n\nFrom which group do you want to find the student?(2021, 2022, 2023 are the available groups) ");
            int gr= scanner.nextInt();

            set.forEach((n) -> { // getting all the students from certain group
                if (n.getGroup() == gr)
                    System.out.print( n.getName()+" ");
                else
                    System.out.println("There are no students in that group.:(");
            });
            
    }
}


