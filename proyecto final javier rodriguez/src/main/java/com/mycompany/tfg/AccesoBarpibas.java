/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tfg;

import static com.mycompany.tfg.Database.createConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author isard
 */
public class AccesoBarpibas {
    
    public static void inicioDeSesion(String correo, String contraseña){
        String sql = "SELECT * FROM cliente WHERE correo=? AND contraseña=?";
        try (Connection conn = createConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, correo);
            pst.setString(2, contraseña);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bienvenido de nuevo " + rs.getString("nombre"));
            } else {
                JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void registrarCliente(String nombre, String apellidos, String correo, String contraseña, String dni) {

    // Consulta SQL para insertar el nuevo cliente
    String sql = "INSERT INTO cliente (nombre, apellidos, correo, contraseña, dni) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = createConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        // Asignar valores a los parámetros
        pst.setString(1, nombre);
        pst.setString(2, apellidos);
        pst.setString(3, correo);
        pst.setString(4, contraseña);
        pst.setString(5, dni);

        int filasAfectadas = pst.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, nombre + ", usted se ha registrado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al registrar el cliente: ", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public static boolean existeCorreo(String correo) {
    String sql = "SELECT * FROM cliente WHERE correo = ?";
    try (Connection conn = createConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, correo);
        ResultSet rs = pst.executeQuery();
        return rs.next();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar el correo: ", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
    
    public static boolean cambiarContraseña(String correo, String nuevaContraseña) {
    String sql = "UPDATE cliente SET contraseña = ? WHERE correo = ?";
    try (Connection conn = createConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, nuevaContraseña);
        pst.setString(2, correo);
        int filasAfectadas = pst.executeUpdate();
        return filasAfectadas > 0;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cambiar la contraseña: ", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
    
    public static boolean borrarCuenta(String correo) {
    String sql = "DELETE FROM cliente WHERE correo = ?";
    try (Connection conn = createConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, correo);
        int filasAfectadas = pst.executeUpdate();
        return filasAfectadas > 0;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al borrar la cuenta: ", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
    
    public static String obtenerDniPorCorreo(String correo) {
    String sql = "SELECT dni FROM cliente WHERE correo = ?";
    String dni = null;
    try (Connection conn = createConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, correo);
        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                dni = rs.getString("dni");
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener el DNI: ", "Error", JOptionPane.ERROR_MESSAGE);
    }
    return dni;
}

    public static boolean registrarCompra(String dni, double precio, LocalDate fecha) {

    String sql = "INSERT INTO pago (dni_cliente, precio, fecha) VALUES (?, ?, ?)";
    try (Connection conn = createConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, dni);
        pst.setDouble(2, precio);
        pst.setDate(3, java.sql.Date.valueOf(fecha));
        int filasAfectadas = pst.executeUpdate();
        return filasAfectadas > 0;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al registrar la compra: ", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
    
    
    public static boolean restarStockPorNombre(String nombreProducto, int cantidadComprada) {
    String sql = "UPDATE producto SET cantidad = cantidad - ? WHERE nombre = ?";
    try (Connection conn = createConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setInt(1, cantidadComprada);
        pst.setString(2, nombreProducto);
        int filasAfectadas = pst.executeUpdate();
        return filasAfectadas > 0;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al actualizar el stock: ", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}

    public static Producto buscarProductoPorNombre(String nombreProducto) {
    String sql = "SELECT nombre, descripcion, stock, precio FROM producto WHERE nombre = ?";
    try (Connection conn = createConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, nombreProducto);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            String nombre = rs.getString("nombre");
            String descripcion = rs.getString("descripcion");
            int stock = rs.getInt("stock");
            double precio = rs.getDouble("precio");
            return new Producto(nombre, descripcion, stock, precio);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al buscar el producto: ", "Error", JOptionPane.ERROR_MESSAGE);
    }
    return null;
}
    
    public static Cliente obtenerDatosClientePorCorreo(String correo) {
    String sql = "SELECT nombre, correo, dni, apellidos FROM cliente WHERE correo = ?";
    try (Connection conn = createConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, correo);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            String nombre = rs.getString("nombre");
            String correoCliente = rs.getString("correo");
            String dni = rs.getString("dni");
            String apellidos = rs.getString("apellidos");
            return new Cliente(nombre, correoCliente, dni, apellidos);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al obtener los datos del cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return null;
}
    
    
}
