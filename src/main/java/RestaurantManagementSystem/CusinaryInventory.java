package RestaurantManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CusinaryInventory extends JFrame implements ActionListener{
    private ImageIcon bgImage, homeImage;
    private JLabel bgLbl, inventoryLbl;
    private JButton homeBtn;
    private JComboBox reportsCbox;
    private JTextArea monthAr, inventoryAr;
    
    CusinaryInventory(){
        setTitle("Cusinary Inventory");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 650);
        setVisible(true);

        bgImage  = new ImageIcon("C:\\Users\\Nico\\Desktop\\img\\ResizedBG.jpg");
        bgLbl = new JLabel(bgImage);
        
        inventoryLbl = new JLabel("Cusinary Inventory");
        inventoryLbl.setBounds(390, 120, 120, 50);
        bgLbl.add(inventoryLbl);
        
        homeImage = new ImageIcon("C:\\Users\\Nico\\Desktop\\img\\Home.png");
        homeBtn = new JButton (homeImage);
        homeBtn.setBounds(50, 90, homeImage.getIconWidth(), homeImage.getIconHeight());
        homeBtn.setContentAreaFilled(false);
        homeBtn.setOpaque(false);
        homeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homeBtn.addActionListener(this);
        bgLbl.add(homeBtn);
        
        String[] choice = {"Inventory", "Sales", "Waste"};
        reportsCbox = new JComboBox(choice);
        reportsCbox.setBounds(50, 150, 100, 20);
        reportsCbox.setOpaque(true);
        reportsCbox.setForeground(Color.BLACK);
        reportsCbox.setBackground(Color.WHITE);
        reportsCbox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        reportsCbox.addActionListener(this);
        reportsCbox.addActionListener(this);
        bgLbl.add(reportsCbox);
        
        monthAr = new JTextArea ("Month");
        monthAr.setBounds(50, 180, 100, 300);
        monthAr.setEditable(false);
        monthAr.setOpaque(false);
        bgLbl.add(monthAr);
        
        inventoryAr = new JTextArea ("Inventory (tabular)");
        inventoryAr.setBounds(175, 180, 600, 300);
        inventoryAr.setEditable(false);
        inventoryAr.setOpaque(false);
        bgLbl.add(inventoryAr);
        
        add(bgLbl);
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
                    CuisinaryFoodWaste foodwaste = new CuisinaryFoodWaste();
                    foodwaste.setVisible(true);
                    break;
                default:
                    break;
            }
        }
    }
}
