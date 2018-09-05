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
public class SitDownGenerator extends javax.swing.JFrame {
    private ArrayList<String> drinks;
    private ArrayList<Double> prices;
    private String currN;
    private Double currP;
    private String list;
    /**
     * Creates new form MilkTeaGenerator
     */
    public SitDownGenerator() {
        drinks = new ArrayList<String> ();
        prices = new ArrayList<Double> ();
        list = "Items: ";
        currN = "";
        currP = 0.0;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name = new javax.swing.JTextField();
        LDrink = new javax.swing.JLabel();
        LPrice = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Price1 = new javax.swing.JTextField();
        Name1 = new javax.swing.JTextField();
        LPrice1 = new javax.swing.JLabel();
        LDrink1 = new javax.swing.JLabel();
        LDrink2 = new javax.swing.JLabel();
        Price2 = new javax.swing.JTextField();
        Name2 = new javax.swing.JTextField();
        LPrice2 = new javax.swing.JLabel();
        Finished = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Scroll = new javax.swing.JScrollPane();
        DisplayList = new javax.swing.JTextArea();
        Number = new javax.swing.JFormattedTextField();
        NumOfAdded = new javax.swing.JLabel();
        Remove = new javax.swing.JLabel();
        NumOfItem = new javax.swing.JTextField();
        RemoveIndex = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 504));
        getContentPane().setLayout(null);
        getContentPane().add(Name);
        Name.setBounds(280, 190, 170, 30);

        LDrink.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        LDrink.setForeground(new java.awt.Color(250, 250, 250));
        LDrink.setText("Name of Food");
        getContentPane().add(LDrink);
        LDrink.setBounds(280, 170, 150, 20);

        LPrice.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        LPrice.setForeground(new java.awt.Color(250, 250, 250));
        LPrice.setText("Price of Food");
        getContentPane().add(LPrice);
        LPrice.setBounds(280, 240, 90, 20);
        getContentPane().add(Price);
        Price.setBounds(280, 260, 110, 26);

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add);
        Add.setBounds(190, 310, 80, 29);
        getContentPane().add(Price1);
        Price1.setBounds(30, 260, 110, 26);
        getContentPane().add(Name1);
        Name1.setBounds(30, 190, 170, 30);

        LPrice1.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        LPrice1.setForeground(new java.awt.Color(250, 250, 250));
        LPrice1.setText("Price of Food");
        getContentPane().add(LPrice1);
        LPrice1.setBounds(30, 240, 90, 20);

        LDrink1.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        LDrink1.setForeground(new java.awt.Color(250, 250, 250));
        LDrink1.setText("Name of Appetizer");
        getContentPane().add(LDrink1);
        LDrink1.setBounds(30, 170, 150, 20);

        LDrink2.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        LDrink2.setForeground(new java.awt.Color(250, 250, 250));
        LDrink2.setText("Name of Dessert");
        getContentPane().add(LDrink2);
        LDrink2.setBounds(480, 170, 150, 20);
        getContentPane().add(Price2);
        Price2.setBounds(480, 260, 110, 26);
        getContentPane().add(Name2);
        Name2.setBounds(480, 190, 170, 30);

        LPrice2.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        LPrice2.setForeground(new java.awt.Color(250, 250, 250));
        LPrice2.setText("Price of Food");
        getContentPane().add(LPrice2);
        LPrice2.setBounds(480, 240, 90, 20);

        Finished.setText("Finished");
        Finished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishedActionPerformed(evt);
            }
        });
        getContentPane().add(Finished);
        Finished.setBounds(600, 460, 97, 29);

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(10, 450, 75, 29);

        DisplayList.setColumns(20);
        DisplayList.setRows(5);
        Scroll.setViewportView(DisplayList);

        getContentPane().add(Scroll);
        Scroll.setBounds(440, 10, 244, 140);
        getContentPane().add(Number);
        Number.setBounds(390, 10, 40, 30);

        NumOfAdded.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        NumOfAdded.setForeground(new java.awt.Color(250, 250, 250));
        NumOfAdded.setText("Number of Items Added");
        getContentPane().add(NumOfAdded);
        NumOfAdded.setBounds(240, 20, 150, 16);

        Remove.setFont(new java.awt.Font("Kohinoor Bangla", 1, 13)); // NOI18N
        Remove.setForeground(new java.awt.Color(250, 250, 250));
        Remove.setText("Remove Item #: ");
        getContentPane().add(Remove);
        Remove.setBounds(190, 360, 110, 20);
        getContentPane().add(NumOfItem);
        NumOfItem.setBounds(190, 380, 80, 26);

        RemoveIndex.setText("Remove");
        RemoveIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveIndexActionPerformed(evt);
            }
        });
        getContentPane().add(RemoveIndex);
        RemoveIndex.setBounds(190, 410, 80, 29);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/SitBack.jpg")));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 700, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        currN = Name.getText();
        currP = Double.parseDouble(Price.getText());
        drinks.add(currN);
        prices.add(currP);
        Name.setText("");
        Price.setText("");
        Number.setText(Integer.toString(drinks.size()));
        int i = drinks.size() - 1;
        list += "\n" + (i+1) + ". "+ drinks.get(i) + " (" + prices.get(i) + ")";
        DisplayList.setText(list);
        currN = Name1.getText();
        currP = Double.parseDouble(Price1.getText());
        drinks.add(currN);
        prices.add(currP);
        Name1.setText("");
        Price1.setText("");
        Number.setText(Integer.toString(drinks.size()));
        i = drinks.size() - 1;
        list += "\n" + (i+1) + ". "+ drinks.get(i) + " (" + prices.get(i) + ")";
        DisplayList.setText(list);
        currN = Name2.getText();
        currP = Double.parseDouble(Price2.getText());
        drinks.add(currN);
        prices.add(currP);
        Name2.setText("");
        Price2.setText("");
        Number.setText(Integer.toString(drinks.size()));
        i = drinks.size() - 1;
        list += "\n" + (i+1) + ". "+ drinks.get(i) + " (" + prices.get(i) + ")";
        DisplayList.setText(list);
    }//GEN-LAST:event_AddActionPerformed

    private void FinishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishedActionPerformed
        setVisible(false);
        new MTMenuSpecifications(drinks,prices).setVisible(true);
    }//GEN-LAST:event_FinishedActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        setVisible(false);
        new MenuGenerator3().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void RemoveIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveIndexActionPerformed
        int num = Integer.parseInt(NumOfItem.getText());
        prices.remove(num-1);
        drinks.remove(num - 1);
        list = "Items: ";
        for (int i = 0; i < prices.size(); i++) {
            list += "\n" + (i+1) + ". " + drinks.get(i) + " (" + prices.get(i) + ")";
        }
        DisplayList.setText(list);
        Number.setText(Integer.toString(drinks.size()));
        NumOfItem.setText("");
    }//GEN-LAST:event_RemoveIndexActionPerformed

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
            java.util.logging.Logger.getLogger(SitDownGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SitDownGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SitDownGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SitDownGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SitDownGenerator().setVisible(true);
            }
        });
    }
    public ArrayList<Double> getPrices () {
        return prices;
    }
    public ArrayList<String> getNames(){
        return drinks;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Background;
    private javax.swing.JTextArea DisplayList;
    private javax.swing.JButton Finished;
    private javax.swing.JLabel LDrink;
    private javax.swing.JLabel LDrink1;
    private javax.swing.JLabel LDrink2;
    private javax.swing.JLabel LPrice;
    private javax.swing.JLabel LPrice1;
    private javax.swing.JLabel LPrice2;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Name1;
    private javax.swing.JTextField Name2;
    private javax.swing.JLabel NumOfAdded;
    private javax.swing.JTextField NumOfItem;
    private javax.swing.JFormattedTextField Number;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Price1;
    private javax.swing.JTextField Price2;
    private javax.swing.JLabel Remove;
    private javax.swing.JButton RemoveIndex;
    private javax.swing.JScrollPane Scroll;
    // End of variables declaration//GEN-END:variables
}
