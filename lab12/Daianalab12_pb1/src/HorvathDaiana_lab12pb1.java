//calculator implementation

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HorvathDaiana_lab12pb1 {
    private JFrame frame;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                HorvathDaiana_lab12pb1 window = new HorvathDaiana_lab12pb1();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public HorvathDaiana_lab12pb1() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setBounds(100, 100, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(10, 10, 260, 40);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton button1 = createNumberButton("1", 10, 60);
        JButton button2 = createNumberButton("2", 80, 60);
        JButton button3 = createNumberButton("3", 150, 60);
        JButton button4 = createNumberButton("4", 10, 130);
        JButton button5 = createNumberButton("5", 80, 130);
        JButton button6 = createNumberButton("6", 150, 130);
        JButton button7 = createNumberButton("7", 10, 200);
        JButton button8 = createNumberButton("8", 80, 200);
        JButton button9 = createNumberButton("9", 150, 200);
        JButton button0 = createNumberButton("0", 80, 270);

        JButton buttonPlus = createOperatorButton("+", 220, 60);
        JButton buttonMinus = createOperatorButton("-", 220, 130);
        JButton buttonMultiply = createOperatorButton("*", 220, 200);
        JButton buttonDivide = createOperatorButton("/", 220, 270);
        JButton buttonEquals = createEqualsButton("=", 150, 270);
        JButton buttonClear = createClearButton("C", 10, 270);

        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);
        frame.getContentPane().add(button5);
        frame.getContentPane().add(button6);
        frame.getContentPane().add(button7);
        frame.getContentPane().add(button8);
        frame.getContentPane().add(button9);
        frame.getContentPane().add(button0);
        frame.getContentPane().add(buttonPlus);
        frame.getContentPane().add(buttonMinus);
        frame.getContentPane().add(buttonMultiply);
        frame.getContentPane().add(buttonDivide);
        frame.getContentPane().add(buttonEquals);
        frame.getContentPane().add(buttonClear);
    }

    private JButton createNumberButton(String label, int x, int y) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + label);
            }
        });
        button.setBounds(x, y, 60, 60);
        return button;
    }

    private JButton createOperatorButton(String label, int x, int y) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + " " + label + " ");
            }
        });
        button.setBounds(x, y, 60, 60);
        return button;
    }

    private JButton createEqualsButton(String label, int x, int y) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String expression = textField.getText();
                String[] tokens = expression.split(" ");
                if (tokens.length != 3) {
                    JOptionPane.showMessageDialog(frame, "Invalid expression!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double num1 = Double.parseDouble(tokens[0]);
                double num2 = Double.parseDouble(tokens[2]);
                String operator = tokens[1];

                double result = 0;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(frame, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        result = num1 / num2;
                        break;
                }

                textField.setText(Double.toString(result));
            }
        });
        button.setBounds(x, y, 60, 60);
        return button;
    }

    private JButton createClearButton(String label, int x, int y) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        button.setBounds(x, y, 60, 60);
        return button;
    }
}
