import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HorvathDaiana_lab12pb2 extends JFrame {
    private JPanel colorPanel;
    private JSlider redSlider;
    private JSlider greenSlider;
    private JSlider blueSlider;

    public HorvathDaiana_lab12pb2() {
        setTitle("Color Slider App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the color panel
        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(100, 100));
        add(colorPanel, BorderLayout.CENTER);

        // Create the sliders
        redSlider = createSlider("Red", 0, 255);
        greenSlider = createSlider("Green", 0, 255);
        blueSlider = createSlider("Blue", 0, 255);

        // Add listeners to update the color panel
        SliderChangeListener listener = new SliderChangeListener();
        redSlider.addChangeListener(listener);
        greenSlider.addChangeListener(listener);
        blueSlider.addChangeListener(listener);

        // Create the control panel to hold the sliders
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3, 1));
        controlPanel.add(redSlider);
        controlPanel.add(greenSlider);
        controlPanel.add(blueSlider);
        add(controlPanel, BorderLayout.EAST);

        pack();
        setLocationRelativeTo(null); // Center the window on the screen
    }

    private JSlider createSlider(String label, int min, int max) {
        JSlider slider = new JSlider(min, max, 0);
        slider.setMajorTickSpacing(50);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setBorder(BorderFactory.createTitledBorder(label));
        return slider;
    }

    private class SliderChangeListener implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {
            int red = redSlider.getValue();
            int green = greenSlider.getValue();
            int blue = blueSlider.getValue();
            Color color = new Color(red, green, blue);
            colorPanel.setBackground(color);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HorvathDaiana_lab12pb2 app = new HorvathDaiana_lab12pb2();
            app.setVisible(true);
        });
    }
}
