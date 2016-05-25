/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.ResultSet;
import koneksi.Database;

/**
 *
 * @author Kurniawan
 */
public class expedisi implements Serializable {

    private int idExpedisi;
    private String nama;
    private String alamat;
    private int notlp;
    private String username;
    private String password;

    public expedisi() {
    }

    public expedisi(int idExpedisi, String nama, String alamat, int notlp, String username, String password) {
        this.idExpedisi = idExpedisi;
        this.nama = nama;
        this.alamat = alamat;
        this.notlp = notlp;
        this.username = username;
        this.password = password;
    }

    public void setIdExpedisi(int idExpedisi) {
        this.idExpedisi = idExpedisi;
    }

    public int getIdExpedisi() {
        return idExpedisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNotlp() {
        return notlp;
    }

    public void setNotlp(int notlp) {
        this.notlp = notlp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "expedisi{" + "nama=" + nama + ", alamat=" + alamat + ", notlp=" + notlp + ", username=" + username + ", password=" + password + '}';
    }

}
