/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.manpel;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import koneksi.Database;
import model.View;
import model.transaksi;

/**
 *
 * @author Kurniawan
 */
public class cetakTransaksi extends javax.swing.JFrame implements View {

    /**
     * Creates new form cetakTransaksi
     */
    public cetakTransaksi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnExcel = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        noResi = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransaksi = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cetak Transaksi"));

        btnExcel.setText("Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel1.setText("No. Resi");

        btnCari.setText("Search");

        tbTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15"
            }
        ));
        jScrollPane1.setViewportView(tbTransaksi);

        btnCancel.setText("Cancel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrint))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(noResi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnCari)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(noResi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcel)
                    .addComponent(btnPrint)
                    .addComponent(btnCancel))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    model.transaksi tr = new transaksi();
    static int jum;
    Date d= new Date();
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        try {
            jum++;
            if ((tr.getTglCetak().)) {
                tbTransaksi.print();
                tr.setStatusCetak("Cetak ke" + jum);
            }
            else{
                JOptionPane.showMessageDialog(null, "Masa Cetak sudah habis");
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "gagal mencetak dokumen \n" + e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed
    public void exportCalc(JTable tabel, File f) {
        DefaultTableModel tabelModel;
        try {
            int a, b;
            tabelModel = (DefaultTableModel) tabel.getModel();
            FileWriter fw = new FileWriter(f);
            for (a = 0; a < tabelModel.getColumnCount(); a = a + 1) {
                fw.write(tabelModel.getColumnName(a) + " \t");
            }
            fw.write(" \n");
            for (a = 0; a < tabelModel.getRowCount(); a = a + 1) {
                for (b = 0; b < tabelModel.getColumnCount(); b = b + 1) {
                    fw.write(tabelModel.getValueAt(a, b).toString() + " \t");
                }
                fw.write(" \n");
            }
            fw.close();
            JOptionPane.showMessageDialog(null, "Data berhasil di export ke ms.excel\n location:CRUD");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        exportCalc(tbTransaksi, new File("DataTransaksi.xls"));
    }//GEN-LAST:event_btnExcelActionPerformed

    public String getNoResi() {
        return noResi.getText();
    }

    public void setNoResi(String noResi) {
        this.noResi.setText(noResi);
    }

    public Object getBtnCancel() {
        return btnCancel;
    }

    public Object getBtnCari() {
        return btnCari;
    }

    public Object getBtnExcel() {
        return btnExcel;
    }

    public Object getBtnPrint() {
        return btnPrint;
    }

    public void tampilTransaksi(String resi) {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("No. Resi");
        tabel.addColumn("Tanggal Cetak");
        tabel.addColumn("Besar Uang");
        tabel.addColumn("Nama Pengirim");
        tabel.addColumn("Alamat Pengirim");
        tabel.addColumn("No. Tlp Pengirim");
        tabel.addColumn("Kode Pos Pengirim");
        tabel.addColumn("Nama Penerima");
        tabel.addColumn("Alamat Penerima");
        tabel.addColumn("No. Tlp Penerima");
        tabel.addColumn("Kode Pos Penerima");
        tabel.addColumn("Status Cetak");
        tabel.addColumn("Status Antar");
        tabel.addColumn("Status Bayar");
        tabel.addColumn("Keterangan");
        try {
            Database db = new Database();

            String s = "select * from transaksi where noResi='" + resi + "'";
            ResultSet res = db.getData(s);
            if (res.next()) {
                tr.setNoResi(res.getString(1));
                tr.setNamaPengirim(res.getString(2));
                tr.setAlamatPengirim(res.getString(3));
                tr.setNotlpPengirim(res.getInt(4));
                tr.setKdPosPengirim(res.getInt(5));
                tr.setNamaPenerima(res.getString(6));
                tr.setAlamatPenerima(res.getString(7));
                tr.setNotlpPenerima(res.getInt(8));
                tr.setKdPosPenerima(res.getInt(9));
                tr.setTglCetak(res.getDate(10));
                tr.setBesarUang(res.getInt(11));
                tr.setStatusCetak(res.getString(12));
                tr.setStatusAntar(res.getString(13));
                tr.setStatusBayar(res.getString(14));
                tr.setKet(res.getString(15));
                tabel.addRow(new Object[]{res.getString(1), res.getDate(10), res.getInt(11),
                    res.getString(2), res.getString(3), res.getInt(4), res.getInt(5),
                    res.getString(6), res.getString(7), res.getInt(8), res.getInt(9),
                    res.getString(12), res.getString(13), res.getString(14), res.getString(15)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Tampil Data");
        }
        tbTransaksi.setModel(tabel);
    }

    @Override
    public void addListener(ActionListener e) {
        btnCancel.addActionListener(e);
        btnCari.addActionListener(e);
        btnExcel.addActionListener(e);
        btnPrint.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField noResi;
    private javax.swing.JTable tbTransaksi;
    // End of variables declaration//GEN-END:variables
}
