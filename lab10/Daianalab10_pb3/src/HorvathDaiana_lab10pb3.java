//Write a Frame application that displays an image stored in a local file.
// Below the image display the filename with a predefined Font. The text is drawn using
// a color composed of 3 predefined components (red, green, blue).
import java.awt.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class MyFrame extends Frame implements WindowListener{

    MyCanvas canvas;

    MyFrame(String title){
        super(title);
        setSize(400, 400);
        GridLayout grid=new GridLayout(2, 1);

        canvas = new MyCanvas();
        add(canvas);

        this.addWindowListener(this);

        TextField text=new TextField("image_01");
        text.setSize(150, 300);
        //text.setBackground(Color.red);


        add(text);


        setVisible(true);
    }

    @Override
    public void windowActivated(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public void windowClosed(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public void windowClosing(WindowEvent arg0) {
        System.exit(1);

    }
    @Override
    public void windowDeactivated(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public void windowDeiconified(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public void windowIconified(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public void windowOpened(WindowEvent arg0) {
        // TODO Auto-generated method stub

    }

}

class MyCanvas extends Canvas{

    Graphics g;


    BufferedImage bi = null;

    //String text="image_01";
    MyCanvas(){

        this.setSize(new Dimension(309, 205));

        try {
            bi = ImageIO.read(new File("image_01.jpg"));


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Image could not be read");
            System.exit(1);
        }

    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(bi, 20, 20, this);

    }

}

public class HorvathDaiana_lab10pb3{
    public static void main(String...strings){

        MyFrame frame = new MyFrame("Painting on a Canvas");

    }
}