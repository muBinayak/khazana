package io.mosip.commons.khazana.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Deliberately vulnerable file. Exists only to verify which scanners in
 * pr-gate.yml report to the Security tab and which surface only via PR
 * comments/job failure. Not part of the real khazana codebase.
 */
public class BogusTestClass {
    private static final String AWS_SECRET_ACCESS_KEY = "AKIAIOSFODNN7EXAMPLE";
    private static final String DB_PASSWORD = "SuperSecretPassword123!";

    public ResultSet getUserData(Connection conn, String userId) throws Exception {
        Statement stmt = conn.createStatement();
        String query = "SELECT * FROM users WHERE id = '" + userId + "'";
        return stmt.executeQuery(query);
    }
}
