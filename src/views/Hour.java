package views;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Hour extends javax.swing.JInternalFrame /*esto es importante para que funcione->*/implements Runnable{
    String horas,minutos,segundos,ampm;
    Calendar calendario;
    Thread h1;

    public Hour() {
        initComponents();
        //creo el objeto
        h1 = new Thread(this);
        //este hace que se vea la hora en el label
        h1.start();
        //este es para hacer visible el internal frame
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTimer = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        lblTimer.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimer.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimer, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTimer, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void run() {
        //este metodo es como se va a mostrar
        Thread ct = Thread.currentThread();
        
        while(ct == h1){
            calcula();
            lblTimer.setText(horas+":"+minutos+":"+segundos+" "+ampm);
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                
            }
        }
    }

    private void calcula() {
        //esta funcion es para que camine la hora 
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        // este es para identificar si es am o pm
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM?"AM":"PM";
        
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            horas=h>9?""+h:"0"+h;
        }else{
            horas=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
    }
        // y este es para la hora
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTimer;
    // End of variables declaration//GEN-END:variables
}
