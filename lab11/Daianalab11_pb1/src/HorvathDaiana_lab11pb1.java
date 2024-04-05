// Implement a Java application that uses GridLayout for arranging the
// components specific to a computing application. (TextField for I/O operations,
// buttons for numbers, mathematical operations, screen cleaning, etc.).
import javax.swing.*;

import java.awt.*;

public class HorvathDaiana_lab11pb1 extends JFrame {

    public HorvathDaiana_lab11pb1() {

        super("Calculator");
        this.setSize(300, 500);
        this.setLayout(new GridLayout(3,1));
        this.setBackground(Color.cyan);

        // Define new buttons
        JButton jb1 = new JButton("C");
        jb1.setSize(200, 100);
        JButton jb2 = new JButton("+/-");
        JButton jb3 = new JButton("%");
        JButton jb4 = new JButton("%");
        JButton jb5 = new JButton("7");
        JButton jb6 = new JButton("8");
        JButton jb7 = new JButton("9");
        JButton jb8 = new JButton("X");
        JButton jb9 = new JButton("4");
        JButton jb10 = new JButton("5");
        JButton jb11 = new JButton("6");
        JButton jb12 = new JButton("-");
        JButton jb13 = new JButton("1");
        JButton jb14 = new JButton("2");
        JButton jb15 = new JButton("3");
        JButton jb16 = new JButton("+");
        JButton jb17 = new JButton("0");
       // jb17.setSize(19, 5);
        JButton jb18 = new JButton(",");
        JButton jb19 = new JButton("=");


        // Define the panel to hold the buttons
        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
       // panel.setSize(100,100);
       // panel.setLocation(5, 2);
        panel.setLayout(new GridLayout(1, 1));

        JTextField td = new JTextField(4);
        //td.setSize(100, 100);

       // td.setFont(new Font("Arial", Font.PLAIN, 18));

        panel.add(td);

        JPanel buttons = new JPanel(new GridLayout(5,4));
        buttons.add(jb1);
        buttons.add(jb2);
        buttons.add(jb3);
        buttons.add(jb4);
        buttons.add(jb5);
        buttons.add(jb6);
        buttons.add(jb7);
        buttons.add(jb8);
        buttons.add(jb9);
        buttons.add(jb10);
        buttons.add(jb11);
        buttons.add(jb12);
        buttons.add(jb13);
        buttons.add(jb14);
        buttons.add(jb15);
        buttons.add(jb16);
        buttons.add(jb17);
        buttons.add(jb18);
        buttons.add(jb19);

        this.add(td);
        JPanel nimic=new JPanel();
        this.add(nimic);
        this.add(buttons);

        // show the window
       //this.pack();
       this.setVisible(true);

    }

    public static void main(String[] args) {
            new HorvathDaiana_lab11pb1();
    }

}
