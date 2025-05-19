import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ExpenseChart extends JFrame {

    public ExpenseChart() {
        setTitle("Expense Breakdown");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        DefaultPieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(580, 380));

        getContentPane().add(chartPanel);
    }

    private DefaultPieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        List<Expense> expenses = ExpenseDAO.getExpenses();

        for (Expense expense : expenses) {
            dataset.setValue(expense.getCategory(), expense.getAmount());
        }

        return dataset;
    }

    private JFreeChart createChart(DefaultPieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Expense Breakdown",
                dataset,
                true,
                true,
                false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(Color.decode("#F5F5F5")); // Background color from theme
        plot.setOutlinePaint(Color.decode("#CCCCCC")); // Border color from theme

        return chart;
    }

    public void displayChart() {
        SwingUtilities.invokeLater(() -> {
            ExpenseChart chart = new ExpenseChart();
            chart.setVisible(true);
        });
    }
}
