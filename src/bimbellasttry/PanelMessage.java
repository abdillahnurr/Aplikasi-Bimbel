
package bimbellasttry;

import javax.swing.JOptionPane;

public class PanelMessage extends message implements error{
       

    @Override
    public String gagalLogin() {
        JOptionPane.showMessageDialog(null,"Username dan Password Salah, Masukkan Yang sesuai!");
        return null;
    }

    @Override
    public String tambah() {
        JOptionPane.showMessageDialog(null,"Data Berhasil Ditambahkan");
        return null;
    }

    
    @Override
    public  String Error() {
        JOptionPane.showMessageDialog(null,"Data Sudah Ada");
        return null;
    }
    
}
