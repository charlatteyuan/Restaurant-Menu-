/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.util.*;
/**
 *
 * @author derekwu
 */
public class Receipt extends javax.swing.JFrame {
    private ArrayList<String> ordered;
    private ArrayList<String> drink;
    private ArrayList<Double> price;
    private ArrayList<String> toppings;
    private ArrayList<String> sizes;
    /**
     * Creates new form Receipt
     */
    public Receipt() {
        initComponents();
    }
    public Receipt (ArrayList<String> a, ArrayList<String> b, ArrayList<Double> c, ArrayList<String> d, ArrayList<String> e) {
        initComponents();
        ordered = a;
        drink = b;
        price = c;
        sizes = d;
        toppings = e;
        double total = 0.0;
        for(int i = 0; i < ordered.size(); i++){
            if (!ordered.get(i).contains("Small")){
                total += 0.5;
            } 
            if (ordered.get(i).contains("w/")){
                total += 0.5;
            }
            String name = find(ordered.get(i));
            int num = drink.indexOf(name);
            total += price.get(num);
        }
        String print = "";
        for (int i = 0; i<ordered.size(); i++){
            print += (i+1) + ". " + ordered.get(i) + "\n\n";
        }
        Visual.setText(print);
        String str = String.valueOf(total);
        String temp = "";
        if (str.contains(".")){
            temp =  str.substring(str.indexOf("."));
            str = str.substring(0,str.indexOf("."));
        }
        if (temp.length() > 3){
            temp = temp.substring(0,3);
        }
        str += temp;
        Total.setText("$" + str);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Order = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Visual = new javax.swing.JTextArea();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(399, 434));
        setSize(new java.awt.Dimension(399, 450));
        getContentPane().setLayout(null);

        Order.setFont(new java.awt.Font("Kohinoor Bangla", 0, 18)); // NOI18N
        Order.setText("Your Order");
        getContentPane().add(Order);
        Order.setBounds(160, 0, 100, 40);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(0, 420, 100, 30);

        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(Confirm);
        Confirm.setBounds(280, 420, 130, 29);

        jLabel1.setFont(new java.awt.Font("Kohinoor Bangla", 0, 18)); // NOI18N
        jLabel1.setText("Total:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 330, 50, 40);

        Total.setFont(new java.awt.Font("Kohinoor Bangla", 0, 18)); // NOI18N
        getContentPane().add(Total);
        Total.setBounds(270, 330, 70, 40);

        Visual.setColumns(20);
        Visual.setRows(5);
        jScrollPane1.setViewportView(Visual);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 30, 290, 290);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/paperrot.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 417, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        setVisible(false);
        new MenuFrame(toppings, drink, price, sizes).setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }
    public String find (String a){
        int num;
        if (a.contains("|")){
            num = a.indexOf("|");
            a = a.substring(num + 1);
        }
        if (a.contains("|")){
            num = a.indexOf("|");
            a = a.substring(0,num);
        }
        return a;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel Order;
    private javax.swing.JLabel Total;
    private javax.swing.JTextArea Visual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
