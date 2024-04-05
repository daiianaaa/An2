import java.util.Scanner;

//Write a Java application that reads an int value. If the int value is between 1-12,
// the corresponding string month will be displayed.
// If the value entered is a string and if it corresponds to a month of the year,
// display the numeric value of the month.
public class Daianalab3_pb1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter either the number of the month or the name of the month: ");
        String in=scanner.nextLine();
        if (in.matches("\\d+"))
        {
            int monthNr=Integer.parseInt(in);
            if (monthNr>=1 && monthNr<=12)
            {
                String month=GetMonthName(monthNr);
                System.out.println(month);
            }
            else
            {
                System.out.println("Invalid expression.");
            }
        }
        else
        {
            int monthNr=GetMonthNr(in);
            if (monthNr != -1)
            {
                System.out.println(monthNr);
            }
            else {
                System.out.println("Invalid input! ");
            }
        }



    }
    public static String GetMonthName(int numberMonth)
    {
        switch (numberMonth) {
            case 1->
                    {
                return "January";
                }
            case 2-> {
                return "February";
            }
            case 3->
            {
                return "March";
            }
            case 4-> {
                return "April";
            }
            case 5-> {
                return "May";
            }
            case 6-> {
                return "June";
            }
            case 7-> {
                return "July";
            }
            case 8-> {
                return "August";
            }
            case 9-> {
                return "September";
            }
            case 10-> {
                return "October";
            }
            case 11-> {
                return "November";
            }
            case 12-> {
                return "December";
            }
            default-> {
                return "Invalid month number";
            }
        }
    }
    public static int GetMonthNr(String monthString)
    {
        switch (monthString.toLowerCase()) {
            case "january"-> {
                return 1;
            }
            case "february"-> {
                return 2;
            }
            case "march"-> {
                return 3;
            }
            case "april"-> {
                return 4;
            }
            case "may"->{
                return 5;
            }
            case "june"-> {
                return 6;
            }
            case "july"-> {
                return 7;
            }
            case "august"-> {
                return 8;
            }
            case "september"-> {
                return 9;
            }
            case "october"-> {
                return 10;
            }
            case "november"-> {
                return 11;
            }
            case "december"-> {
                return 12;
            }
            default-> {
                return -1;
            }
        }
    }


}