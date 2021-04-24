package kg.megacom.dbHelper.impl;

import kg.megacom.dbHelper.DbHelper;
import kg.megacom.models.Accounts;

import java.sql.*;

public class DbHelperImpl implements DbHelper {
    @Override
    public Accounts findByLogin(String login_) {
        Connection connection = null;
        Accounts account = null;

        try {
            connection = getConnection();
            String selectQuery = "SELECT * FROM accounts;";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while ( resultSet.next() ) {
                int id = resultSet.getInt("id");
                String login = resultSet.getString("login");
                String password = resultSet.getString("password");
                int active = resultSet.getInt("active");
            }
            account = new Accounts();
            account.setActive(resultSet.getInt(1));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return account;
    }

    private Connection getConnection() throws SQLException {
        Connection connection = null;

        String url = "jdbc:sqlite:C:\\Users\\User\\Desktop\\javabasic\\SQL_ProductsDB\\products.db";

        connection = DriverManager.getConnection(url);

        System.out.println("Connection to SQLite has been established.");
        return connection;
    }
}
