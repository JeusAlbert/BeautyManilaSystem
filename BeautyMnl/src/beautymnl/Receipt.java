/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beautymnl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Nielsen Bernardo
 */
public class Receipt {
    private JFrame frmReceipt;
    
    public static void showWindow() {
		Receipt window = new Receipt();
		window.frmReceipt.setVisible(true);
	}
	
    public static void main(String[] args) {
		Receipt window = new Receipt();
		window.frmReceipt.setVisible(true);
	}
    
    public Receipt(){
            frmReceipt = new JFrame();
            frmReceipt.setTitle("Receipt");
            frmReceipt.setBounds(500, 0, 400, 900);
            frmReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frmReceipt.setLayout(null);
            
            JLabel labRec = new JLabel("Receipt");
            JTextArea txtRec = new JTextArea("\t  Maganda Shopping Cart\n"
                + "\tP. Paredes Sampaloc, Manila\n"
                + "\t Seller Number 1000840239");
            JButton btnPrint = new JButton("Print");
            JButton btnReturn = new JButton("Return");
            
            labRec.setBounds(170, 2 , 100, 50);
            txtRec.setBounds(7,70, 370, 480);
            btnPrint.setBounds(115,570,150, 30);
            btnReturn.setBounds(140,620,100, 30);
            
            frmReceipt.add(labRec);
            frmReceipt.add(txtRec);
            frmReceipt.add(btnPrint);
            frmReceipt.add(btnReturn);
            
            btnPrint.addActionListener(e -> {
 		try {
                    Writer w = new FileWriter("Output.txt");
                    String content = txtRec.getText();  
                    w.write(content);  
                    w.close();  
                    JOptionPane.showMessageDialog(null, "Done");
                }
                catch (IOException ex) {  
                    ex.printStackTrace();  
                }
            });
            
            btnReturn.addActionListener(e ->{
                frmReceipt.dispose();
                Ordering or = new Ordering();
                or.openOrdering();
            });
    }    
        
    
}
