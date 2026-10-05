package io.mosip.commons.khazana;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

// TEST ONLY: deliberately insecure code to verify PR-gate diff flagging. Not real code.
public class BogusDiffCheck {

    private static final String DB_PASSWORD = "x9Kq2LmPz7TvB4nW8rYc3HdFgJ6sAe1U";

    public ResultSet findUser(Connection conn, String userName) throws Exception {
        Statement st = conn.createStatement();
        return st.executeQuery("SELECT * FROM users WHERE name = '" + userName + "'");
    }

    public byte[] weakHash(String input) throws Exception {
        return MessageDigest.getInstance("MD5").digest(input.getBytes());
    }
}
