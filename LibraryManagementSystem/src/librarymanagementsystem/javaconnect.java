
package librarymanagementsystem;
import java.sql.*;
import javax.swing.JOptionPane;


public class javaconnect {
   Connection connect;
   
   public static Connection connectDb(){
       try{
            Class.forName("org.sqlite.JDBC");
            Connection connect = DriverManager.getConnection("library.sqlite:");
            return connect;
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
   }
    
}
