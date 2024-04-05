// Write a Frame application that draws a schematic car. Use different colors for different car
// parts (doors, wheels, etc.).
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class HorvathDaiana_lab10pb6 extends JPanel {
    private static final long serialVersionUID = 1L;
    public HorvathDaiana_lab10pb6( ) {  }
    public void paintComponent(Graphics g) {


        g.setColor(new Color(114, 114, 114));
         g.fillRect(50, 150, 400, 150);

         g.setColor(new Color(114, 114, 114));
         g.fillRect(145, 50, 200, 100);

        g.setColor(new Color(16, 16, 16, 63));
        g.fillRect(145, 175, 200, 100);

        g.setColor(new Color(16, 16, 16, 161));
        g.fillRect(300, 220, 25, 6);

        g.setColor(new Color(234, 234, 248, 73));
        g.fillRect(150, 55, 90, 90);

        g.setColor(new Color(236, 234, 248, 73));
        g.fillRect(250, 55, 90, 90);



        int width = getWidth()/2;
        int height = getHeight()/2;
        int radius=Math.min(width, height);
        g.setColor(new Color(0, 0, 0, 97));
        g.fillOval(80, 290, radius-150, radius-150);


        g.setColor(new Color(0, 0, 0, 97));
        g.fillOval(330, 290, radius-150, radius-150);

        g.setColor(new Color(0, 0, 0, 186));
        g.fillOval(85, 295, radius-160, radius-160);

        g.setColor(new Color(0, 0, 0, 186));
        g.fillOval(335, 295, radius-160, radius-160);

        g.setColor(new Color(238, 255, 0, 134));
        g.fillOval(410, 210, radius-205, radius-205);

    }
    public static void main(String args[ ]) {
        JFrame frame = new JFrame("Fulger McQueen");
        frame.add(new HorvathDaiana_lab10pb6( ));
        frame.setSize(500, 500);
        frame.setBackground(new Color(175, 198, 225, 255));
        frame.setVisible(true); //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } }