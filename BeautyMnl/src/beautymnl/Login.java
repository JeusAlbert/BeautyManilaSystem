/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautymnl;

import javax.swing.JFrame;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Login {
    private JFrame frmLgn;
    private JTextField jtxtUsrnm;
    private JPasswordField jtxtPsswrd;
    
    //for calling on other classes
    public static void showWindow() {
            Login window = new Login();
            window.frmLgn.setVisible(true);
	}
    
    //main
    public static void main(String[]args){
            Login window = new Login();
            window.frmLgn.setVisible(true);
            window.frmLgn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        }
    
    
    //constructor
    public Login(){
            //username and password
            String usrnm = "admin";
            String psswrd = "1234";
            
            //layout of the pane
            frmLgn = new JFrame();
            frmLgn.setTitle("Login");
            frmLgn.setBounds(100, 100, 320, 210);
            frmLgn.setLayout(null);
            frmLgn.setLocationRelativeTo(null);
            frmLgn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //label of elements
            JLabel userLab = new JLabel("Username");
            JLabel passLab = new JLabel("Password");
           
            //input
            JTextField usertext = new JTextField();   
            JPasswordField passtext = new JPasswordField();
            
            //Login button
            JButton loginBtn = new JButton("Login");
            JButton closeBtn = new JButton("Close");
            
            //set positioning
            userLab.setBounds(30,30,60,60);
            passLab.setBounds(30,70,60,60);
            usertext.setBounds(90,45, 200, 30);
            passtext.setBounds(90,85, 200, 30);
            loginBtn.setBounds(100, 120, 80, 30);
            closeBtn.setBounds(200, 120, 80, 30);
            
            frmLgn.add(userLab);
            frmLgn.add(passLab);
            frmLgn.add(usertext);
            frmLgn.add(passtext);
            frmLgn.add(loginBtn);
            frmLgn.add(closeBtn);
            
            //button function
            loginBtn.addActionListener(e -> { // login button
						
			String username = usertext.getText();
			@SuppressWarnings("deprecation")
			String password = passtext.getText();       
            if(username.equals(usrnm) && password.equals(psswrd)){
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    
                    frmLgn.dispose(); // to close the login system
                    Ordering mw = new Ordering();
                    mw.openOrdering();
                }
            else{ 
                    JOptionPane.showMessageDialog(null,"Invalid password or username");
                }
                    
                });
            closeBtn.addActionListener(e-> {
                    System.exit(0);
                });
    }      
}
