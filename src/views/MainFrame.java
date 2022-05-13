package views;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        //este es para maximiza
        setExtendedState(MAXIMIZED_BOTH);
        //muestra la fecha
        txtDate.setText(fechaActual());               
    }

    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/notas.jpg"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        txtDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFiles = new javax.swing.JMenu();
        jMenuItemNew = new javax.swing.JMenuItem();
        jMenuItemClose = new javax.swing.JMenuItem();
        Timer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        txtDate.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtDate.setText("dia/mes/año");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Fecha:");

        desktop.setLayer(txtDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jMenuFiles.setText("Achivos");

        jMenuItemNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Nuevo.png"))); // NOI18N
        jMenuItemNew.setText("Nuevo");
        jMenuItemNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewActionPerformed(evt);
            }
        });
        jMenuFiles.add(jMenuItemNew);

        jMenuItemClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnExit.png"))); // NOI18N
        jMenuItemClose.setText("Salir");
        jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCloseActionPerformed(evt);
            }
        });
        jMenuFiles.add(jMenuItemClose);

        Timer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reloj.png"))); // NOI18N
        Timer.setText("Hora");
        Timer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimerActionPerformed(evt);
            }
        });
        jMenuFiles.add(Timer);

        jMenuBar1.add(jMenuFiles);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String fechaActual(){
        Date fecha = new Date();
        // aqui creo la clase para mostrar la fecha en el formato que quiero
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(new Date());
    }
    private void jMenuItemNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewActionPerformed
        //aqui creo el objeto para llamar el JInternalFrame
        InternalFrame1 f1 = new InternalFrame1();
        //aqui lo muestro dentro del desktop pane
        desktop.add(f1);
        //aqui hago que se pueda ver
        f1.show();
    }//GEN-LAST:event_jMenuItemNewActionPerformed

    private void jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCloseActionPerformed
        // esto es para cerrar
        this.dispose();
    }//GEN-LAST:event_jMenuItemCloseActionPerformed

    private void TimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimerActionPerformed
        Hour h =new Hour();
        desktop.add(h);
        h.show();
    }//GEN-LAST:event_TimerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Timer;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFiles;
    private javax.swing.JMenuItem jMenuItemClose;
    private javax.swing.JMenuItem jMenuItemNew;
    private javax.swing.JLabel txtDate;
    // End of variables declaration//GEN-END:variables
}
