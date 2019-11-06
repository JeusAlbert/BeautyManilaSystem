/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautymnl;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nielsen Bernardo
 */
public class Ordering {
    JFrame OrdrSystm;
    
    //for calling on other classes
    public static void openOrdering() {
		Ordering window = new Ordering();
		window.OrdrSystm.setVisible(true);
	}
    //main method
    public static void main (String[] args) {
		Ordering window = new Ordering();
		window.OrdrSystm.setVisible(true);
	}
    //constructor
    public Ordering(){
            
            run();
    }
    
    
    //run ordersystem
    public void run(){
        OrdrSystm = new JFrame();
        OrdrSystm.setTitle("Ordering System");
        OrdrSystm.setBounds(250, 100, 900, 550);
        OrdrSystm.setLayout(null);
	OrdrSystm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // automatic close when different frame
	OrdrSystm.setLocationRelativeTo(null);
	OrdrSystm.setResizable(false);
        
        JButton btnPrint = new JButton("Print Receipt");
        JButton btnLgout = new JButton("Logout");
        
        btnPrint.setBounds(600, 450, 120,40);
        btnLgout.setBounds(740, 450, 120,40);
        
        OrdrSystm.add(btnPrint);
        OrdrSystm.add(btnLgout);
        
        btnPrint.addActionListener(e-> {
            OrdrSystm.dispose(); // to close the login system
            Receipt rc = new Receipt();
            rc.showWindow(); 
        });
        
        btnLgout.addActionListener(e-> {
            JOptionPane.showMessageDialog(null, "Logout Successful");
            OrdrSystm.dispose(); // to close the login system
            Login ln = new Login();
            ln.showWindow(); 
        });
        
    }
}
