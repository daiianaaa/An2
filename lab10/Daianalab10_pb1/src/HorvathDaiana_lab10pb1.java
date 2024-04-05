// Write a Frame application that will display in a panel your name and group.
// The text will be blue and centered both on the horizontal and vertical, given the dimension of the panel.
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class HorvathDaiana_lab10pb1 extends JPanel {
    private static final long serialVersionUID = 1L;
    private  String mesaj="Horvath Daiana, group E_2022";
    public HorvathDaiana_lab10pb1() {  }
    public void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();

        FontMetrics fm = g.getFontMetrics();
        int stringWidth=fm.stringWidth(mesaj);
        int x = (width - stringWidth) / 2;

        int stringHeight=fm.getAscent();
        int y = (height - stringHeight) / 2;
        g.setColor(Color.blue);
        g.drawString(mesaj, x, y);
        //g.drawOval(0, 0, width, height);
    }
    public static void main(String args[ ]) {
        JFrame frame = new JFrame("Oval Sample");
        frame.add(new HorvathDaiana_lab10pb1( ));
        frame.setSize(300, 300);
        frame.setVisible(true); //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } }