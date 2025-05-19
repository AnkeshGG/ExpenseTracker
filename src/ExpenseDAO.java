import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDAO {
    public static void addExpense(Expense expense) {
        try (Connection conn = DatabaseHelper.connect();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO expenses (name, amount, category, date) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, expense.getName());
            stmt.setDouble(2, expense.getAmount());
            stmt.setString(3, expense.getCategory());
            stmt.setString(4, expense.getDate());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Expense> getExpenses() {
        List<Expense> expenses = new ArrayList<>();
        try (Connection conn = DatabaseHelper.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM expenses")) {
            while (rs.next()) {
                expenses.add(new Expense(rs.getString("name"),
                        rs.getDouble("amount"),
                        rs.getString("category"),
                        rs.getString("date")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }
}
