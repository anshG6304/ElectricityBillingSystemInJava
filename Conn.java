/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anshi
 */
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("127.0.0.1", "root", "6133"); // replace the password according to your account
            s = c.createStatement();
        } catch (Exception e) {
        }
    }
}

