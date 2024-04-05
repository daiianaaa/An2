// Implement a TabbedView Java application that displays in each graphical panel:
//- a drawing area
//- the necessary components for selecting a font type, size and color
//- the necessary components for choosing a geometrical shape (from a predefined set) and a
// size for the side / radius (as the case)


import java.awt.*;
import javax.swing.*;

public class HorvathDaiana_lab11pb3 {
    final static String BUTTONPANEL = "Tab with DRAWING AREA";
    final static String TEXTPANEL = "Tab with selecting text attributes ";

    final static String GEOMETRICPANEL="Tab for selecting a geometrical shape and size";


    public void addComponentToPane(Container pane) {
        JTabbedPane tabbedPane = new JTabbedPane();
    String[] font={"Calibri", "Times New Roman", "Arial", "Calibri light"};
    String[] size={"10", "11", "12", "13", "14", "15"};
    String[] colors={"black", "red", "blue", "green", "purple"};
    String [] geom_shape={"rectangle", "triangle", "circle", "square"};

        //Create the "cards".
        JPanel card1 = new JPanel() ;

        card1.add(new JPanel());


        JPanel card2 = new JPanel();
        card2.add(new JComboBox(font));
        card2.add(new JComboBox(size));
        card2.add(new JComboBox(colors));

        JPanel card3=new JPanel();
        card3.add(new JComboBox(geom_shape));
        card3.add(new TextField( 5));

        tabbedPane.addTab(BUTTONPANEL, card1);
        tabbedPane.addTab(TEXTPANEL, card2);
        tabbedPane.addTab(GEOMETRICPANEL, card3);

        pane.add(tabbedPane, BorderLayout.CENTER);
    }


    private static void createAndShowGUI() {

        JFrame frame = new JFrame("TabbedView_01");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        HorvathDaiana_lab11pb3 demo = new HorvathDaiana_lab11pb3();
        demo.addComponentToPane(frame.getContentPane());


        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        }
        catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        catch (InstantiationException ex) {
            ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }



        createAndShowGUI();

    }
}