//Implement a Java application that uses GridBagLayout for arranging the components
// specific to a computing application. (TextField for I/O operations, buttons for numbers,
// mathematical operations, screen cleaning, etc.).
import javax.swing.*;

import java.awt.*;

public class HorvathDaiana_lab11pb2 extends JFrame {

    public HorvathDaiana_lab11pb2() {

        super("Calculator");

        GridBagLayout grid=new GridBagLayout();
        GridBagConstraints text=new GridBagConstraints();
        GridBagConstraints gbc=new GridBagConstraints();
        GridBagConstraints zero=new GridBagConstraints();
        setLayout(grid);
        setTitle("Calculator");

        this.setLayout(grid);

        gbc.fill=GridBagConstraints.HORIZONTAL;

        text.gridx=0;
        text.gridy=0;
        text.gridwidth=4;
        text.gridheight=1;
        text.ipadx=298;
        text.ipady=10;
        this.add(new TextField(), text);

        gbc.gridx=0;
        gbc.gridy=1;
        this.add(new Button("C"), gbc);

        gbc.gridx=1;
        gbc.gridy=1;
        this.add(new Button("+/-"), gbc);

        gbc.gridx=2;
        gbc.gridy=1;
        this.add(new Button("%"), gbc);

        gbc.gridx=3;
        gbc.gridy=1;
        this.add(new Button("/"), gbc);


        gbc.gridx=0;
        gbc.gridy=2;
        this.add(new Button("7"), gbc);

        gbc.gridx=1;
        gbc.gridy=2;
        this.add(new Button("8"), gbc);

        gbc.gridx=2;
        gbc.gridy=2;
        this.add(new Button("9"), gbc);

        gbc.gridx=3;
        gbc.gridy=2;
        this.add(new Button("X"), gbc);

        gbc.gridx=0;
        gbc.gridy=3;
        this.add(new Button("4"), gbc);

        gbc.gridx=1;
        gbc.gridy=3;
        this.add(new Button("5"), gbc);

        gbc.gridx=2;
        gbc.gridy=3;
        this.add(new Button("6"), gbc);

        gbc.gridx=3;
        gbc.gridy=3;
        this.add(new Button("-"), gbc);

        gbc.gridx=0;
        gbc.gridy=4;
        this.add(new Button("1"), gbc);

        gbc.gridx=1;
        gbc.gridy=4;
        this.add(new Button("2"), gbc);

        gbc.gridx=2;
        gbc.gridy=4;
        this.add(new Button("3"), gbc);

        gbc.gridx=3;
        gbc.gridy=4;
        this.add(new Button("+"), gbc);

        zero.gridx=0;

        zero.gridwidth=2;
        zero.ipadx=55;
        this.add(new Button("0"), zero);

//        gbc.gridx=1;
//        gbc.gridy=4;
//        this.add(new Button("Del"), gbc);


        gbc.gridx=2;
        gbc.gridy=5;
        this.add(new Button(","), gbc);

        gbc.gridx=3;
        gbc.gridy=5;
        this.add(new Button("="), gbc);


           setSize(300, 300);
           setPreferredSize(getSize());
           setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



        // Define the panel to hold the buttons
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.cyan);
//        // panel.setSize(100,100);
//        // panel.setLocation(5, 2);
//        panel.setLayout(new GridBagLayout());

       // JTextField td = new JTextField(4);
        //td.setSize(100, 100);

        // td.setFont(new Font("Arial", Font.PLAIN, 18));

       // panel.add(td);



        //this.add(td);
       // setSize(300, 300);
//        JPanel nimic=new JPanel();
//        this.add(nimic);
//        this.add(buttons);

        // show the window
        //this.pack();
       // this.setVisible(true);



    public static void main(String[] args) {

        new HorvathDaiana_lab11pb2();
    }

}
