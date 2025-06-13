/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tfg;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Database {
    static java.sql.Connection connection;
    static MysqlDataSource dataSource;
    public static java.sql.Connection createConnection() throws SQLException {
        dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/barpiba");
        dataSource.setUser("root");
        dataSource.setPassword("");
        connection = dataSource.getConnection();
        connection.setAutoCommit(true);
        return connection;
    }

    public static java.sql.Connection getInstance() throws SQLException {
        if(connection==null) {
            java.sql.Connection conn = createConnection();
            return conn;
        }
        return connection;
    }
    
    public static void close() throws SQLException {
        if(connection!=null) {
            connection.close();
            connection=null;
        }
    }
   
    public static void guardarFactura(String NIF, float importe, String fecha) throws SQLException {
        try{
            Connection conn = getInstance();
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO facturas (NIF, Importe, Fecha) VALUES (?, ?, ?)");
            String query = "INSERT INTO facturas (NIF, Importe, Fecha) VALUES (?, ?, ?)";
            stmt.setString(1, NIF);
            stmt.setFloat(2, importe);
            stmt.setString(3, fecha);
            stmt.executeUpdate(); 
            JOptionPane.showMessageDialog(null, "Factura grabada");
         } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Revisa los campos");          
        }              
    }
    
}