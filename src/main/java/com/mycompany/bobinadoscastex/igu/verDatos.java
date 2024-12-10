
package com.mycompany.bobinadoscastex.igu;

import com.mycompany.bobinadoscastex.logica.Controladora;
import com.mycompany.bobinadoscastex.logica.Motor;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class verDatos extends javax.swing.JFrame {

    Controladora control = null;
    public verDatos() {
        control = new Controladora();
        initComponents();
       cargarTabla();
       
    }
      private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        cargarTabla();
    } 
    
    
                             


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMotor = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 15, 15));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  Datos Motores");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        tablaMotor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMotor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pc\\Downloads\\seo-social-web-network-internet_262_icon-icons.com_61518.png")); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pc\\Downloads\\pencil-striped-symbol-for-interface-edit-buttons_icon-icons.com_56782.png")); // NOI18N
        jButton2.setText("Editar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // controlo que la tabla no este vacia 
       if(tablaMotor.getRowCount()> 0){
          //controlo que haya seleccionado uno que quiera elimina
          //le pongo menos uno porque empezamos en 0 osea 0 es uno y -1 no existe 
          if(tablaMotor.getSelectedRow() != -1){
              //recueramos el id que seleccione en la tabla 
              //ponemos colum 0 porque ahi tenemos el id
              int num_id = Integer.parseInt(String.valueOf(tablaMotor.getValueAt(tablaMotor.getSelectedRow(), 0)));
             //mandamos el msj qie salio todo ok :)
             
              control.eliminarMotor(num_id);
              mensaje(" Eliminado exitosamente ","Eliminado Correctamente","info");
              //volvemos a cargar la tabla porque si no no sale los cambios echos
              cargarTabla();
             
          }
                       else{
                mensaje("NO Seleccionaste nada ", "error", "Error al eliminar");
            }
           
           
       }else{
            mensaje("No ahi ningun tipo de Motor", "error", "Error al eliminar");
        }
               
               
               
               
    }//GEN-LAST:event_jButton1ActionPerformed
private void mensaje(String mensaje, String titulo, String tipo){
         JOptionPane optionPane = new JOptionPane(mensaje);
         if(tipo.equals("info")){
             optionPane.setMessage(JOptionPane.INFORMATION_MESSAGE);
         }
         else if(tipo.equals("error")){
             optionPane.setMessage(JOptionPane.ERROR_MESSAGE);
         }
             JDialog dialog = optionPane.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
        
        
    }
  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMotor;
    // End of variables declaration//GEN-END:variables

   

    private void cargarTabla() {
        
            DefaultTableModel modeloTabla = new DefaultTableModel(){
           @Override//sobreescribo el el metodo que tiene defaultablemodel y le pongo que siempre de false
           public boolean isCellEditable(int row, int colum){
           return false;
       }};
       String titulos[] = {"ID","nombreCliente", "telCliente", "marca","RPM","paso","vueltas", "alambre"
       , "voltaje"};
       
        //Le decimos que use de titulos que es un array todos los titulos que tegna y lo use como Columnas
        modeloTabla.setColumnIdentifiers(titulos);
       //le pasamos los datos a la BD
       //creamos un metodo en la clase control para que llame a la persistencia
       List<Motor> motores = control.traerMotores();
       //recorrer la lista y mostrar datos de la tabla
       if(motores != null){
           //uso el foreach para agregar los datos dinamicamente 
           for(Motor mot: motores){
               //usamos Object porque abarca todo en javaosea estos son los datos recuperados
           Object colum[]= {mot.getIdMotor(),mot.getCliente().getNombreCompleto(),mot.getCliente().getNumCliente(),mot.getMarcaMotor(),
            mot.getRpm(), mot.getPaso(), mot.getVueltas(),mot.getAlambre(),mot.getVoltaje()};
           //agregamos con la siguiente funcion las columnas
           modeloTabla.addRow(colum);
           //todavia no lo puse en la igu espera
           }
       }
       tablaMotor.setModel(modeloTabla);
        System.out.println("llege hasta aca....");
       
    }
}
