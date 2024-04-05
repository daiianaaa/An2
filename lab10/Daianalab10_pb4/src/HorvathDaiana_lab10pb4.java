//Write a Frame application that displays a TV test card.
// The card will contain at least 10 levels of grey and the basic colors red, green, blue, yellow, cyan
// and magenta. The card will cover the entire surface of the component that displays it (Canvas, etc.).

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class HorvathDaiana_lab10pb4 extends JPanel {
    private static final long serialVersionUID = 1L;
    public HorvathDaiana_lab10pb4( ) {

    }
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.black);
        //g.drawRect(0, 0, 16, height);
        g.fillRect(0, 0, 25, height);

        g.setColor(new Color(36, 36, 36, 255));
        g.fillRect(25, 0, 25, height);

        g.setColor(new Color(51, 51, 51, 255));
        g.fillRect(50, 0, 25, height);

        g.setColor(new Color(58, 58, 58, 255));
        g.fillRect(75, 0, 25, height);

        g.setColor(new Color(72, 72, 72, 255));
        g.fillRect(100, 0, 25, height);

        g.setColor(new Color(79, 79, 79, 255));
        g.fillRect(125, 0, 25, height);

        g.setColor(new Color(86, 86, 86, 255));
        g.fillRect(150, 0, 25, height);

        g.setColor(new Color(93, 93, 93, 255));
        g.fillRect(175, 0, 25, height);

        g.setColor(new Color(114, 114, 114, 255));
        g.fillRect(200, 0, 25, height);

        g.setColor(new Color(255, 255, 255, 255));
        g.fillRect(225, 0, 25, height);

        g.setColor(new Color(246, 2, 2, 255));
        g.fillRect(250, 0, 25, height);

        g.setColor(Color.GREEN);
        g.fillRect(275, 0, 25, height);

        g.setColor(Color.BLUE);
        g.fillRect(300, 0, 25, height);

        g.setColor(Color.CYAN);
        g.fillRect(325, 0, 25, height);

        g.setColor(Color.MAGENTA);
        g.fillRect(350, 0, 25, height);



    }
    public static void main(String args[ ]) {
        JFrame frame = new JFrame("TV ");
        frame.add(new HorvathDaiana_lab10pb4( ));
        frame.setSize(375, 400);
        frame.setVisible(true); //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } }