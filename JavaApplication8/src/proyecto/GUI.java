/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.json.JSONException;

/**
 *
 * @author User
 */
public class GUI extends javax.swing.JFrame {
    
    private List<JPanel> iSubjects;
    private int indice=1;
    public GUI() {
        initComponents();
        iSubjects = new ArrayList<>();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel = new FondoPanel();
        chat = new javax.swing.JPanel();
        fondoNot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        User = new javax.swing.JLabel();
        Btenviar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1028, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(0, 116, 167));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane3.setViewportView(jPanel2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 470, 410));

        jScrollPane2.setMinimumSize(new java.awt.Dimension(500, 170));

        panel.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(panel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 750));

        chat.setBackground(new java.awt.Color(0, 116, 167));
        chat.setMaximumSize(new java.awt.Dimension(461, 291));
        chat.setMinimumSize(new java.awt.Dimension(461, 291));
        chat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondoNot.setBackground(new java.awt.Color(255, 255, 255));
        fondoNot.setMinimumSize(new java.awt.Dimension(436, 214));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Oswald", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        User.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        User.setForeground(new java.awt.Color(0, 136, 154));
        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon5.png"))); // NOI18N
        User.setText("  Usuario");

        javax.swing.GroupLayout fondoNotLayout = new javax.swing.GroupLayout(fondoNot);
        fondoNot.setLayout(fondoNotLayout);
        fondoNotLayout.setHorizontalGroup(
            fondoNotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoNotLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoNotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addGroup(fondoNotLayout.createSequentialGroup()
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fondoNotLayout.setVerticalGroup(
            fondoNotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoNotLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(User)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        chat.add(fondoNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Btenviar.setText("Enviar");
        Btenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtenviarActionPerformed(evt);
            }
        });
        chat.add(Btenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        chat.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        getContentPane().add(chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtenviarActionPerformed
        /*
        String texto1=
           "<html>"
            +  "<body>Taller de programación "         
            + "<br>  "
            + "<br> Tematicas disponibles "
            
            + "<br>  "         
            + "<br>Docentes disponibles "
            
            + "<br>  "         
            + "</body></html>"                     
        ;        
        
        item(texto1,-460,"/img/icon6.png",panel, indice++);
        */
    }//GEN-LAST:event_BtenviarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*String texto=
            "<html><body>Segun 8 de cada 10 estudiantes cada docente maneja diferentes <br>" +
            "estrategias para evaluar el speaking. No pierdas la oportunidad de <br>"
            + "inscribete ahora a una tutoria.</body></html>"             
        ;*/
        
        //item(texto,-370,"/img/icon4.png",jPanel2,15);
        
        ClickearSubject();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btenviar;
    private javax.swing.JLabel User;
    private javax.swing.JPanel chat;
    private javax.swing.JPanel fondoNot;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint (Graphics g){
            imagen= new ImageIcon(getClass().getResource("/img/backgroundList.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }      
    }
    
    void item(String t,int n,String u, JPanel p, int n2){
        
        JLabel label1 = new JLabel();
        JPanel panelVariable1 = new JPanel();
        label1.setFont(new java.awt.Font("Oswald", 4, 11));
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText(t);
        label1.setIconTextGap(n);
        label1.setIcon(new ImageIcon(getClass().getResource(u)));
        panelVariable1.add(label1);
        panelVariable1.setOpaque(false);
        p.add(panelVariable1);
        if (n==-460){
            
            panelVariable1.setName(
                 Integer.toString(n2)
            );
            
            iSubjects.add(panelVariable1);
        }
        p.updateUI();
        
    }
    
    private int i;
    
    void ClickearSubject(){
        
        System.out.println(iSubjects.size());
        for (i = 0; i < iSubjects.size(); i++) {

            iSubjects.get(i).addMouseListener(new java.awt.event.MouseAdapter() {
               public void mouseClicked(java.awt.event.MouseEvent evt) {
                   try {
                       itemMouseClicked(evt);
                   } catch (JSONException ex) {
                       Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
            });   
        }
    }
    
    private void itemMouseClicked(java.awt.event.MouseEvent evt) throws JSONException { 
        //JFrame Opciones = new Opciones();
        Opciones opc = new Opciones();
	opc.setVisible(true);
	opc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        for (int j = 0; j < iSubjects.size(); j++) {
            if (evt.getSource()==iSubjects.get(j)){
                opc.iniciar(
                        Integer.parseInt (iSubjects.get(j).getName())
                );
                //System.out.println(iSubjects.get(j).getName());
                //System.out.println("Presione el item No: " + (j+1));
            }    
        }
        
    }
  
}       

