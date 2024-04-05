import java.util.ArrayList;
import java.util.Random;

//Define an array of String variables that will be populated
// with all the playing cards from a complete package. A series of randomly picked cards
// will be extracted until the current card will have the clubs sign and a value greater than 8.
// At each step, the current card and the number of already extracted cards will be displayed.
public class HorvathDaiana_lab3pb9 {
    public static void main(String[] args)
    {

        String[] ranks={"Ace", "Deuce", "Three", "Four", "Five","Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits={"Diamonds", "Clubs", "Hearts", "Spades"};
       ArrayList<String> deck= new ArrayList<String>();

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(rank + " of " + suit);
               // System.out.print(" ");
            }
        }

       Random random=new Random();
       int j;
       int count=0;
       while (true)
       {
           j= random.nextInt(deck.size());
           if (deck.get(j).equals("Nine of Clubs") || deck.get(j).equals("Ten of clubs") || deck.get(j).equals("Jack of Clubs") || deck.get(j).equals("Queen of Clubs") || deck.get(j).equals("King of Clubs"))
           {
               System.out.print("Congratulations, you won!");
               break;
           }
           else
           {
               System.out.println(deck.get(j));
               deck.remove(j);

           }
           count++;
           System.out.println("You have extracted: "+ count + " cards");
       }


    }

    }



