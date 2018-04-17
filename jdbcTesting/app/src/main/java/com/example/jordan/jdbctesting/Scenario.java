package com.example.jordan.jdbctesting;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Scenario
{
    public void Run() throws SQLException
    {
        //                                                         'localhost' is not correct
        Connection connection = DriverManager.getConnection("localhost", "username", "password");

        connection.close();
    }
}
