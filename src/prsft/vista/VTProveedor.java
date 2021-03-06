package prsft.vista;

import prsft.modelo.DAOTproveedor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan Jose
 */
public class VTProveedor extends javax.swing.JDialog {

    
    public VTProveedor(java.awt.Frame parent, boolean modal) throws InstantiationException, IllegalAccessException {
        super(parent, modal);
        initComponents();
         new DAOTproveedor().cargar(tbproveedores);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbproveedores = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        añadir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Proveedor");

        tbproveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Telefono", "Direccion", "Email"
            }
        ));
        jScrollPane1.setViewportView(tbproveedores);

        añadir.setText("Añadir");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(añadir)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añadir)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * 
 * @param evt 
 */
    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        int fila = tbproveedores.getSelectedRow();
        String nombre,nit,telefono,email,dir;
        nombre = tbproveedores.getValueAt(fila, 1).toString();
        nit = tbproveedores.getValueAt(fila, 0).toString();
        telefono = tbproveedores.getValueAt(fila, 2).toString();
        email = tbproveedores.getValueAt(fila, 4).toString();
        dir = tbproveedores.getValueAt(fila, 3).toString();
        VCompra.txtNit.setText(nit);
        VCompra.txtTelefono.setText(telefono);
        VCompra.txtDireccion.setText(dir);
        VCompra.txtNombre.setText(nombre);
        this.dispose();
    }//GEN-LAST:event_añadirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VTProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VTProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VTProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VTProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             try {
                 VTProveedor dialog = new VTProveedor(new javax.swing.JFrame(), true);
                 dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                     
                     @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                 }
               });
                 dialog.setVisible(true);
             }catch(InstantiationException | IllegalAccessException  ex){
               Logger.getLogger(VTProveedor.class.getName()).log(Level.SEVERE, null, ex);  
             }
            }
        });
    }
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton añadir;
    public javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbproveedores;
    // End of variables declaration//GEN-END:variables
}
