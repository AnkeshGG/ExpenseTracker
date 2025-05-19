public class ExpenseTracker {
    public static void main(String[] args) {
        DatabaseHelper.initialize();
        new ExpenseUI();
    }
}
