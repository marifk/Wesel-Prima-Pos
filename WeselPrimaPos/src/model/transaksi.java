/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Kurniawan
 */
public class transaksi implements Serializable{
    private String noResi;
    private String namaPengirim;
    private String alamatPengirim;
    private int notlpPengirim;
    private int kdPosPengirim;
    private String namaPenerima;
    private String alamatPenerima;
    private int notlpPenerima;
    private int kdPosPenerima;
    private Date tglCetak;
    private int besarUang;
    private String statusCetak;
    private String statusAntar;
    private String statusBayar;
    private String ket;
    public transaksi() {
    }

    public transaksi(String namaPengirim, String alamatPengirim, int notlpPengirim, int kdPosPengirim, String namaPenerima, String alamatPenerima, int notlpPenerima, int kdPosPenerima) {
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.notlpPengirim = notlpPengirim;
        this.kdPosPengirim = kdPosPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.notlpPenerima = notlpPenerima;
        this.kdPosPenerima = kdPosPenerima;
    }

   
    public transaksi(String noResi, Date tglCetak, int besarUang) {
        this.noResi = noResi;
        this.tglCetak = tglCetak;
        this.besarUang = besarUang;
        this.statusAntar="Belum Diantar";
        this.statusCetak="Pertama Cetak";
        this.statusBayar="Belum Dibayar";
        this.ket="";
    }

    public String getStatusCetak() {
        return statusCetak;
    }

    public void setStatusCetak(String statusCetak) {
        this.statusCetak = statusCetak;
    }

    public String getStatusAntar() {
        return statusAntar;
    }

    public void setStatusAntar(String statusAntar) {
        this.statusAntar = statusAntar;
    }

    public String getStatusBayar() {
        return statusBayar;
    }

    public void setStatusBayar(String statusBayar) {
        this.statusBayar = statusBayar;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }

    public String getNoResi() {
        return noResi;
    }

    public void setNoResi(String noResi) {
        this.noResi = noResi;
    }

    public String getNamaPengirim() {
        return namaPengirim;
    }

    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    public String getAlamatPengirim() {
        return alamatPengirim;
    }

    public void setAlamatPengirim(String alamatPengirim) {
        this.alamatPengirim = alamatPengirim;
    }

    public int getNotlpPengirim() {
        return notlpPengirim;
    }

    public void setNotlpPengirim(int notlpPengirim) {
        this.notlpPengirim = notlpPengirim;
    }

    public int getKdPosPengirim() {
        return kdPosPengirim;
    }

    public void setKdPosPengirim(int kdPosPengirim) {
        this.kdPosPengirim = kdPosPengirim;
    }

    public String getNamaPenerima() {
        return namaPenerima;
    }

    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    public String getAlamatPenerima() {
        return alamatPenerima;
    }

    public void setAlamatPenerima(String alamatPenerima) {
        this.alamatPenerima = alamatPenerima;
    }

    public int getNotlpPenerima() {
        return notlpPenerima;
    }

    public void setNotlpPenerima(int notlpPenerima) {
        this.notlpPenerima = notlpPenerima;
    }

    public int getKdPosPenerima() {
        return kdPosPenerima;
    }

    public void setKdPosPenerima(int kdPosPenerima) {
        this.kdPosPenerima = kdPosPenerima;
    }

    public Date getTglCetak() {
        return tglCetak;
    }

    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public int getBesarUang() {
        return besarUang;
    }

    public void setBesarUang(int besarUang) {
        this.besarUang = besarUang;
    }

    @Override
    public String toString() {
        return "transaksi{" + "noResi=" + noResi + ", namaPengirim=" + namaPengirim + ", alamatPengirim=" + alamatPengirim + ", notlpPengirim=" + notlpPengirim + ", kdPosPengirim=" + kdPosPengirim + ", namaPenerima=" + namaPenerima + ", alamatPenerima=" + alamatPenerima + ", notlpPenerima=" + notlpPenerima + ", kdPosPenerima=" + kdPosPenerima + ", tglCetak=" + tglCetak + ", besarUang=" + besarUang + '}';
    }
    
}
