/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class GUICopy extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUICopy() {
        initComponents();
    }
    
    JPanel[] panelArray = new JPanel[3];
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        item = new javax.swing.JPanel();
        subject = new javax.swing.JLabel();
        Term = new javax.swing.JLabel();
        Teacher = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        item1 = new javax.swing.JPanel();
        subject1 = new javax.swing.JLabel();
        Term1 = new javax.swing.JLabel();
        Teacher1 = new javax.swing.JLabel();
        Image1 = new javax.swing.JLabel();
        item2 = new javax.swing.JPanel();
        subject2 = new javax.swing.JLabel();
        Term2 = new javax.swing.JLabel();
        Teacher2 = new javax.swing.JLabel();
        Image2 = new javax.swing.JLabel();
        caja = new javax.swing.JPanel();
        noticia = new javax.swing.JPanel();
        burbuja = new javax.swing.JLabel();
        burbuja1 = new javax.swing.JLabel();
        burbuja2 = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        chat = new javax.swing.JPanel();
        fondoNot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        User = new javax.swing.JLabel();
        Btenviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1028, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item.setBackground(new java.awt.Color(67, 122, 82));
        item.setPreferredSize(new java.awt.Dimension(478, 161));
        item.setRequestFocusEnabled(false);
        item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMouseClicked(evt);
            }
        });
        item.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subject.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        subject.setForeground(new java.awt.Color(255, 255, 255));
        subject.setText("Taller de programación");
        item.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 20, -1, -1));

        Term.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        Term.setForeground(new java.awt.Color(255, 255, 255));
        Term.setText("4 tematicas disponibles");
        item.add(Term, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 49, -1, -1));

        Teacher.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        Teacher.setForeground(new java.awt.Color(255, 255, 255));
        Teacher.setText("3 docentes disponibles");
        item.add(Teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 78, -1, -1));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon1.png"))); // NOI18N
        item.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        getContentPane().add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        item1.setBackground(new java.awt.Color(67, 122, 82));
        item1.setPreferredSize(new java.awt.Dimension(478, 161));
        item1.setRequestFocusEnabled(false);
        item1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subject1.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        subject1.setForeground(new java.awt.Color(255, 255, 255));
        subject1.setText("Matematicas Basicas");
        item1.add(subject1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 20, -1, -1));

        Term1.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        Term1.setForeground(new java.awt.Color(255, 255, 255));
        Term1.setText("4 tematicas disponibles");
        item1.add(Term1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 49, -1, -1));

        Teacher1.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        Teacher1.setForeground(new java.awt.Color(255, 255, 255));
        Teacher1.setText("3 docentes disponibles");
        item1.add(Teacher1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 78, -1, -1));

        Image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon2.png"))); // NOI18N
        item1.add(Image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        getContentPane().add(item1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        item2.setBackground(new java.awt.Color(67, 122, 82));
        item2.setPreferredSize(new java.awt.Dimension(478, 161));
        item2.setRequestFocusEnabled(false);
        item2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subject2.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        subject2.setForeground(new java.awt.Color(255, 255, 255));
        subject2.setText("Ingles Basico");
        item2.add(subject2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 20, -1, -1));

        Term2.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        Term2.setForeground(new java.awt.Color(255, 255, 255));
        Term2.setText("4 tematicas disponibles");
        item2.add(Term2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 49, -1, -1));

        Teacher2.setFont(new java.awt.Font("Oswald", 0, 11)); // NOI18N
        Teacher2.setForeground(new java.awt.Color(255, 255, 255));
        Teacher2.setText("3 docentes disponibles");
        item2.add(Teacher2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 78, -1, -1));

        Image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon3.png"))); // NOI18N
        item2.add(Image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        getContentPane().add(item2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        caja.setBackground(new java.awt.Color(0, 136, 154));
        caja.setPreferredSize(new java.awt.Dimension(444, 728));

        javax.swing.GroupLayout cajaLayout = new javax.swing.GroupLayout(caja);
        caja.setLayout(cajaLayout);
        cajaLayout.setHorizontalGroup(
            cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        cajaLayout.setVerticalGroup(
            cajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );

        getContentPane().add(caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        noticia.setBackground(new java.awt.Color(0, 116, 167));
        noticia.setPreferredSize(new java.awt.Dimension(474, 414));
        noticia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        burbuja.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        burbuja.setForeground(new java.awt.Color(255, 255, 255));
        burbuja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        burbuja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon4.png"))); // NOI18N
        burbuja.setText("<html><center>Recuerda que el tema Sockets es fundamental para la siguiente evaluacion de practica de laboratorio. Si tienes dificultades no esperes más.");
        burbuja.setAlignmentY(5.0F);
        burbuja.setAutoscrolls(true);
        burbuja.setIconTextGap(-384);
        burbuja.setPreferredSize(new java.awt.Dimension(380, 72));
        burbuja.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        noticia.add(burbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 390, 75));

        burbuja1.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        burbuja1.setForeground(new java.awt.Color(255, 255, 255));
        burbuja1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        burbuja1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon4.png"))); // NOI18N
        burbuja1.setText("<html><center>Segun 8 de cada 10 estudiantes cada docente maneja diferentes \n" +
            "estrategias para evaluar el speaking. No pierdas la oportunidad de inscribete ahora a una tutoria.");
        burbuja1.setAlignmentY(5.0F);
        burbuja1.setAutoscrolls(true);
        burbuja1.setIconTextGap(-384);
        burbuja1.setPreferredSize(new java.awt.Dimension(380, 72));
        burbuja1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        noticia.add(burbuja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 390, 75));

        burbuja2.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        burbuja2.setForeground(new java.awt.Color(255, 255, 255));
        burbuja2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        burbuja2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon4.png"))); // NOI18N
        burbuja2.setText("<html><center>Teniendo en cuenta los resultados del semestre 2019-02 los \n" +
            "docentes mas recomendados en la materia de Calculo integral\n" +
            "para ti son.");
        burbuja2.setAlignmentY(5.0F);
        burbuja2.setAutoscrolls(true);
        burbuja2.setIconTextGap(-384);
        burbuja2.setPreferredSize(new java.awt.Dimension(380, 72));
        burbuja2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        noticia.add(burbuja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 390, 75));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setMinimumSize(new java.awt.Dimension(461, 393));

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        noticia.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 460, -1));

        getContentPane().add(noticia, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

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
        chat.add(Btenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        getContentPane().add(chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMouseClicked
        JFrame Opciones = new Opciones();
	Opciones.setVisible(true);
	Opciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        // TODO add your handling code here:
    }//GEN-LAST:event_itemMouseClicked

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
            java.util.logging.Logger.getLogger(GUICopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICopy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btenviar;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Image1;
    private javax.swing.JLabel Image2;
    private javax.swing.JLabel Teacher;
    private javax.swing.JLabel Teacher1;
    private javax.swing.JLabel Teacher2;
    private javax.swing.JLabel Term;
    private javax.swing.JLabel Term1;
    private javax.swing.JLabel Term2;
    private javax.swing.JLabel User;
    private javax.swing.JLabel burbuja;
    private javax.swing.JLabel burbuja1;
    private javax.swing.JLabel burbuja2;
    private javax.swing.JPanel caja;
    private javax.swing.JPanel chat;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondoNot;
    private javax.swing.JPanel item;
    private javax.swing.JPanel item1;
    private javax.swing.JPanel item2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel noticia;
    private javax.swing.JLabel subject;
    private javax.swing.JLabel subject1;
    private javax.swing.JLabel subject2;
    // End of variables declaration//GEN-END:variables
}
