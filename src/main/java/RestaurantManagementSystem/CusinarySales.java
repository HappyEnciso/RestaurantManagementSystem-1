package RestaurantManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CusinarySales extends JFrame implements ActionListener{
    private JLabel inventoryLbl;
    private JButton homeBtn;
    private JComboBox reportsCbox;
    private JTextArea monthAr, inventoryAr;
    
    CusinarySales(){
        setTitle("Cusinary Sales");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        
        inventoryLbl = new JLabel("Cusinary Sales");
        inventoryLbl.setBounds(400, 120, 120, 50);
        
        homeBtn = new JButton ("HOME");
        homeBtn.setBounds(50, 90, 100, 20);
        homeBtn.addActionListener(this);
        
        String[] choice = {"Inventory", "Sales", "Waste"};
        reportsCbox = new JComboBox(choice);
        reportsCbox.setBounds(50, 120, 100, 20);
        reportsCbox.addActionListener(this);
        
        monthAr = new JTextArea ("Month");
        monthAr.setBounds(50, 180, 100, 300);
        monthAr.setEditable(false);
        
        inventoryAr = new JTextArea ("Sales (tabular)");
        inventoryAr.setBounds(175, 180, 600, 300);
        inventoryAr.setEditable(false);
        
        add(inventoryLbl);
        add(homeBtn);
        add(reportsCbox);
        add(monthAr);
        add(inventoryAr);
    }
    @Override
    public void actionPerformed(ActionEvent clicked) {
        if(clicked.getSource() == homeBtn){
            dispose();
            new HomePage();
        }
        else if (clicked.getSource() == reportsCbox) {
            String selectedReport = (String) reportsCbox.getSelectedItem();
            switch (selectedReport) {
                case "Inventory":
                    new CusinaryInventory();
                    break;
                case "Sales":
                    new CusinarySales();
                    break;
                case "Waste":
                    new CusinaryFoodWaste();
                    break;
                default:
                    break;
            }
        }
    }
}
