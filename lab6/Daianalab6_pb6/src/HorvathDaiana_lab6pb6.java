//import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.util.Random;

//Write a Java application which implements an exception called OverSaturated.
// This exception is generated when the saturation of a color has a value over 90 in the
// HSV color space. Write a method which randomly generated colors in the RGB space and
// then converts them to the HSB/HSV space
// (https://www.cs.rit.edu/~ncs/color/t_convert.html). If after the conversion,
// the color's saturation is over 90, regenerate the color (In the testing phase, use an
// assertion to verify this internal invariant condition). After 10 consecutive tries to
// regenerate, throw an exception.
class OverSaturated extends Exception{
    OverSaturated()
    {
        super("Oversaturated exception!");
    }
}
public class HorvathDaiana_lab6pb6 {
    public static void genColor() throws Exception {
        int nr = 0;
        start:
        while(true) {
            Random rand = new Random();
            int r = rand.nextInt(255);
            int g = rand.nextInt(255);
            int b = rand.nextInt(255);
            Color color = new Color(r, g, b);

            float[] hsbvals = Color.RGBtoHSB(r, g, b, null);

            assert (hsbvals[1] > 0.9) : "nr >0.9";

            try{
                if (hsbvals[1]>0.9)
                {

                    throw new OverSaturated();

                }
                else {
                    System.out.println("The saturation: " + hsbvals[1]);
                    nr++;
                }
            }
            catch(OverSaturated e)
            {

                System.out.println(hsbvals[1]+" "+e.getMessage()+" The color will be regenerated!");
                continue start;
            }
               if (nr>=10)
            {
                throw new Exception("The max tries");
            }
        }


    }
        public static void main (String[] args) throws OverSaturated {
            try{
                genColor();
            }
            catch(OverSaturated e)
            {
                e.printStackTrace();

            }
            catch (Exception exc)
            {
                System.out.println(exc.getMessage());
            }


        }
}