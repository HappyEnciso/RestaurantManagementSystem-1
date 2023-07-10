package RestaurantManagementSystem;

import java.awt.event.*;
import javax.swing.*;

public class HomePage extends JFrame implements ActionListener{
//    private ImageIcon bgIcon;
//    private JLabel myLabel; 
    private JLabel logoLbl;
    private JButton takeorderBtn, reportsButton;
    
    public HomePage(){
//        bgIcon = new ImageIcon(this.getClass().getResource("C:/Users/Nico/Desktop/img/Background.jpg"));
//        myLabel = new JLabel(bgIcon);
//        myLabel.setSize(800, 650);
//        add(myLabel);
        
        setTitle("Home Page");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        
        logoLbl = new JLabel("Logo");
        logoLbl.setBounds(420, 120, 100, 50);
        
        takeorderBtn = new JButton ("TAKE ORDERS");
        takeorderBtn.setBounds(370, 180, 130, 20);
        takeorderBtn.addActionListener(this);
        
        reportsButton = new JButton ("REPORTS");
        reportsButton.setBounds(370, 210, 130, 20);
        reportsButton.addActionListener(this);
        
        add(logoLbl);
        add(takeorderBtn);
        add(reportsButton);
    }
    
    @Override
    public void actionPerformed(ActionEvent clicked){
        if(clicked.getSource() == reportsButton){
            dispose();
            new CusinaryReports();
        }
    }
}
