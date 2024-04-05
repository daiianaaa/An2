import java.util.Scanner;

//Develop a Java program which defines a class named Person that contains as private
// attributes: name (String), latitude and longitude (float). The class contains an
// explicit constructor without parameters that will initialize the latitude and longitude
// with 0 and the string with null. A finalize() method will be used as a destructor from
// C++ and will display a message. The mutator methods, setName(), setLongitude() and
// setLatitude() will be defined to modify the attributes of the class. Define appropriate
// accesor methods. Instantiate n objects, read the corresponding data from the keyboard
// and display the information related to all the objects.
class Person{
    private StringBuilder name;
    private float latitude;
    private float longitutde;
    Person()
    {
        float latitude=0;
        float longitude=0;
        String name=null;

    }

    public void setLongitude(float longitutde)
    {

     this.longitutde=longitutde;
    }
    public void setLatitude(float latitude)
    {

        this.latitude=latitude;
    }
    public void setName(StringBuilder name)
    {

        this.name=name;
    }
    public float getLatitude()
    {
        return latitude;
    }
    public float getLongitutde()
    {
        return longitutde;
    }
    public StringBuilder getName() {
        return name;
    }
    @Override
    public void finalize()
    {
        System.out.println("Finalize method!");
    }

}
public class HorvathDaiana_lab4pb4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n= scanner.nextInt();
        Person obj[]=new Person[n];
        for (int i=0; i<n; i++)
        {
            obj[i]=new Person();
            System.out.println("Enter the name: ");
            StringBuilder nume= new StringBuilder(scanner.next());
            obj[i].setName(nume);

            System.out.println("Enter the latitude of the place where the person is: ");
            float latitudine= scanner.nextFloat();
            obj[i].setLatitude(latitudine);

            System.out.println("Enter the longitude of the place where the person is: ");
            float longitudine= scanner.nextFloat();
            obj[i].setLatitude(longitudine);
        }
        obj=null;
        System.gc();


    }
}