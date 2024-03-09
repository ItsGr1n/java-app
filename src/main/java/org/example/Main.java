package org.example;

import java.sql.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            Connection dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            System.out.println("Connection established");

            Statement dbStatement = dbConnection.createStatement();
            dbStatement.execute("INSERT INTO `chelneri` (`nume`) VALUES ('Ion')");
            dbStatement.execute("INSERT INTO `chelneri` (`nume`) VALUES ('Mihai')");
            dbStatement.execute("INSERT INTO `chelneri` (`nume`) VALUES ('Sergiu')");
            dbStatement.execute("INSERT INTO `chelneri` (`nume`) VALUES ('Doina')");

            System.out.println("Inserarea a fost executata cu succes.");

            ResultSet result = dbStatement.executeQuery("SELECT * FROM `chelneri`");

            while (result.next()) {
                System.out.println("ID: " + result.getInt("id") + " Name: " + result.getString("name"));
            } dbConnection.close();
            //dbStatement.execute({sql query}) for insert
            //ResultSet <data name> = dbStatement.ExecuteQuery({ sql query }) for select

        } catch (Exception e){
            System.out.println("Error of connection establishment");
            e.printStackTrace();
        }
    }
}