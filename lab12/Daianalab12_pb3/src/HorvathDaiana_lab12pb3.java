import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class HorvathDaiana_lab12pb3 extends JFrame {
    private static final int CIRCLE_COUNT = 10;

    private JButton redButton;
    private JButton blackButton;
    private JLabel circleLabel;
    private JLabel resultLabel;

    private int correctAnswers;
    private long totalReactionTime;

    private Random random;

    public HorvathDaiana_lab12pb3() {
        setTitle("Reaction Time App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        redButton = new JButton("RED");
        blackButton = new JButton("BLACK");
        circleLabel = new JLabel();
        resultLabel = new JLabel();

        redButton.addActionListener(new ButtonListener());
        blackButton.addActionListener(new ButtonListener());

        setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(blackButton);

        add(circleLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(resultLabel, BorderLayout.NORTH);

        random = new Random();

        generateCircle();

        setVisible(true);
    }

    private void generateCircle() {
        int randomColor = random.nextInt(2);
        Color circleColor = (randomColor == 0) ? Color.RED : Color.BLACK;
        circleLabel.setBackground(circleColor);
        circleLabel.setOpaque(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            long reactionTime = System.currentTimeMillis() - totalReactionTime;

            if (button == redButton && circleLabel.getBackground() == Color.RED) {
                correctAnswers++;
            } else if (button == blackButton && circleLabel.getBackground() == Color.BLACK) {
                correctAnswers++;
            }

            totalReactionTime += reactionTime;

            if (correctAnswers < CIRCLE_COUNT) {
                generateCircle();
            } else {
                double averageReactionTime = (double) totalReactionTime / CIRCLE_COUNT;
                resultLabel.setText("Correct Answers: " + correctAnswers + " | Average Reaction Time: " + averageReactionTime + " ms");
                redButton.setEnabled(false);
                blackButton.setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HorvathDaiana_lab12pb3();
            }
        });
    }
}
