
package poe.assignment;

import javax.swing.JOptionPane;
import static poe.assignment.Login.Password;
import static poe.assignment.Login.username;



public class UserStorage {
    
 public static String firstName = JOptionPane.showInputDialog( "Please enter your fisrt name:");
 public static String surname = JOptionPane.showInputDialog( "Please enter your surname:");
 String UsernameSET ;
 String PasswordSET ;
  
   

//firstname storage
    public String getfirstName(){
        System.out.println("user storage: " + firstName);
        return firstName ;
    }
    
    public void setfirstName(String FirstName){
        this.firstName = FirstName ;
        System.out.println(firstName);
    }
    
//surname storage
    public String getsurname(){
        System.out.println("user storage: " + surname); 
        return surname ;
    }
    
    public void setsurname(String Surname){
        this.surname = Surname ;
    }
    
//username storage     
    public String getusername(){
        System.out.println("user storage: " + username);
        return username ;
    }
    
    public void setusername(){
        this.UsernameSET = username ;
    }
    
    
//password storage 
    public String getPassword(){
        System.out.println("user storage: " + Password);
        return Password ;
    }
    
    public void setPassword(){
        this.PasswordSET = Password ;
    }
    
    
}
