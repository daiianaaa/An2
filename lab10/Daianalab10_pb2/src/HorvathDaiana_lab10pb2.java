//Write a Frame application that will draw, inside a Canvas component,
// a circle tangent to smaller side of the canvas.
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class HorvathDaiana_lab10pb2 extends JPanel {
    private static final long serialVersionUID = 1L;
    public HorvathDaiana_lab10pb2( ) {  }
    public void paintComponent(Graphics g) {
        int width = getWidth()/2;
        int height = getHeight()/2;
        int radius=Math.min(width, height);
        g.setColor(Color.magenta);
        g.drawOval(width-radius, height-radius, 2*radius, 2*radius);


    }
    public static void main(String args[ ]) {
        JFrame frame = new JFrame("Circle Sample");
        frame.add(new HorvathDaiana_lab10pb2( ));
        frame.setSize(200, 300);
        frame.setVisible(true); //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } }
