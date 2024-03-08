package org.example;

import java.sql.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            System.out.println("Connection established");

            Statement dbStatement = dbConnection.createStatement();
            //dbStatement.execute({sql query}) for insert
            //ResultSet <data name> = dbStatement.ExecuteQuery({ sql query }) for select

        } catch (Exception e){
            System.out.println("Error of connection establishment");
            e.printStackTrace();
        }
    }
}