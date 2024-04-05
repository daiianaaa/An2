//5. Write a Frame application that draws a circle colored in all the possible colors.
// The starting color is red and the color transitions must be made as smooth as possible.

import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class HorvathDaiana_lab10pb5 extends JPanel  {
    private static final long serialVersionUID = 1L;
    static GradientPaint gradient;
    public HorvathDaiana_lab10pb5( ) {  }
    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(gradient);
        int diameter = Math.min(getWidth(), getHeight());
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;

         g2d.fillOval(50, 50, diameter-100, diameter-100);
    }


    public static void main(String args[ ]) {
        JFrame frame = new JFrame("Disco Ball");
        frame.add(new HorvathDaiana_lab10pb5( ));
        frame.setSize(500, 500);
        frame.setVisible(true);

        Thread thread=new Thread(()->{

            Random random=new Random();
            //GradientPaint gradient;
            Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.orange, Color.MAGENTA, Color.CYAN, Color.WHITE, Color.PINK, Color.YELLOW};
            int i=0;
            int j=0;
               while(true)
                {
                    i=random.nextInt(0, colors.length);
                    j=random.nextInt(0, colors.length);
                    if (i==j)
                    {
                        i= random.nextInt(0, colors.length);
                    }

                    gradient = new GradientPaint(0, 0, colors[i], frame.getWidth(), 0, colors[j]);

                        frame.repaint();
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }



                }

        });
        thread.start();

    }

}