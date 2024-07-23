package Dao;
import java.sql.*;
import Models.Transaction;
import database.DatabaseConnection;


public class TransactionDAO {


    public void createTransaction(Transaction transaction) {
        String query = "INSERT INTO Transaction (account_number, transaction_type, amount, transaction_date) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, transaction.getAccountNumber());
            stmt.setString(2, transaction.getTransactionType());
            stmt.setDouble(3, transaction.getAmount());
            stmt.setTimestamp(4, transaction.getTransactionDate());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
