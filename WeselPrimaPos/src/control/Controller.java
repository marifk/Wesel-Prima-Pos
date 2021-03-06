/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.loket.MainLoket;
import view.expedisi.MainExpedisi;
import view.manpel.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Aplikasi;
import model.View;
import model.transaksi;
import view.Login;
import view.expedisi.ProfilExpedisi;
import view.expedisi.StatusAntar;
import view.loket.ProfilLoket;
import view.loket.StatusBayar;
import view.manpel.Expedisi;
import view.manpel.Loket;
import view.manpel.ManPel;
import view.manpel.Transaksi;
import view.manpel.addExpedisi;
import view.manpel.addLoket;
import view.manpel.addPelayanan;
import view.manpel.addTransaksi;
import view.manpel.cetakTransaksi;
import view.manpel.editExpedisi;
import view.manpel.editLoket;
import view.manpel.editTransaksi;
import view.manpel.profilManpel;
import view.manpel.viewExpedisi;
import view.manpel.viewLoket;
import view.manpel.viewPelayanan;
import view.manpel.viewTransaksi;

/**
 *
 * @author Kurniawan
 */
public class Controller implements ActionListener {

    private View view;
    private Aplikasi app;
    private model.manpel man;
    private model.loket lok;
    private model.expedisi expe;

    public Controller() {
        app = new Aplikasi();
        goToLogin();
    }

    public void goToLogin() {
        Login lg = new Login();
        lg.setVisible(true);
        lg.addListener(this);
        view = lg;
    }

    public void goToMain() {
        Main m = new Main();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToMainExpedisi() {
        MainExpedisi m = new MainExpedisi();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToMainLoket() {
        MainLoket m = new MainLoket();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToManpel() {
        ManPel m = new ManPel();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToTransaksi() {
        Transaksi m = new Transaksi();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToExpedisi() {
        Expedisi m = new Expedisi();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToLoket() {
        Loket m = new Loket();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToProfilLoket() {
        ProfilLoket m = new ProfilLoket();
        m.setVisible(true);
        m.addListener(this);
        m.setNama(lok.getNama());
        m.setAlamat(lok.getAlamat());
        m.setNoTelp(String.valueOf(lok.getNotlp()));
        m.setUsername(lok.getUsername());
        m.setPassword(lok.getPassword());

        view = m;
    }

    public void goToStBayar() {
        StatusBayar m = new StatusBayar();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToProfilExpedisi() {
        ProfilExpedisi m = new ProfilExpedisi();
        m.setVisible(true);
        m.addListener(this);
        m.setNama(expe.getNama());
        m.setAlamat(expe.getAlamat());
        m.setNoTelp(String.valueOf(expe.getNotlp()));
        m.setUsername(expe.getUsername());
        m.setPassword(expe.getPassword());
        view = m;
    }

    public void goToStAntar() {
        StatusAntar m = new StatusAntar();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToAddPelayanan() {
        addPelayanan m = new addPelayanan();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToProfilPelayanan() {
        profilManpel m = new profilManpel();
        m.setVisible(true);
        m.addListener(this);
        m.setNama(man.getNama());
        m.setAlamat(man.getAlamat());
        m.setNoTelp(String.valueOf(man.getNotlp()));
        m.setUsername(man.getUsername());
        m.setPassword(man.getPassword());

        view = m;
    }

    public void goToViewPelayanan() {
        viewPelayanan m = new viewPelayanan();
        m.setVisible(true);
        m.addListener(this);
        m.tampilManpel();
        view = m;
    }

    public void goToViewLoket() {
        viewLoket m = new viewLoket();
        m.setVisible(true);
        m.addListener(this);
        m.tampilLoket();
        view = m;
    }

    public void goToAddLoket() {
        addLoket m = new addLoket();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToEditLoket() {
        editLoket m = new editLoket();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToViewExpedisi() {
        viewExpedisi m = new viewExpedisi();
        m.setVisible(true);
        m.addListener(this);
        m.tampilExpedisi();
        view = m;
    }

    public void goToAddExpedisi() {
        addExpedisi m = new addExpedisi();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToEditExpedisi() {
        editExpedisi m = new editExpedisi();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToAddTransaksi() {
        addTransaksi m = new addTransaksi();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToEditTransaksi() {
        editTransaksi m = new editTransaksi();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    public void goToViewTransaksi() {
        viewTransaksi m = new viewTransaksi();
        m.setVisible(true);
        m.addListener(this);
        m.tampilTransaksi();
        view = m;
    }

    public void goToCetakTransaksi() {
        cetakTransaksi m = new cetakTransaksi();
        m.setVisible(true);
        m.addListener(this);
        view = m;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
            if (view instanceof Login) {
                Login lg = (Login) view;
                if (source.equals(lg.getBtnLogin())) {
                    if (lg.getTxUsername().equals("") && lg.getTxPassword().equals("")) {
                        JOptionPane.showMessageDialog(null, "Username dan Password tidak boleh kosong");
                        lg.setVisible(true);
                    } else if (lg.getTxUsername().equals("")) {
                        JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
                        lg.setVisible(true);
                    } else if (lg.getTxPassword().equals("")) {
                        JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
                        lg.setVisible(true);
                    } else if (lg.getSbg().equals("Manajemen Pelayanan")) {
                        model.manpel mp = app.getManpel(lg.getTxUsername(), lg.getTxPassword());
                        if (mp != null) {
                            man = mp;
                            JOptionPane.showMessageDialog(null, "Selamat datang " + lg.getTxUsername());
                            lg.dispose();
                            goToMain();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data tidak ada");
                        }
                    } else if (lg.getSbg().equals("Expedisi")) {
                        model.expedisi ex = app.getExpedisi(lg.getTxUsername(), lg.getTxPassword());
                        if (ex != null) {
                            expe = ex;
                            JOptionPane.showMessageDialog(null, "Selamat datang " + lg.getTxUsername());
                            lg.dispose();
                            goToMainExpedisi();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data tidak ada");
                        }
                    } else if (lg.getSbg().equals("Loket")) {
                        model.loket lk = app.getLoket(lg.getTxUsername(), lg.getTxPassword());
                        if (lk != null) {
                            lok = lk;
                            JOptionPane.showMessageDialog(null, "Selamat datang " + lg.getTxUsername());
                            lg.dispose();
                            goToMainLoket();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data tidak ada");
                        }
                    }
                }
            } else if (view instanceof Main) {
                Main mn = (Main) view;
                if (source.equals(mn.getManpel())) {
                    mn.dispose();
                    goToManpel();
                } else if (source.equals(mn.getTransaksi())) {
                    mn.dispose();
                    goToTransaksi();
                } else if (source.equals(mn.getExpedisi())) {
                    mn.dispose();
                    goToExpedisi();
                } else if (source.equals(mn.getLoket())) {
                    mn.dispose();
                    goToLoket();
                } else if (source.equals(mn.getLogout())) {
                    mn.dispose();
                    goToLogin();
                }
            } else if (view instanceof ManPel) {
                ManPel mn = (ManPel) view;
                if (source.equals(mn.getAddPetugas())) {
                    mn.dispose();
                    goToAddPelayanan();
                } else if (source.equals(mn.getProfil())) {
                    mn.dispose();
                    goToProfilPelayanan();
                } else if (source.equals(mn.getViewPelayanan())) {
                    mn.dispose();
                    goToViewPelayanan();
                } else if (source.equals(mn.getBack())) {
                    mn.dispose();
                    goToMain();
                }
            } else if (view instanceof addPelayanan) {
                addPelayanan mn = (addPelayanan) view;

                if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToManpel();
                } else if (source.equals(mn.getBtnAdd())) {
                    try {
                        model.manpel m = app.getManpelId(mn.getId());
                        if ((mn.getId() == 0) || (mn.getNama().equals("")) || (mn.getAlamat().equals(""))
                                || (mn.getNotlp() == 0) || (mn.getUsername().equals("")) || (mn.getPass().equals(""))
                                || (mn.getPass2().equals(""))) {
                            mn.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
                        } else if (mn.getPass().equals(mn.getPass2())) {
                            if (m == null) {
                                model.manpel m2 = app.getManpel(mn.getUsername(), mn.getPass());
                                if (m2 == null) {
                                    mn.dispose();
                                    model.manpel m3 = new model.manpel(mn.getId(), mn.getNama(), mn.getAlamat(), mn.getNotlp(), mn.getUsername(), mn.getPass());
                                    app.saveManpel(m3);
                                    JOptionPane.showMessageDialog(null, "Penambahan Petugas Pelayanan Berhasil");
                                    goToManpel();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Username sudah ada");
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "ID sudah ada");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password Tidak Sama");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Inputan Salah");
                    }
                }
            } else if (view instanceof profilManpel) {
                profilManpel mn = (profilManpel) view;
                if (source.equals(mn.getBtnEdit())) {
                    try {
                        if ((mn.getNama().equals("")) || (mn.getAlamat().equals("")) || (mn.getNoTelp() == 0) || (mn.getUsername().equals("")) || (mn.getPassword().equals(""))) {
                            mn.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
                        } else if (man != null) {
                            mn.dispose();
                            app.updateManpel(man.getIdManpel(), mn.getNama(), mn.getAlamat(), mn.getNoTelp(), mn.getUsername(), mn.getPassword());
                            JOptionPane.showMessageDialog(null, "Pengeditan Petugas Pelayanan Berhasil");
                            goToManpel();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Inputan Salah");
                    }
                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToManpel();
                }
            } else if (view instanceof viewPelayanan) {
                viewPelayanan mn = (viewPelayanan) view;
                if (source.equals(mn.getBtnBack())) {
                    mn.dispose();
                    goToManpel();
                }
            } else if (view instanceof Transaksi) {
                Transaksi mn = (Transaksi) view;
                if (source.equals(mn.getAddTransaksi())) {
                    mn.dispose();
                    goToAddTransaksi();
                } else if (source.equals(mn.getEditTransaksi())) {
                    mn.dispose();
                    goToEditTransaksi();
                } else if (source.equals(mn.getViewTransaksi())) {
                    mn.dispose();
                    goToViewTransaksi();
                } else if (source.equals(mn.getCetakTransaksi())) {
                    mn.dispose();
                    goToCetakTransaksi();
                } else if (source.equals(mn.getBack())) {
                    mn.dispose();
                    goToMain();
                }
            } else if (view instanceof addTransaksi) {
                addTransaksi mn = (addTransaksi) view;
                if (source.equals(mn.getBtnAdd())) {
                    if ((mn.getNoResi().equals("")) || (mn.getTglCetak() == null) || (mn.getBesarUang() == 0)
                            || (mn.getNamaPengirim().equals("")) || (mn.getAlamatPengirim().equals("")) || (mn.getTlpPengirim() == 0) || (mn.getPosPengirim() == 0)
                            || (mn.getNamaPenerima().equals("")) || (mn.getAlamatPenerima().equals("")) || (mn.getTelpPenerima() == 0) || (mn.getPosPenerima() == 0)) {
                        JOptionPane.showMessageDialog(null, "Harus diisi semuanya");
                        mn.setVisible(true);
                    } else {
                        try {
                            model.transaksi tr = new transaksi(mn.getNoResi(), mn.getTglCetak(), mn.getBesarUang());
                            tr.setNamaPengirim(mn.getNamaPengirim());
                            tr.setAlamatPengirim(mn.getAlamatPengirim());
                            tr.setNotlpPengirim(mn.getTlpPengirim());
                            tr.setKdPosPengirim(mn.getPosPengirim());

                            tr.setNamaPenerima(mn.getNamaPenerima());
                            tr.setAlamatPenerima(mn.getAlamatPenerima());
                            tr.setNotlpPenerima(mn.getTelpPenerima());
                            tr.setKdPosPenerima(mn.getPosPenerima());
                            app.saveTransaksi(tr);
                            JOptionPane.showMessageDialog(null, "Penambahan Transaksi Berhasil");
                            mn.dispose();
                            goToTransaksi();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Inputan Salah");
                        }
                    }
                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToTransaksi();
                }
            } else if (view instanceof editTransaksi) {
                editTransaksi mn = (editTransaksi) view;
                if (source.equals(mn.getBtnCari())) {
                    transaksi tr = app.getTransaksiResi(mn.getNoResi());
                    if (mn.getNoResi().equals("")) {
                        JOptionPane.showMessageDialog(null, "No. Resi Harus diisi");
                        mn.setVisible(true);
                    } else if (tr != null) {
                        mn.setBesarUang(String.valueOf(tr.getBesarUang()));
                        mn.setTglCetak(tr.getTglCetak());
                        mn.setNamaPengirim(tr.getNamaPengirim());
                        mn.setAlamatPengirim(tr.getAlamatPengirim());
                        mn.setTlpPengirim(String.valueOf(tr.getNotlpPengirim()));
                        mn.setPosPengirim(String.valueOf(tr.getKdPosPengirim()));
                        mn.setNamaPenerima(tr.getNamaPenerima());
                        mn.setAlamatPenerima(tr.getAlamatPenerima());
                        mn.setTelpPenerima(String.valueOf(tr.getNotlpPenerima()));
                        mn.setPosPenerima(String.valueOf(tr.getKdPosPenerima()));
                        mn.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Transaksi Tidak Ditemukan");
                    }
                } else if (source.equals(mn.getBtnEdit())) {
                    mn.dispose();
                    try {
                        transaksi tr = app.getTransaksiResi(mn.getNoResi());
                        if (mn.getNoResi().equals("")) {
                            JOptionPane.showMessageDialog(null, "No. Resi Harus diisi");
                            mn.setVisible(true);
                        } else if (tr != null) {
                            app.updateTransaksi(mn.getNoResi(), mn.getNamaPengirim(), mn.getAlamatPengirim(), mn.getTlpPengirim(), mn.getPosPengirim(), mn.getNamaPenerima(), mn.getAlamatPenerima(), mn.getTelpPenerima(), mn.getPosPenerima(), mn.getTglCetak(), mn.getBesarUang());
                            JOptionPane.showMessageDialog(null, "Pengeditan Transaksi Berhasil");
                            goToTransaksi();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data Transaksi Tidak Ditemukan");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Inputan Salah");
                    }

                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToTransaksi();
                }
            } else if (view instanceof viewTransaksi) {
                viewTransaksi mn = (viewTransaksi) view;
                mn.tampilTransaksi();
                if (source.equals(mn.getBtnBack())) {
                    mn.dispose();
                    goToTransaksi();
                } else if (source.equals(mn.getCekMasa())) {
                    try {

                        transaksi tr = app.getTransaksiResi(mn.getNoResi());
                        if (tr != null) {
                            mn.tampilTransaksiResi(mn.getNoResi());
                            view = mn;
                        } else {
                            JOptionPane.showMessageDialog(null, "Data Transaksi Tidak Ditemukan");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else if (view instanceof cetakTransaksi) {
                cetakTransaksi mn = (cetakTransaksi) view;
                if (source.equals(mn.getBtnCari())) {
                    try {
                        transaksi tr = app.getTransaksiResi(mn.getNoResi());
                        if (tr != null) {
                            mn.tampilTransaksi(mn.getNoResi());
                            view = mn;
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                } else if (source.equals(mn.getBtnExcel())) {
                    mn.dispose();
                    goToCetakTransaksi();
                } else if (source.equals(mn.getBtnPrint())) {
                    mn.dispose();

                    goToCetakTransaksi();
                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToTransaksi();
                }
            } else if (view instanceof MainLoket) {
                MainLoket mn = (MainLoket) view;
                if (source.equals(mn.getProfil())) {
                    mn.dispose();
                    goToProfilLoket();
                } else if (source.equals(mn.getStBayar())) {
                    mn.dispose();
                    goToStBayar();
                } else if (source.equals(mn.getLogout())) {
                    mn.dispose();
                    goToLogin();
                }
            } else if (view instanceof ProfilLoket) {
                ProfilLoket mn = (ProfilLoket) view;
                if (source.equals(mn.getBtnEdit())) {
                    mn.dispose();
                    try {
                        if (lok != null) {
                            app.updateLoket(lok.getIdLoket(), mn.getNama(), mn.getAlamat(), mn.getNoTelp(), mn.getUsername(), mn.getPassword());
                            JOptionPane.showMessageDialog(null, "Pengeditan Petugas Loket Berhasil");
                            goToMainLoket();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data Petugas Loket Tidak Ditemukan");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Inputan Salah");
                    }
                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToMainLoket();
                }
            } else if (view instanceof StatusBayar) {
                StatusBayar mn = (StatusBayar) view;
                if (source.equals(mn.getBtnCari())) {

                    try {
                        transaksi tr = app.getTransaksi(mn.getTgl());
                        if (tr != null) {
                            mn.tampilTransaksi(mn.getTgl());
                            view = mn;
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToMainLoket();
                }
            } else if (view instanceof Expedisi) {
                Expedisi mn = (Expedisi) view;
                if (source.equals(mn.getAddExpedisi())) {
                    mn.dispose();
                    goToAddExpedisi();
                } else if (source.equals(mn.getEditExpedisi())) {
                    mn.dispose();
                    goToEditExpedisi();
                } else if (source.equals(mn.getViewExpedisi())) {
                    mn.dispose();
                    goToViewExpedisi();
                } else if (source.equals(mn.getBack())) {
                    mn.dispose();
                    goToMain();
                }
            } else if (view instanceof addExpedisi) {
                addExpedisi mn = (addExpedisi) view;
                if (source.equals(mn.getBtnAdd())) {
                    try {
                        model.expedisi m = app.getExpedisiId(mn.getId());
                        if ((mn.getId() == 0) || (mn.getNama().equals("")) || (mn.getAlamat().equals(""))
                                || (mn.getNotlp() == 0) || (mn.getUsername().equals("")) || (mn.getPass().equals(""))
                                || (mn.getPass2().equals(""))) {
                            mn.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
                        } else if (mn.getPass().equals(mn.getPass2())) {
                            if (m == null) {
                                model.expedisi m2 = app.getExpedisi(mn.getUsername(), mn.getPass());
                                if (m2 == null) {
                                    mn.dispose();
                                    model.expedisi m3 = new model.expedisi(mn.getId(), mn.getNama(), mn.getAlamat(), mn.getNotlp(), mn.getUsername(), mn.getPass());
                                    app.saveExpedisi(m3);
                                    JOptionPane.showMessageDialog(null, "Penambahan Petugas Expedisi Berhasil");
                                    goToManpel();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Username sudah ada");
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "ID sudah ada");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password Tidak Sama");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Inputan Salah");
                    }
                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToExpedisi();
                }
            } else if (view instanceof editExpedisi) {
                editExpedisi mn = (editExpedisi) view;

                if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToExpedisi();
                } else if (source.equals(mn.getBtnCari())) {
                    model.expedisi ep = app.getExpedisiId(mn.getId());
                    if (ep != null) {
                        mn.setNama(ep.getNama());
                        mn.setAlamat(ep.getAlamat());
                        mn.setNotlp(String.valueOf(ep.getNotlp()));
                        mn.setUsername(ep.getUsername());
                        mn.setPass(ep.getPassword());
                        mn.setPass2(ep.getPassword());
                    } else {
                        JOptionPane.showMessageDialog(null, "Data tidak ada");
                    }
                } else if (source.equals(mn.getBtnEdit())) {
                        model.expedisi ep = app.getExpedisiId(mn.getId());
                    if ((mn.getNama().equals("")) || (mn.getAlamat().equals(""))
                            || (mn.getNotlp() == 0) || (mn.getUsername().equals("")) || (mn.getPass().equals(""))
                            || (mn.getPass2().equals(""))) {
                        JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
                    } else if (ep != null) {
                        if (mn.getPass().equals(mn.getPass2())) {
                            app.updateExpedisi(ep.getIdExpedisi(), mn.getNama(), mn.getAlamat(), mn.getNotlp(), mn.getUsername(), mn.getPass());
                            JOptionPane.showMessageDialog(null, "Pengeditan Expedisi Berhasil");
                            goToExpedisi();
                        } else {
                            JOptionPane.showMessageDialog(null, "Password Tidak sama");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Data tidak ada");
                    }

                }
            } else if (view instanceof viewExpedisi) {
                viewExpedisi mn = (viewExpedisi) view;
                if (source.equals(mn.getBtnBack())) {
                    mn.dispose();
                    goToExpedisi();
                }
            } else if (view instanceof Loket) {
                Loket mn = (Loket) view;
                if (source.equals(mn.getAddLoket())) {
                    mn.dispose();
                    goToAddLoket();
                } else if (source.equals(mn.getEditLoket())) {
                    mn.dispose();
                    goToEditLoket();
                } else if (source.equals(mn.getViewLoket())) {
                    mn.dispose();
                    goToViewLoket();
                } else if (source.equals(mn.getBack())) {
                    mn.dispose();
                    goToMain();
                }
            } else if (view instanceof addLoket) {
                addLoket mn = (addLoket) view;
                if (source.equals(mn.getBtnAdd())) {
                    try {
                        model.loket m = app.getLoketId(mn.getId());
                        if ((mn.getId() == 0) || (mn.getNama().equals("")) || (mn.getAlamat().equals(""))
                                || (mn.getNotlp() == 0) || (mn.getUsername().equals("")) || (mn.getPass().equals(""))
                                || (mn.getPass2().equals(""))) {
                            mn.setVisible(true);
                            JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
                        } else if (mn.getPass().equals(mn.getPass2())) {
                            if (m == null) {
                                model.loket m2 = app.getLoket(mn.getUsername(), mn.getPass());
                                if (m2 == null) {
                                    mn.dispose();
                                    model.loket m3 = new model.loket(mn.getId(), mn.getNama(), mn.getAlamat(), mn.getNotlp(), mn.getUsername(), mn.getPass());
                                    app.saveLoket(m3);
                                    JOptionPane.showMessageDialog(null, "Penambahan Petugas Loket Berhasil");
                                    goToLoket();
                                } else {
                                    JOptionPane.showMessageDialog(null, "Username sudah ada");
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "ID sudah ada");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password Tidak Sama");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Inputan Salah");
                    }
                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToLoket();
                }
            } else if (view instanceof editLoket) {
                editLoket mn = (editLoket) view;
                

                if (source.equals(mn.getBtnCari())) {
                    model.loket ep = app.getLoketId(mn.getId());
                    if (ep != null) {
                        mn.setNama(ep.getNama());
                        mn.setAlamat(ep.getAlamat());
                        mn.setNotlp(String.valueOf(ep.getNotlp()));
                        mn.setUsername(ep.getUsername());
                        mn.setPass(ep.getPassword());
                        mn.setPass2(ep.getPassword());
                    } else {
                        JOptionPane.showMessageDialog(null, "Data tidak ada");
                    }
                } else if (source.equals(mn.getBtnEdit())) {
                    model.loket ep = app.getLoketId(mn.getId());
                    if ((mn.getNama().equals("")) || (mn.getAlamat().equals(""))
                            || (mn.getNotlp() == 0) || (mn.getUsername().equals("")) || (mn.getPass().equals(""))
                            || (mn.getPass2().equals(""))) {
                        JOptionPane.showMessageDialog(null, "Tidak Boleh Kosong");
                    } else if (ep != null) {
                        if (mn.getPass().equals(mn.getPass2())) {
                            app.updateLoket(ep.getIdLoket(), mn.getNama(), mn.getAlamat(), mn.getNotlp(), mn.getUsername(), mn.getPass());
                            JOptionPane.showMessageDialog(null, "Pengeditan Loket Berhasil");
                            goToLoket();
                        } else {
                            JOptionPane.showMessageDialog(null, "Password Tidak sama");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Data tidak ada");
                    }

                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToLoket();
                }
            } else if (view instanceof viewLoket) {
                viewLoket mn = (viewLoket) view;
                if (source.equals(mn.getBtnBack())) {
                    mn.dispose();
                    goToLoket();
                }
            } else if (view instanceof MainExpedisi) {
                MainExpedisi mn = (MainExpedisi) view;
                if (source.equals(mn.getProfil())) {
                    mn.dispose();
                    goToProfilExpedisi();
                } else if (source.equals(mn.getStAntar())) {
                    mn.dispose();
                    goToStAntar();
                } else if (source.equals(mn.getLogout())) {
                    mn.dispose();
                    goToLogin();
                }
            } else if (view instanceof ProfilExpedisi) {
                ProfilExpedisi mn = (ProfilExpedisi) view;
                if (source.equals(mn.getBtnEdit())) {
                    mn.dispose();
                    try {
                        if (expe != null) {
                            app.updateExpedisi(expe.getIdExpedisi(), mn.getNama(), mn.getAlamat(), mn.getNoTelp(), mn.getUsername(), mn.getPassword());
                            JOptionPane.showMessageDialog(null, "Pengeditan Petugas Expedisi Berhasil");
                            goToMainExpedisi();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data Petugas Expedisi Tidak Ditemukan");
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Inputan Salah");
                    }
                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToMainExpedisi();
                }
            } else if (view instanceof StatusAntar) {
                StatusAntar mn = (StatusAntar) view;
                if (source.equals(mn.getBtnCari())) {
                    try {
                        transaksi tr = app.getTransaksi(mn.getTgl());
                        if (tr != null) {
                            mn.tampilTransaksi(mn.getTgl());
                            view = mn;
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (source.equals(mn.getBtnCancel())) {
                    mn.dispose();
                    goToMainExpedisi();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // JOptionPane.showMessageDialog(null, "Inputan salah");
        }
    }
}
