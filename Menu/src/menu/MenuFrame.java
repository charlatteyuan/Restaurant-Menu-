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
public class MenuFrame extends javax.swing.JFrame {
    private ArrayList<String> toppings;
    private ArrayList<String> drinks;
    private ArrayList<Double> prices;
    private ArrayList<String> sizes;
    private ArrayList<String> specs;
    private ArrayList<String> ordered;
    /**
     * Creates new form MenuFrame
     */
    public MenuFrame() {
        initComponents();
    }
    public MenuFrame(ArrayList<String> a, ArrayList<String> b, ArrayList<Double> c, ArrayList<String> d) {
        initComponents();
        specs = new ArrayList<String> ();
        ordered = new ArrayList<String> ();
        specs.add("0%");
        specs.add("30%");
        specs.add("50%");
        specs.add("80%");
        specs.add("Standard");
        toppings = a;
        drinks = b;
        prices = c;
        sizes = d;
        String [] jesus = drinkString();
        ToppingsCombo.setModel(new javax.swing.DefaultComboBoxModel(toStringArray(toppings)));
        SizeCombo.setModel(new javax.swing.DefaultComboBoxModel(toStringArray(sizes)));
        if (jesus.length > 32){
            ItemsListOne.setModel(new javax.swing.DefaultComboBoxModel(result(jesus,0,32)));
            ItemsListTwo.setModel(new javax.swing.DefaultComboBoxModel(result(jesus,32,jesus.length)));
        } else {
            ItemsListOne.setModel(new javax.swing.DefaultComboBoxModel(jesus));
        }
        toppingsprice.setText("$" + String.valueOf(prices.get(prices.size() - 1)));
        sizeprice.setText("$" + String.valueOf(prices.get(prices.size() - 2)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tea = new javax.swing.JLabel();
        Toppings = new javax.swing.JLabel();
        ToppingsCombo = new javax.swing.JComboBox<>();
        SizeLabel = new javax.swing.JLabel();
        SizeCombo = new javax.swing.JComboBox<>();
        toppingsprice = new javax.swing.JLabel();
        sizeprice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RemoveLabel = new javax.swing.JLabel();
        Remove = new javax.swing.JButton();
        GetRemoved = new javax.swing.JTextField();
        AddDrink = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        OrderConsole = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ItemsListTwo = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsListOne = new javax.swing.JList<>();
        Clear = new javax.swing.JButton();
        Done = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1013, 760));
        getContentPane().setLayout(null);

        Tea.setFont(new java.awt.Font("Kohinoor Bangla", 0, 48)); // NOI18N
        Tea.setForeground(new java.awt.Color(31, 194, 188));
        Tea.setText("ICE CREAM");
        getContentPane().add(Tea);
        Tea.setBounds(80, 40, 260, 110);

        Toppings.setBackground(new java.awt.Color(0, 0, 0));
        Toppings.setFont(new java.awt.Font("Kohinoor Bangla", 0, 18)); // NOI18N
        Toppings.setForeground(new java.awt.Color(31, 194, 188));
        Toppings.setText("TOPPINGS");
        getContentPane().add(Toppings);
        Toppings.setBounds(70, 600, 80, 30);

        ToppingsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToppingsComboActionPerformed(evt);
            }
        });
        getContentPane().add(ToppingsCombo);
        ToppingsCombo.setBounds(70, 630, 140, 27);

        SizeLabel.setFont(new java.awt.Font("Kohinoor Bangla", 0, 18)); // NOI18N
        SizeLabel.setForeground(new java.awt.Color(31, 194, 188));
        SizeLabel.setText("SIZE");
        getContentPane().add(SizeLabel);
        SizeLabel.setBounds(70, 670, 40, 20);

        getContentPane().add(SizeCombo);
        SizeCombo.setBounds(70, 690, 140, 27);

        toppingsprice.setFont(new java.awt.Font("Kohinoor Bangla", 0, 18)); // NOI18N
        toppingsprice.setForeground(new java.awt.Color(31, 194, 188));
        getContentPane().add(toppingsprice);
        toppingsprice.setBounds(160, 600, 50, 0);

        sizeprice.setFont(new java.awt.Font("Kohinoor Bangla", 0, 18)); // NOI18N
        sizeprice.setForeground(new java.awt.Color(31, 194, 188));
        getContentPane().add(sizeprice);
        sizeprice.setBounds(110, 670, 50, 20);

        jLabel1.setFont(new java.awt.Font("Kohinoor Bangla", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 194, 188));
        jLabel1.setText("Dessert Ordered (ex. ): ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(650, 400, 330, 30);

        RemoveLabel.setFont(new java.awt.Font("Kohinoor Bangla", 0, 13)); // NOI18N
        RemoveLabel.setForeground(new java.awt.Color(31, 194, 188));
        RemoveLabel.setText("Remove Dessert #: ");
        getContentPane().add(RemoveLabel);
        RemoveLabel.setBounds(650, 590, 110, 20);

        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        getContentPane().add(Remove);
        Remove.setBounds(750, 610, 210, 29);

        GetRemoved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetRemovedActionPerformed(evt);
            }
        });
        getContentPane().add(GetRemoved);
        GetRemoved.setBounds(650, 610, 100, 30);

        AddDrink.setText("Add Dessert");
        AddDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDrinkActionPerformed(evt);
            }
        });
        getContentPane().add(AddDrink);
        AddDrink.setBounds(650, 540, 310, 50);

        OrderConsole.setColumns(20);
        OrderConsole.setRows(5);
        jScrollPane3.setViewportView(OrderConsole);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(650, 430, 310, 110);

        ItemsListTwo.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        ItemsListTwo.setForeground(new java.awt.Color(31, 194, 188));
        ItemsListTwo.setSelectionBackground(new java.awt.Color(230, 230, 230));
        ItemsListTwo.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(ItemsListTwo);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(650, 170, 310, 230);

        ItemsListOne.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        ItemsListOne.setForeground(new java.awt.Color(31, 194, 188));
        ItemsListOne.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ItemsListOne.setToolTipText("");
        ItemsListOne.setDoubleBuffered(true);
        ItemsListOne.setSelectionBackground(new java.awt.Color(230, 230, 230));
        ItemsListOne.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(ItemsListOne);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 170, 310, 490);

        Clear.setText("Clear Dessert Selection");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear);
        Clear.setBounds(320, 660, 330, 29);

        Done.setText("Done");
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        getContentPane().add(Done);
        Done.setBounds(720, 660, 180, 50);

        Background.setFont(new java.awt.Font("Kohinoor Bangla", 0, 13)); // NOI18N
        Background.setForeground(new java.awt.Color(31, 194, 188));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/Menu Frame 2.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(-6, -10, 1030, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToppingsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToppingsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToppingsComboActionPerformed

    private void AddDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDrinkActionPerformed
        int a = IceSlider.getValue();
        int b = SugarSlider.getValue();
        Object top = ToppingsCombo.getSelectedItem();
        Object sze = SizeCombo.getSelectedItem();
        String tea = "";
        if (ItemsListOne.getSelectedValue() == null){
            tea = ItemsListTwo.getSelectedValue();
        } else {
            tea = ItemsListOne.getSelectedValue();
        }
        if (ObjToStr(top) == ""){
            ordered.add(ObjToStr(sze) + " |" + name(tea) + "| [" + specs.get(a) + "/" + specs.get(b)+"]");
        } else {
            ordered.add(ObjToStr(sze) + " |" + name(tea) + "| " +"w/ " + ObjToStr(top) + " [" + specs.get(a) + "/" + specs.get(b)+"]");
        }
        String print = "";
        for (int i = 0; i < ordered.size(); i ++){
            print += (i+1) + ". " + ordered.get(i) + "\n";
        }
        OrderConsole.setText(print);
    }//GEN-LAST:event_AddDrinkActionPerformed

    private void GetRemovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetRemovedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetRemovedActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        int num = Integer.parseInt(GetRemoved.getText());
        ordered.remove(num-1);
        String print = "";
        for (int i = 0; i < ordered.size() ; i++) {
            print += (i + 1) + ". " + ordered.get(i) + "\n";
        }
        OrderConsole.setText(print);
    }//GEN-LAST:event_RemoveActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        ItemsListOne.clearSelection();
        ItemsListTwo.clearSelection();
    }//GEN-LAST:event_ClearActionPerformed

    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        setVisible(false);
        new Receipt(ordered, drinks, prices, sizes, toppings).setVisible(true);
    }//GEN-LAST:event_DoneActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame().setVisible(true);
            }
        });
    }
    public String[] toStringArray(ArrayList<String> a) {
        String [] second = new String[a.size()];
        for (int i = 0; i < a.size() ; i++){
            second[i] = a.get(i);
        }
        return second;
    }
    public String[] drinkString () {
        ArrayList<String> total = new ArrayList<String> ();
        for (int i = 0; i < drinks.size(); i++){
            total.add(drinks.get(i) + countSpaces(drinks.get(i), String.valueOf(prices.get(i)) ) + prices.get(i));
        }
        return toStringArray(total);
    }
    public String countSpaces(String a, String b) {
        int num = 43 - (a.length() + b.length());
        String c = "";
        for (int i = 0; i< num; i++) {
            c += " ";
        }
        return c;
    }
    public String ObjToStr (Object a) {
        String str = "";
        if (a.toString().equals("none")) {
            return str;
        } else if (a != null){
            str = a.toString();
            return str;
        }  else {
            return str;
        }
    }
    public String name (String a){
        int count = 0;
        boolean flag = false;
        while (flag == false){
            if (a.charAt(count) == 32 && a.charAt(count +1) == 32){
               flag = true;
            } else {
                count ++;
            }
        }
        String b = a.substring(0,count);
        return b;
    }
    public String [] result (String [] a, int start, int end){
        String [] jesus = new String[end - start];
        int counter = start;
        for (int i = 0; i < jesus.length; i++){
            jesus[i] = a[counter];
            counter++;
        }
        return jesus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDrink;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Done;
    private javax.swing.JTextField GetRemoved;
    private javax.swing.JList<String> ItemsListOne;
    private javax.swing.JList<String> ItemsListTwo;
    private javax.swing.JTextArea OrderConsole;
    private javax.swing.JButton Remove;
    private javax.swing.JLabel RemoveLabel;
    private javax.swing.JComboBox<String> SizeCombo;
    private javax.swing.JLabel SizeLabel;
    private javax.swing.JLabel Tea;
    private javax.swing.JLabel Toppings;
    private javax.swing.JComboBox<String> ToppingsCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel sizeprice;
    private javax.swing.JLabel toppingsprice;
    // End of variables declaration//GEN-END:variables
}