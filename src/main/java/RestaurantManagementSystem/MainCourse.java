package RestaurantManagementSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainCourse extends JFrame implements ActionListener{
    private ImageIcon bgImage, homeImage;
    private JLabel bgLbl, quantityLbl, priceLbl, summaryLbl, itemLbl;
    private JButton homeBtn, addBtn, minusBtn, wasteBtn;
    private JComboBox menuCbox;
    private JTextField priceFld;
            
    MainCourse(){
        setTitle("Main Course");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 650);
        setVisible(true);

        bgImage  = new ImageIcon("C:\\Users\\Nico\\Desktop\\img\\ResizedBG.jpg");
        bgLbl = new JLabel(bgImage);
        
        homeImage = new ImageIcon("C:\\Users\\Nico\\Desktop\\img\\Home.png");
        homeBtn = new JButton (homeImage);
        homeBtn.setBounds(50, 50, homeImage.getIconWidth(), homeImage.getIconHeight());
        homeBtn.setContentAreaFilled(false);
        homeBtn.setOpaque(false);
        homeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homeBtn.addActionListener(this);
        bgLbl.add(homeBtn);
        
        String[] choice = {"Main Course", "Appetizers", "Salad", "Dessert", "Drinks"};
        menuCbox = new JComboBox(choice);
        menuCbox.setBounds(50, 110, 100, 20);
        menuCbox.setOpaque(true);
        menuCbox.setForeground(Color.BLACK);
        menuCbox.setBackground(Color.WHITE);
        menuCbox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        menuCbox.addActionListener(this);
        menuCbox.addActionListener(this);
        bgLbl.add(menuCbox);
        
        itemLbl = new JLabel("Grilled Roast Beef");
        itemLbl.setBounds(50, 150, 250, 20);
        bgLbl.add(itemLbl);
        
        addBtn = new JButton("+");
        addBtn.setBounds(250, 150, 50, 20);
        addBtn.setContentAreaFilled(false);
        addBtn.setFocusPainted(false);
        addBtn.setOpaque(true);
        addBtn.setForeground(Color.BLACK);
        addBtn.setBackground(Color.WHITE);
        addBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(addBtn);
        addBtn.addActionListener(this);
        
        minusBtn = new JButton("-");
        minusBtn.setBounds(320, 150, 50, 20);
        minusBtn.setContentAreaFilled(false);
        minusBtn.setFocusPainted(false);
        minusBtn.setOpaque(true);
        minusBtn.setForeground(Color.BLACK);
        minusBtn.setBackground(Color.WHITE);
        minusBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(minusBtn);
        minusBtn.addActionListener(this);
        
        priceFld = new JTextField("0");
        priceFld.setBounds(400, 150, 50, 20);
        bgLbl.add(priceFld);
        priceFld.setEditable(false);
        
        priceLbl = new JLabel("P2000.00");
        priceLbl.setBounds(500, 150, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Seafood Pack");
        itemLbl.setBounds(50, 180, 250, 20);
        bgLbl.add(itemLbl);
        
        addBtn = new JButton("+");
        addBtn.setBounds(250, 180, 50, 20);
        addBtn.setContentAreaFilled(false);
        addBtn.setFocusPainted(false);
        addBtn.setOpaque(true);
        addBtn.setForeground(Color.BLACK);
        addBtn.setBackground(Color.WHITE);
        addBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(addBtn);
        addBtn.addActionListener(this);
        
        minusBtn = new JButton("-");
        minusBtn.setBounds(320, 180, 50, 20);
        minusBtn.setContentAreaFilled(false);
        minusBtn.setFocusPainted(false);
        minusBtn.setOpaque(true);
        minusBtn.setForeground(Color.BLACK);
        minusBtn.setBackground(Color.WHITE);
        minusBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(minusBtn);
        minusBtn.addActionListener(this);
        
        priceFld = new JTextField("0");
        priceFld.setBounds(400, 180, 50, 20);
        bgLbl.add(priceFld);
        priceFld.setEditable(false);
        
        priceLbl = new JLabel("P1580.00");
        priceLbl.setBounds(500, 180, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Spicy Pork Rim");
        itemLbl.setBounds(50, 210, 250, 20);
        bgLbl.add(itemLbl);
        
        addBtn = new JButton("+");
        addBtn.setBounds(250, 210, 50, 20);
        addBtn.setContentAreaFilled(false);
        addBtn.setFocusPainted(false);
        addBtn.setOpaque(true);
        addBtn.setForeground(Color.BLACK);
        addBtn.setBackground(Color.WHITE);
        addBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(addBtn);
        addBtn.addActionListener(this);
        
        minusBtn = new JButton("-");
        minusBtn.setBounds(320, 210, 50, 20);
        minusBtn.setContentAreaFilled(false);
        minusBtn.setFocusPainted(false);
        minusBtn.setOpaque(true);
        minusBtn.setForeground(Color.BLACK);
        minusBtn.setBackground(Color.WHITE);
        minusBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(minusBtn);
        minusBtn.addActionListener(this);
        
        priceFld = new JTextField("0");
        priceFld.setBounds(400, 210, 50, 20);
        bgLbl.add(priceFld);
        priceFld.setEditable(false);
        
        priceLbl = new JLabel("P1330.00");
        priceLbl.setBounds(500, 210, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Baked Fish with Chili Sauce");
        itemLbl.setBounds(50, 240, 250, 20);
        bgLbl.add(itemLbl);
        
        addBtn = new JButton("+");
        addBtn.setBounds(250, 240, 50, 20);
        addBtn.setContentAreaFilled(false);
        addBtn.setFocusPainted(false);
        addBtn.setOpaque(true);
        addBtn.setForeground(Color.BLACK);
        addBtn.setBackground(Color.WHITE);
        addBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(addBtn);
        addBtn.addActionListener(this);
        
        minusBtn = new JButton("-");
        minusBtn.setBounds(320, 240, 50, 20);
        minusBtn.setContentAreaFilled(false);
        minusBtn.setFocusPainted(false);
        minusBtn.setOpaque(true);
        minusBtn.setForeground(Color.BLACK);
        minusBtn.setBackground(Color.WHITE);
        minusBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(minusBtn);
        minusBtn.addActionListener(this);
        
        priceFld = new JTextField("0");
        priceFld.setBounds(400, 240, 50, 20);
        bgLbl.add(priceFld);
        priceFld.setEditable(false);
        
        priceLbl = new JLabel("P700.00");
        priceLbl.setBounds(500, 240, 100, 20);
        bgLbl.add(priceLbl);
        
        itemLbl = new JLabel("Buttered Shrimp Bucket");
        itemLbl.setBounds(50, 270, 250, 20);
        bgLbl.add(itemLbl);
        
        addBtn = new JButton("+");
        addBtn.setBounds(250, 270, 50, 20);
        addBtn.setContentAreaFilled(false);
        addBtn.setFocusPainted(false);
        addBtn.setOpaque(true);
        addBtn.setForeground(Color.BLACK);
        addBtn.setBackground(Color.WHITE);
        addBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(addBtn);
        addBtn.addActionListener(this);
        
        minusBtn = new JButton("-");
        minusBtn.setBounds(320, 270, 50, 20);
        minusBtn.setContentAreaFilled(false);
        minusBtn.setFocusPainted(false);
        minusBtn.setOpaque(true);
        minusBtn.setForeground(Color.BLACK);
        minusBtn.setBackground(Color.WHITE);
        minusBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bgLbl.add(minusBtn);
        minusBtn.addActionListener(this);
        
        priceFld = new JTextField("0");
        priceFld.setBounds(400, 270, 50, 20);
        bgLbl.add(priceFld);
        priceFld.setEditable(false);
        
        priceLbl = new JLabel("P1650.00");
        priceLbl.setBounds(500, 270, 100, 20);
        bgLbl.add(priceLbl);
        
        quantityLbl= new JLabel("Quantity");
        quantityLbl.setBounds(400, 110, 100, 20);
        bgLbl.add(quantityLbl);
        
        priceLbl = new JLabel("Price");
        priceLbl.setBounds(500, 110, 100, 20);
        bgLbl.add(priceLbl);
        
        add(bgLbl);
    }
    @Override
    public void actionPerformed(ActionEvent clicked) {
        if(clicked.getSource() == homeBtn){
            dispose();
            new HomePage();
        }
        else if (clicked.getSource() == menuCbox) {
            String selectedReport = (String) menuCbox.getSelectedItem();
            switch (selectedReport) {
                case "Main Course":
                    new MainCourse();
                    break;
                case "Appetizers":
                    new Appetizers();
                    break;
                case "Salad":
                    new Salad();
                    break;
                case "Dessert":
                    new Dessert();
                    break;
                case "Drinks":
                    new Drinks();
                    break;
                default:
                    break;
            }
        }
    }
}
