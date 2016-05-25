/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.*;

/**
 *
 * @author Kurniawan
 */
public class Database {

    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement st = null;
    private Connection con = null;
    private ResultSet rs = null;

    public Database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/wesel_prima_pos", dbuser, dbpasswd);
            st = con.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            rs = st.executeQuery(SQLString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public void query(String SQLString) {
        try {
            st.executeUpdate(SQLString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
