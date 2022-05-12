
package poe.assignment;


import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class POEAssignment {
    
 
    
public static void main(String[] args) {
    
    
   Login login = new Login();
   
 String firstName = JOptionPane.showInputDialog( "Please enter your fisrt name:");
 String surname = JOptionPane.showInputDialog( "Please enter your surname:");
 String username = JOptionPane.showInputDialog( "Please Create a username: ") ;
 String Password = JOptionPane.showInputDialog( "Please create a password: ");
    
    
   
    createAccount name1 = new  createAccount();
    
 
        login.registerUser(username, Password, firstName, surname);
        
        
        String usernameLogin = JOptionPane.showInputDialog("Enter your username"),
                PasswordLogin = JOptionPane.showInputDialog("Enter your password");
        
        
        boolean loginStatus = login.loginUser(usernameLogin, PasswordLogin);
        
        
        
        
         
         
        
        }  
        }  
    
    


    
      class Welcome extends JFrame  
{  
    //constructor  
    Welcome()  
    {  
        setDefaultCloseOperation(javax.swing.  
        WindowConstants.DISPOSE_ON_CLOSE);  
        setTitle("Welcome");  
        setSize(400, 200);  
    }  
}  
       
      
   


 

 
    
    

   
    
    
    

