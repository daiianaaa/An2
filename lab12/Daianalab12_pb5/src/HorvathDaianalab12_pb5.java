//Write a Java GUI application which includes a course registration form.
// The interface contains 2 TextField components for entering the name and the group and
// a ComboBox selection list for choosing the course name. The form has a ”Register” button
// that saves in a file the data entered by the user. Monitor the keyboard events for allowing only
// letters in the first TextField and only digits in the second one.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class HorvathDaianalab12_pb5 extends JFrame implements  ActionListener, KeyListener {

    private JTextField tf1;
    private JTextField tf2;

    private JButton jButton;
    private JLabel jLabel;

    private JLabel ta1;

    private JLabel ta2;



    private JLabel ta5;



    private JComboBox j3;




    public HorvathDaianalab12_pb5() {
        this.setPreferredSize(new Dimension(800, 600));
        setLayout(new GridBagLayout());
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagConstraints gbc1 = new GridBagConstraints();

        String[] course = {"SE", "PECC", "FEC", "ASC", "ED", "Microwaves"};
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.tf1 = new JTextField();
        this.tf2 = new JTextField();


        this.ta1 = new JLabel("Name: ");
        this.ta2 = new JLabel("Group: ");
        this.ta5 = new JLabel("Course: ");



        this.j3 = new JComboBox(course);


        this.jButton = new JButton("Register!");
        this.jLabel = new JLabel();


        gbc.gridx = 0;
        gbc.gridy = 100;
        gbc.ipadx = 40;
        this.add(ta1, gbc);

        gbc.gridx = 1000;
        gbc.gridy = 100;
        gbc.ipadx = 100;
        this.add(tf1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 200;
        gbc.ipadx = 40;
        this.add(ta2, gbc);

        gbc.gridx = 1000;
        gbc.gridy = 200;
        gbc.ipadx = 100;
        this.add(tf2, gbc);


        gbc.gridx = 0;
        gbc.gridy = 500;
        gbc.ipadx = 40;
        this.add(ta5, gbc);

        gbc.gridx = 1000;
        gbc.gridy = 500;
        gbc.ipadx = 40;
        this.add(j3, gbc);


        gbc.gridx = 0;
        gbc.gridy = 1400;
        gbc.ipadx = 40;
        add(jButton, gbc);


        jButton.addActionListener(ae -> {


             String name = tf1.getText();
            String group = tf2.getText();
            String course_get = j3.getSelectedItem().toString();

            //results.append("Financing: " )

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("registration.txt", true));
                writer.write("Name: " +  name +"\n "+ ", Group: " + group +"\n "+ ", Course: " + course_get);
                writer.newLine();
                writer.close();
                JOptionPane.showMessageDialog(this, "Registration successful!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error occurred while saving data to file.");
            }

        });
        this.add(jLabel, gbc);

        this.pack();
    }


    public void keyTyped(KeyEvent e) {
        if (e.getSource() == tf1) {
            char c = e.getKeyChar();
            if (!Character.isLetter(c)) {
                JOptionPane.showMessageDialog(this, "Enter characters only");
            }
        } else if (e.getSource() == tf2) {
            char c = e.getKeyChar();
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(this, "Enter numbers only");
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    public static void main(String[] args) {

        HorvathDaianalab12_pb5 frame = new HorvathDaianalab12_pb5();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}