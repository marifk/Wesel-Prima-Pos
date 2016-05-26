/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.ResultSet;
import koneksi.Database;

/**
 *
 * @author Kurniawan
 */
public class Aplikasi {

    public void saveTransaksi(transaksi ex) {
        Database db = new Database();
        String s = "insert into transaksi values('" + ex.getNoResi() + "','" + ex.getNamaPengirim() + "','" + ex.getAlamatPengirim() + "','" + ex.getNotlpPengirim() + "','" + ex.getKdPosPengirim() + "'"
                + ",'" + ex.getNamaPenerima() + "','" + ex.getAlamatPenerima() + "','" + ex.getNotlpPenerima() + "','" + ex.getKdPosPenerima() + "',"
                + "'" + ex.getTglCetak() + "','" + ex.getBesarUang() + "','" + "Pertama cetak" + "','" + "Belum Antar" + "','" + "Belum Dibayar" + "','" + "" + "'  )";
        db.query(s);
    }

    public void updateTransaksi(String noResi, String namaPengirim, String alamatPengirim, int notlpPengirim, int kdPosPengirim,
            String namaPenerima, String alamatPenerima, int notlpPenerima, int kdPosPenerima, Date tglCetak, int besarUang) {
        Database db = new Database();
        String s = "update transaksi set namaPengirim='" + namaPengirim + "' ,alamatPengirim='" + alamatPengirim + "',notlpPengirim='" + notlpPengirim + "',kdPosPengirim='" + kdPosPengirim + "'"
                + ",namaPenerima='" + namaPenerima + "' ,alamatPenerima='" + alamatPenerima + "',notlpPenerima='" + notlpPenerima + "',kdPosPenerima='" + kdPosPenerima + "',tglCetak='" + tglCetak + "',besarUang='" + besarUang + "' where noResi='" + noResi + "' ";
        db.query(s);
    }

    public void updateTransaksiCetak(String resi, Date tglCetak, String stat) {
        Database db = new Database();
        String s = "update transaksi set tglCetak='" + tglCetak + "',statusCetak='" + stat + "' where noResi='" + resi + "' ";
        db.query(s);
    }

    public void updateStatusAntar(String resi, String stat, String ket) {
        Database db = new Database();
        String s = "update transaksi set statusAntar='" + stat + "',Keterangan='" + ket + "' where noResi='" + resi + "' ";
        db.query(s);
    }

    public void updateStatusBayar(String resi, String stat) {
        Database db = new Database();
        String s = "update transaksi set statusBayar='" + stat + "' where noResi='" + resi + "' ";
        db.query(s);
    }

    public transaksi getTransaksi(Date tgl) {
        Database db = new Database();
        transaksi e = new transaksi();
        ResultSet rs;
        try {
            String s = "select*from transaksi where tglCetak='" + tgl + "'";
            rs = db.getData(s);
            while (rs.next()) {
                e.setNoResi(rs.getString(1));
                e.setNamaPengirim(rs.getString(2));
                e.setAlamatPengirim(rs.getString(3));
                e.setNotlpPengirim(rs.getInt(4));
                e.setKdPosPengirim(rs.getInt(5));
                e.setNamaPenerima(rs.getString(6));
                e.setAlamatPenerima(rs.getString(7));
                e.setNotlpPenerima(rs.getInt(8));
                e.setKdPosPenerima(rs.getInt(9));
                e.setTglCetak(rs.getDate(10));
                e.setBesarUang(rs.getInt(11));
                e.setStatusCetak(rs.getString(12));
                e.setStatusAntar(rs.getString(13));
                e.setStatusBayar(rs.getString(14));
                e.setKet(rs.getString(15));
            } 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return e;
    }

    public transaksi getTransaksiResi(String resi) {
        Database db = new Database();
        transaksi e = new transaksi();
        ResultSet rs;
        try {
            String s = "select*from transaksi where noResi='" + resi + "'";
            rs = db.getData(s);
            if (rs.next()) {
                e.setNoResi(rs.getString(1));
                e.setNamaPengirim(rs.getString(2));
                e.setAlamatPengirim(rs.getString(3));
                e.setNotlpPengirim(rs.getInt(4));
                e.setKdPosPengirim(rs.getInt(5));
                e.setNamaPenerima(rs.getString(6));
                e.setAlamatPenerima(rs.getString(7));
                e.setNotlpPenerima(rs.getInt(8));
                e.setKdPosPenerima(rs.getInt(9));
                e.setTglCetak(rs.getDate(10));
                e.setBesarUang(rs.getInt(11));
                e.setStatusCetak(rs.getString(12));
                e.setStatusAntar(rs.getString(13));
                e.setStatusBayar(rs.getString(14));
                e.setKet(rs.getString(15));
            } else {
                e = null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return e;
    }

    public void deleteTransaksi(Date tgl) {
        Database db = new Database();
        String s = "delete from transaksi where tglCetak='" + tgl + "'";
        db.query(s);
    }

    public void saveExpedisi(expedisi ex) {
        Database db = new Database();
        String s = "insert into pelanggan values('" + ex.getIdExpedisi() + "','" + ex.getNama() + "','" + ex.getAlamat() + "','" + ex.getUsername() + "','" + ex.getPassword() + "')";
        db.query(s);
    }

    public void updateExpedisi(int id, String nama, String alamat, int notlp, String user, String pass) {
        Database db = new Database();
        String s = "update expedisi set nama='" + nama + "' ,alamat='" + alamat + "',notlp='" + notlp + "',username='" + user + "',password='" + pass + "' where idExpedisi='" + id + "' ";
        db.query(s);
    }

    public expedisi getExpedisi(String user, String pass) {
        Database db = new Database();
        expedisi e = new expedisi();
        ResultSet rs;
        try {
            String s = "select*from expedisi where username='" + user + "' and password='" + pass + "'";
            rs = db.getData(s);
            if (rs.next()) {
                e.setIdExpedisi(rs.getInt(1));
                e.setNama(rs.getString(2));
                e.setAlamat(rs.getString(3));
                e.setNotlp(rs.getInt(4));
                e.setUsername(rs.getString(5));
                e.setPassword(rs.getString(6));
            } else {
                e = null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return e;
    }

    public void deleteExpedisi(String user) {
        Database db = new Database();
        String s = "delete from expedisi where username='" + user + "'";
        db.query(s);
    }

    public void saveLoket(loket lk) {

        Database db = new Database();
        String s = "insert into loket values('" + lk.getIdLoket() + "','" + lk.getNama() + "','" + lk.getAlamat() + "','" + lk.getUsername() + "','" + lk.getPassword() + "')";
        db.query(s);
    }

    public void updateLoket(int id, String nama, String alamat, int notlp, String user, String pass) {
        Database db = new Database();
        String s = "update loket set nama='" + nama + "' ,alamat='" + alamat + "',notlp='" + notlp + "',username='" + user + "',password='" + pass + "' where idLoket='" + id + "' ";
        db.query(s);
    }

    public loket getLoket(String user, String pass) {
        Database db = new Database();
        loket e = new loket();
        ResultSet rs;
        try {
            String s = "select*from loket where username='" + user + "' and password='" + pass + "' ";
            rs = db.getData(s);
            if (rs.next()) {
                e.setIdLoket(rs.getInt(1));
                e.setNama(rs.getString(2));
                e.setAlamat(rs.getString(3));
                e.setNotlp(rs.getInt(4));
                e.setUsername(rs.getString(5));
                e.setPassword(rs.getString(6));
            } else {
                e = null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return e;
    }

    public void deleteLoket(String user) {
        Database db = new Database();
        String s = "delete from loket where username='" + user + "'";
        db.query(s);
    }

    public void saveManpel(manpel ex) {

        Database db = new Database();
        String s = "insert into manpel values('" + ex.getIdManpel() + "','" + ex.getNama() + "','" + ex.getAlamat() + "','" + ex.getUsername() + "','" + ex.getPassword() + "')";
        db.query(s);
    }

    public void updateManpel(int id, String nama, String alamat, int notlp, String user, String pass) {
        Database db = new Database();
        String s = "update manpel set nama='" + nama + "' ,alamat='" + alamat + "',notlp='" + notlp + "',username='" + user + "',password='" + pass + "' where idManpel='" + id + "' ";
        db.query(s);
    }

    public manpel getManpel(String user, String pass) {
        Database db = new Database();
        manpel e = new manpel();
        ResultSet rs;
        try {
            String s = "select*from manpel where username='" + user + "' and password='" + pass + "' ";
            rs = db.getData(s);
            if (rs.next()) {
                e.setIdManpel(rs.getInt(1));
                e.setNama(rs.getString(2));
                e.setAlamat(rs.getString(3));
                e.setNotlp(rs.getInt(4));
                e.setUsername(rs.getString(5));
                e.setPassword(rs.getString(6));
            } else {
                e = null;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return e;
    }

    public void deleteManpel(String user) {
        Database db = new Database();
        String s = "delete from loket where username='" + user + "'";
        db.query(s);
    }

}
