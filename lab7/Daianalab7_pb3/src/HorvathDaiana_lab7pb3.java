//Build an application which contains a generic class SetterGetter which
// allows the user to set() and get() the attribute values for different types of objects.
// For example, given the classes Kid, Adult and Retired, enable the class to set and get the names and
// ages of the associated objects. Create collections with unique entries of type Kid, Adult and Retired,
// and which are populated with data read from the console. Print the read data using different methods.
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 class Human {
    protected String name;
    protected int age;

    public Human() {}

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 class SetterGetter<T extends Human> {

    void setName(T object, String name) {
        object.name = name;
    }

    String getName(T object) {
        return object.name;
    }

    void setAge(T object, int age) {
        object.age = age;
    }

    int getAge(T object) {
        return object.age;
    }

}

 class Retired extends Human {

    public Retired() {}

    public Retired(String name, int age) {
        super(name, age);
    }

}
 class Child extends Human {

    public Child() {}

    public Child(String name, int age) {
        super(name, age);
    }

}
 class Adult extends Human {

    public Adult() {}

    public Adult(String name, int age) {
        super(name, age);
    }

}

public class HorvathDaiana_lab7pb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Child> kids = addKid();
        Set<Adult> adults=addAdults();
        Set<Retired> retired= addRetired();

        System.out.println("The group of people is consisted by: ");
        show(kids);
        show(adults);
        show(retired);
    }

    private static Set<Child> addKid() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of kids: ");
            int number = scanner.nextInt();
            if (number == 0) {
                return null;
            }

            SetterGetter object = new SetterGetter();
            Set<Child> kids = new HashSet<>();

            System.out.println("Enter name and age: ");
            String name;
            int age;
            for (int i = 0; i < number; i++) {
                System.out.print("\nKid[" + (i + 1) + "]\nName: ");
                name = scanner.next();
                System.out.print("Age: ");
                age = scanner.nextInt();

                Child aux = new Child();
                object.setAge(aux, age);
                object.setName(aux, name);
                kids.add(aux);
            }
            return kids;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Set<Adult> addAdults() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter the number of adults: ");
            int number = scanner.nextInt();
            if (number == 0) {
                return null;
            }

            SetterGetter object = new SetterGetter();
            Set<Adult> adults = new HashSet<>();

            System.out.println("Enter name and age: ");
            String name;
            int age;
            for (int i = 0; i < number; i++) {
                System.out.print("\nAdult[" + (i + 1) + "]\nName: ");
                name = scanner.next();
                System.out.print("Age: ");
                age = scanner.nextInt();

                Adult aux = new Adult();
                object.setAge(aux, age);
                object.setName(aux, name);
                adults.add(aux);
            }
            return adults;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Set<Retired> addRetired() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter the number of retirees: ");
            int number = scanner.nextInt();
            if (number == 0) {
                return null;
            }

            SetterGetter object = new SetterGetter();
            Set<Retired> retired = new HashSet<>();

            System.out.println("Enter name and age: ");
            String name;
            int age;
            for (int i = 0; i < number; i++) {
                System.out.print("\nRetired[" + (i + 1) + "]\nName: ");
                name = scanner.next();
                System.out.print("Age: ");
                age = scanner.nextInt();

                Retired aux = new Retired();
                object.setAge(aux, age);
                object.setName(aux, name);
                retired.add(aux);
            }
            return retired;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    private static void show(Set<? extends Human> set) {

        if (set instanceof Child) System.out.println("Kids that are in database:"); //hashset
        else if (set instanceof Adult) System.out.println("Adults that are in database:");
        else if (set instanceof Retired) System.out.println("Retirees that are in database:");

        try {
            if (set.size() == 0)
                throw new Exception("This is null");
            SetterGetter object = new SetterGetter();

            for (Human instanceOfSet : set) {
                System.out.println("\nName: " + object.getName(instanceOfSet));
                System.out.println("Age: " + object.getAge(instanceOfSet));
            }

        } catch (Exception ex) {
            System.out.println("\nSomething went wrong!");
        }
    }

}

