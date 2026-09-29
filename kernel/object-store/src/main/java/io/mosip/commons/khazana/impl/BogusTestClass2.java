package io.mosip.commons.khazana.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Deliberately vulnerable file. Exists only to verify reviewdog posts inline
 * PR review comments for secret-scan, semgrep, and SpotBugs. Not part of the
 * real khazana codebase.
 */
public class BogusTestClass2 {
    private static final String DB_PASSWORD = "Tr0ub4dor&3xk9mQp2ZvL7wRfN4hYbJ8";

    public ResultSet getOrderData(Connection conn, String orderId) throws Exception {
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM orders WHERE id = '" + orderId + "'";
        return stmt.executeQuery(query);
    }
}
