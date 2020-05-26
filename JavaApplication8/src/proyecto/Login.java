
package proyecto;

import Conexion.PHPClass;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.json.JSONException;


public class Login extends javax.swing.JFrame {
    
    ArrayList<Integer> codMat ;
    private String mensaje;
    private int codIni;
    private char TipUs;
            
    public Login() {
        initComponents();
        codMat = new ArrayList<>();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButtonAcceder = new javax.swing.JButton();
        jTextCorreo = new javax.swing.JTextField();
        jTextContraseña = new javax.swing.JPasswordField();
        jLabelRegistrarse = new javax.swing.JLabel();
        JBackground = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(534, 200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAcceder.setBackground(new java.awt.Color(0, 116, 167));
        jButtonAcceder.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        jButtonAcceder.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAcceder.setText("Acceder");
        jButtonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccederActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jTextCorreo.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        jTextCorreo.setForeground(new java.awt.Color(0, 136, 154));
        jTextCorreo.setToolTipText("Correo");
        jTextCorreo.setPreferredSize(new java.awt.Dimension(159, 30));
        getContentPane().add(jTextCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jTextContraseña.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        jTextContraseña.setForeground(new java.awt.Color(0, 136, 154));
        jTextContraseña.setToolTipText("Contraseña");
        getContentPane().add(jTextContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 160, 30));

        jLabelRegistrarse.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        jLabelRegistrarse.setForeground(new java.awt.Color(0, 136, 154));
        jLabelRegistrarse.setText("Aun no estas registrado.");
        jLabelRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrarseMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        JBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        getContentPane().add(JBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccederActionPerformed
        
        if (
            (jTextCorreo.getText().equals(""))&& (jTextContraseña.getText().equals(""))
        ){
            JOptionPane.showMessageDialog(null, "Por favor. Escribir los datos del usuario");
        }else{
            try {
                new PHPClass().getInfo().forEach(i -> {
                    String correo = i.getCorreoElectronico();
                    String contraseña = i.getContraseña();

                    if ((jTextCorreo.getText().equals(correo)) && (jTextContraseña.getText().equals(contraseña))){ 
                        codIni= i.getCedula();
                        TipUs=i.getTipoUsuario().charAt(0);
                        System.out.println("El usuario es de tipo: " + TipUs);
                        mensaje="Usuario verificado";
                    }    
                }
                );
            } catch (JSONException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(mensaje);
            JOptionPane.showMessageDialog(null, mensaje);
            Iniciar();
            mensaje="";
            
        }
        
        
    }//GEN-LAST:event_jButtonAccederActionPerformed

    private void jLabelRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarseMouseClicked
        JFrame Register = new Register();
	Register.setVisible(true);
	Register.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jLabelRegistrarseMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JBackground;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAcceder;
    private javax.swing.JLabel jLabelRegistrarse;
    private javax.swing.JPasswordField jTextContraseña;
    private javax.swing.JTextField jTextCorreo;
    // End of variables declaration//GEN-END:variables
    
    
    void Iniciar (){
        if (mensaje.equals("Usuario verificado")){
            Login.this.dispose();
            GUI inicio = new GUI();
            inicio.setVisible(true);
            
            if (String.valueOf(TipUs).equals("T")) {
                try {
                    new PHPClass().getInfoSubjects("getInfoSubjects.php").forEach(i -> {
                        String nombre = i.getNombreMateria();
                        int codigo = i.getDocenteEncargado();

                        if (codigo == codIni) {
                            inicio.item(nombre, -460, "/img/icon6.png", inicio.panel, i.getNoMateria());
                            codMat.add(i.getNoMateria());
                        }

                    });
                            
                    /*for (int i = 0; i < codMat.size(); i++) {
                        System.out.println(codMat.get(i));
                    }*/

                    new PHPClass().getInfoNews().forEach(i -> {
                        String descripcion = i.getDescripcionNoticia();
                        int codigo = i.getNoMateria();

                        for (int j = 0; j < codMat.size(); j++) {
                            if (codigo == codMat.get(j)) {
                                inicio.item(descripcion, -370, "/img/icon4.png", inicio.jPanel2, i.getNoNoticia());
                            }
                        }

                    }
                    );
                } catch (JSONException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(String.valueOf(TipUs).equals("E")){
               
                try {
                    new PHPClass().getInfoSubjects("getInfoSubjectsStudents.php").forEach(i -> {
                        String nombre = i.getNombreMateria();
                        inicio.item(nombre, -460, "/img/icon6.png", inicio.panel, i.getNoMateria());
                        codMat.add(i.getNoMateria());
                    });

                    /*for (int i = 0; i < codMat.size(); i++) {
                        System.out.println(codMat.get(i));
                    }*/

                    new PHPClass().getInfoNews().forEach(i -> {
                        String descripcion = i.getDescripcionNoticia();
                        int codigo = i.getNoMateria();

                        for (int j = 0; j < codMat.size(); j++) {
                            if (codigo == codMat.get(j)) {
                                inicio.item(descripcion, -370, "/img/icon4.png", inicio.jPanel2, i.getNoNoticia());
                            }
                        }

                    }
                    );
                } catch (JSONException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        
        inicio.ClickearSubject();
            
        }
    }
    
}
