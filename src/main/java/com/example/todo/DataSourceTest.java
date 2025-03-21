package com.example.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration  // Marks this class as a configuration class
public class DataSourceTest implements CommandLineRunner {

    @Autowired
    private DataSource dataSource; // Injects the datasource

    @Override
    public void run(String... args) throws Exception {
        testDatabaseConnection(); // Calls the method to test the connection
    }

    // Test the database connection
    public void testDatabaseConnection() {
        try (Connection connection = dataSource.getConnection()) {
            System.out.println("Database connection established!");  // Logs if the connection is successful
        } catch (SQLException e) {
            System.err.println("Database connection failed: " + e.getMessage());  // Logs if there's an error
        }
    }
}
