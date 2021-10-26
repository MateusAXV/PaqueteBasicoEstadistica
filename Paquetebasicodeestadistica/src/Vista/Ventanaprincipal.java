/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Ventanas.Lecciones;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.*;
import Ventanas.VentanaAcercade;
import MostrarVentanas.*;
import Ventanas.Datos;
import Ventanas.verificarcorreoprincipal;

/**
 *
 * @author Usuario
 */
public class Ventanaprincipal extends javax.swing.JFrame implements ActionListener {

    private JMenuBar barra;
    private JMenu menu1, menu2, menu3, menu4, menu5;
    private JMenuItem it1, it2, it3, it4,it5, menumoda, menumediana, menumedia;
    VentanaAcercade VE;
    Lecciones LE;
    MostrarModa mm;
    MostrarMedia mme;
    MostrarMediana mmed;
    Datos datos;
    verificarcorreoprincipal vc;
    

    /**
     * Creates new form Ventanaprincipal
     */
    public Ventanaprincipal() {
        initComponents();
        configuracionventana();
        colocarescudo();
        colocarmenu();
    }

    private void configuracionventana() {//ajustes basicos de la ventana
        setSize(400, 400);//Tamaño
        setLocationRelativeTo(null);//que aparezca en el centro
        setResizable(false);//que si puede modificar su tamaño
    }

    private void colocarescudo() {//con este metodo se colocan la imagen de la universidad
        ImageIcon imagen = new ImageIcon("src/imagenes/imagen1.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH));
        jLabel1.setIcon(icono);

    }

    private void colocarmenu() {

        barra = new JMenuBar();
        setJMenuBar(barra);
        //////
        menu1 = new JMenu("Ingresar datos  |");
        it1 = new JMenuItem("Datos");
        it1.addActionListener((ActionListener) this);
        menu1.add(it1);

        /////
        menu2 = new JMenu("Mostrar Datos  |");
        menumoda = new JMenuItem("Moda");
        menumoda.addActionListener((ActionListener) this);
        menumedia = new JMenuItem("Media");
        menumedia.addActionListener((ActionListener) this);
        menumediana = new JMenuItem("Mediana");
        menumediana.addActionListener((ActionListener) this);

        menu2.add(menumoda);
        menu2.add(menumediana);
        menu2.add(menumedia);

        /////
        menu3 = new JMenu("Lecciones  |");
        it2 = new JMenuItem("lecciones");
        it2.addActionListener((ActionListener) this);
        menu3.add(it2);

        /////
        menu4 = new JMenu("Salir  |");
        it3 = new JMenuItem("salir");
        it3.addActionListener((ActionListener) this);
        menu4.add(it3);

        //////
        menu5 = new JMenu("Acerca de");
        it4 = new JMenuItem("acercade");
        it5= new JMenuItem("usuarios registrados");
        it5.addActionListener((ActionListener) this);       

        it4.addActionListener((ActionListener) this);
       
        menu5.add(it4);
         menu5.add(it5);

        ////////
        barra.add(menu1);
        barra.add(menu2);
        barra.add(menu3);
        barra.add(menu4);
        barra.add(menu5);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == it1) {
            datos = new Datos();
            datos.setVisible(true);
            datos.pack();
        }
        if (e.getSource() == menumoda) {
            mm = new MostrarModa();
            mm.setVisible(true);
            mm.pack();
        }
        if (e.getSource() == menumedia) {
            mme = new MostrarMedia();
            mme.setVisible(true);
            mme.pack();
        }
        if (e.getSource() == menumediana) {
            mmed = new MostrarMediana();
            mmed.setVisible(true);
            mmed.pack();
        }
        if (e.getSource() == it2) {
            LE = new Lecciones();
            LE.setVisible(true);

        }
        if (e.getSource() == it3) {
            int i = JOptionPane.showConfirmDialog(null, "Seguro que desea salir");
            if (i == 0) {
                System.exit(0);
            }

        }
        if (e.getSource() == it4) {
            VE = new VentanaAcercade();
            VE.setVisible(true);
            VE.colocartxt("Archivoacercade.txt");
        }
        if(e.getSource()== it5){
            vc= new verificarcorreoprincipal();
            vc.setVisible(true);
            vc.pack();
        }
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paquete Basico De Estadistica");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      //  /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanaprincipal().setVisible(true);
            }
        });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
