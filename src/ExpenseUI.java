import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ExpenseUI extends JFrame {
    private JTextField nameField, amountField;
    private JComboBox<String> categoryBox;
    private JButton addButton, viewButton;

    private Color backgroundColor, buttonColor, textColor;
    private String fontFamily;
    private int fontSize;

    public ExpenseUI() {
        loadTheme(); // Load theme before setting up UI

        setTitle("Expense Tracker");
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));
        getContentPane().setBackground(backgroundColor);
        setLocationRelativeTo(null);

        JLabel nameLabel = new JLabel("Expense Name:");
        nameLabel.setForeground(textColor);
        nameLabel.setFont(new Font(fontFamily, Font.BOLD, fontSize));
        add(nameLabel);

        nameField = new JTextField();
        add(nameField);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setForeground(textColor);
        amountLabel.setFont(new Font(fontFamily, Font.BOLD, fontSize));
        add(amountLabel);

        amountField = new JTextField();
        add(amountField);

        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setForeground(textColor);
        categoryLabel.setFont(new Font(fontFamily, Font.BOLD, fontSize));
        add(categoryLabel);

        categoryBox = new JComboBox<>(new String[]{"Food", "Transport", "Entertainment", "Utilities"});
        add(categoryBox);

        addButton = new JButton("Add Expense");
        addButton.setBackground(buttonColor);
        addButton.setForeground(Color.WHITE);
        addButton.setFont(new Font(fontFamily, Font.BOLD, fontSize));
        addButton.addActionListener(e -> {
            String name = nameField.getText();
            double amount = Double.parseDouble(amountField.getText());
            String category = (String) categoryBox.getSelectedItem();
            Expense expense = new Expense(name, amount, category, "2025-05-18");
            ExpenseDAO.addExpense(expense);
            JOptionPane.showMessageDialog(this, "Expense Added!");
        });
        add(addButton);

        viewButton = new JButton("View Expenses");
        viewButton.setBackground(buttonColor);
        viewButton.setForeground(Color.WHITE);
        viewButton.setFont(new Font(fontFamily, Font.BOLD, fontSize));
        viewButton.addActionListener(e -> new ExpenseChart().displayChart());
        add(viewButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void loadTheme() {
        Properties theme = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("theme.properties")) {
            if (input != null) {
                theme.load(input);

                backgroundColor = Color.decode(theme.getProperty("background.color", "#FFFFFF"));
                buttonColor = Color.decode(theme.getProperty("button.primary.color", "#007AFF"));
                textColor = Color.decode(theme.getProperty("text.primary.color", "#333333"));
                fontFamily = theme.getProperty("font.family", "Arial");
                fontSize = Integer.parseInt(theme.getProperty("font.size", "14"));
            } else {
                throw new FileNotFoundException("theme.properties not found in classpath!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            backgroundColor = Color.WHITE;
            buttonColor = Color.BLUE;
            textColor = Color.BLACK;
            fontFamily = "Arial";
            fontSize = 14;
        }

    }

    public static void main(String[] args) {
        new ExpenseUI();
    }
}
