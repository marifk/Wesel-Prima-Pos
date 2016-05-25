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
import view.manpel.addPelayanan;
import view.manpel.addTransaksi;
import view.manpel.cetakTransaksi;
import view.manpel.editTransaksi;
import view.manpel.profilManpel;
import view.manpel.viewPelayanan;
import view.manpel.viewTransaksi;

/**
 *
 * @author Kurniawan
 */
public class Controller implements ActionListener {

    private View view;
    private Aplikasi app;
    private String level;

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
        view = m;
    }

    public void goToViewPelayanan() {
        viewPelayanan m = new viewPelayanan();
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
                            JOptionPane.showMessageDialog(null, "Selamat datang " + lg.getTxUsername());
                            lg.dispose();
                            goToMain();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data tidak ada");
                        }
                    } else if (lg.getSbg().equals("Expedisi")) {
                        model.expedisi ex = app.getExpedisi(lg.getTxUsername(), lg.getTxPassword());
                        if (ex != null) {
                            JOptionPane.showMessageDialog(null, "Selamat datang " + lg.getTxUsername());
                            lg.dispose();
                            goToMainExpedisi();
                        } else {
                            JOptionPane.showMessageDialog(null, "Data tidak ada");
                        }
                    } else if (lg.getSbg().equals("Loket")) {
                        model.loket lk = app.getLoket(lg.getTxUsername(), lg.getTxPassword());
                        if (lk != null) {
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
                }
            } else if (view instanceof cetakTransaksi) {
                cetakTransaksi mn = (cetakTransaksi) view;
                if (source.equals(mn.getBtnCari())) {
                    try {
                        transaksi tr = app.getTransaksiResi(mn.getNoResi());
                        if (tr != null) {
                            cetakTransaksi m = new cetakTransaksi();
                            m.setVisible(true);
                            m.addListener(this);
                            m.tampilTransaksi(mn.getNoResi());
                            view = m;
                        }
                    } catch (Exception e) {
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
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // JOptionPane.showMessageDialog(null, "Inputan salah");
        }
    }
}
