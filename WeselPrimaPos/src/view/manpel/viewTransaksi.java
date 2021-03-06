/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.manpel;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import koneksi.Database;
import model.View;
import model.transaksi;

/**
 *
 * @author Kurniawan
 */
public class viewTransaksi extends javax.swing.JFrame implements View {

    /**
     * Creates new form viewTransaksi
     */
    public viewTransaksi() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransaksi = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        cekMasa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        noResi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("View Transaksi"));

        tbTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbTransaksi);

        btnBack.setText("Back");

        cekMasa.setText("Cek Masa Cetak");

        jLabel1.setText("No. Resi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(noResi, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cekMasa)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(noResi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekMasa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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

    public Object getBtnBack() {
        return btnBack;
    }
//noresi, tglcetal, status masa cetak, 

    public void tampilTransaksi() {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("No. Resi");
        tabel.addColumn("Tanggal Cetak");
        tabel.addColumn("Besar Uang");
        tabel.addColumn("Status Cetak");
        try {
            Database db = new Database();

            String s = "select * from transaksi";
            ResultSet res = db.getData(s);
            while (res.next()) {
                tabel.addRow(new Object[]{res.getString(1), res.getDate(10), res.getInt(11), res.getString(12)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Tampil Data");
        }
        tbTransaksi.setModel(tabel);
    }

    public void tampilTransaksiResi(String resi) {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("No. Resi");
        tabel.addColumn("Tanggal Cetak");
        tabel.addColumn("Besar Uang");
        tabel.addColumn("Status Cetak");
        try {
            Database db = new Database();

            String s = "select * from transaksi where noResi='" + resi + "'";
            ResultSet res = db.getData(s);
            while (res.next()) {
                tabel.addRow(new Object[]{res.getString(1), res.getDate(10), res.getInt(11), res.getString(12)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Tampil Data");
        }
        tbTransaksi.setModel(tabel);
    }

    public Object getCekMasa() {
        return cekMasa;
    }

    public String getNoResi() {
        return noResi.getText();
    }

    public void setNoResi(String noResi) {
        this.noResi.setText(noResi);
    }

    @Override
    public void addListener(ActionListener e) {
        btnBack.addActionListener(e);
        cekMasa.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton cekMasa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField noResi;
    private javax.swing.JTable tbTransaksi;
    // End of variables declaration//GEN-END:variables
}
