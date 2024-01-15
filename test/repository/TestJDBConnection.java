/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author Dell
 */
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestJDBConnection {

    private Connection connection;

    @Before
    public void setUp() throws Exception {
        // Initialization code, if needed before each test
        connection = JDBConnection.getConnection();
    }

    @After
    public void tearDown() throws Exception {
        // Cleanup code, if needed after each test
        if (connection != null) {
            connection.close();
        }
    }

    @Test
    public void testGetConnection() {
        try {
            assertNotNull("Connection should not be null", connection);
            // Add more assertions based on your requirements
        } catch (Exception e) {
            fail("An exception occurred: " + e.getMessage());
        }
    }
}
