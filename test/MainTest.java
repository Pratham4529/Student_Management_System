package com.aurionpro.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.aurionpro.controller.MainController;
import com.aurionpro.database.DBConnection;

public class MainTest {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ Database connection successful!");
            } else {
                System.out.println("❌ Database connection failed.");
                return;
            }
            MainController.start();
        } catch (SQLException e) {
            System.out.println("❌ Error during DB setup:");
            e.printStackTrace();
        }
    }
}
