package software.ulpgc.swing;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;
import software.ulpgc.Histogram;
import software.ulpgc.HistogramDisplay;

import javax.swing.*;

public class JFreePanelHistogramDisplay extends JPanel implements HistogramDisplay {
    @Override
    public void show(Histogram histogram) {
        add(new ChartPanel(chartOf(histogram)));
    }

    private JFreeChart chartOf(Histogram histogram) {
        return ChartFactory.createHistogram(
                histogram.tittle(),
                histogram.xAxis(),
                histogram.yAxis(),
                dataset(histogram.data(), histogram.bins())
        );
    }

    private IntervalXYDataset dataset(double[] data, int bins) {
        HistogramDataset histogramDataset = new HistogramDataset();
        histogramDataset.addSeries("x", data, bins);
        return histogramDataset;
    }
}
