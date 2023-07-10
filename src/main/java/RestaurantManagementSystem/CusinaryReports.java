package RestaurantManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CusinaryReports extends JFrame implements ActionListener{
    private JLabel reportsLbl;
    private JButton homeBtn, inventoryBtn, salesBtn, wasteBtn;
    
    CusinaryReports(){
        setTitle("Cusinary Reports");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        
        reportsLbl = new JLabel("Cusinary Reports");
        reportsLbl.setBounds(390, 120, 100, 50);
        
        homeBtn = new JButton ("HOME");
        homeBtn.setBounds(50, 90, 100, 20);
        homeBtn.addActionListener(this);
        
        inventoryBtn = new JButton ("INVENTORY");
        inventoryBtn.setBounds(370, 180, 130, 20);
        inventoryBtn.addActionListener(this);
        
        salesBtn = new JButton ("SALES");
        salesBtn.setBounds(370, 210, 130, 20);
        salesBtn.addActionListener(this);
        
        wasteBtn = new JButton ("FOOD WASTE");
        wasteBtn.setBounds(370, 240, 130, 20);
        wasteBtn.addActionListener(this);
        
        add(reportsLbl);
        add(homeBtn);
        add(inventoryBtn);
        add(salesBtn);
        add(wasteBtn);
        
    }
    @Override
    public void actionPerformed(ActionEvent clicked) {
        if(clicked.getSource() == homeBtn){
            dispose();
            new HomePage();
        }
        else if(clicked.getSource() == inventoryBtn){
            dispose();
            new CusinaryInventory();
        }
        else if(clicked.getSource() == salesBtn){
            dispose();
            new CusinarySales();
        }
        else if(clicked.getSource() == wasteBtn){
            dispose();
            new CusinaryFoodWaste();
        }
    }
}
