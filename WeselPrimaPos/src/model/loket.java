/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Kurniawan
 */
public class loket implements Serializable{
    private int idLoket;
    private String nama;
    private String alamat;
    private int notlp;
    private String username;
    private String password;

    public loket() {
    }

    public loket(int idLoket, String nama, String alamat, int notlp, String username, String password) {
        this.idLoket = idLoket;
        this.nama = nama;
        this.alamat = alamat;
        this.notlp = notlp;
        this.username = username;
        this.password = password;
    }

    public void setIdLoket(int idLoket) {
        this.idLoket = idLoket;
    }

    

    public int getIdLoket() {
        return idLoket;
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
        return "loket{" + "nama=" + nama + ", alamat=" + alamat + ", notlp=" + notlp + ", username=" + username + ", password=" + password + '}';
    }

}
