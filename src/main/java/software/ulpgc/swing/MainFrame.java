package software.ulpgc.swing;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JFreePanelHistogramDisplay histogram;

    public MainFrame() {
        setTitle("Histogram");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        add(createHistogramDisplay());
    }

    private Component createHistogramDisplay() {
        JFreePanelHistogramDisplay jFreePanelHistogramDisplay = new JFreePanelHistogramDisplay();
        histogram = jFreePanelHistogramDisplay;
        return jFreePanelHistogramDisplay;
    }
}
