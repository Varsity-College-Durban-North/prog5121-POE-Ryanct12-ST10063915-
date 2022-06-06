
package poe.assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

import static poe.assignment.UserStorage.firstName;
import static poe.assignment.UserStorage.surname;




//import required classes and packages  
public class Login{
    
    public static String username ;
    public static String Password ;
    
     
  boolean checkUserName(String username1) {
      
      
      boolean checker = false ;
      
      
      username = JOptionPane.showInputDialog( "Please Create a username: ") ;
      
      username1 = username;
      
	
        
        if(username1.length()<=5 && username1.contains("_")) {
                          checker = true ;
                         
                        }
        else{
             
             checker = false ;
        }
       
		
               
                
  return checker;
  }
                
                
             
 
 boolean checkPasswordComplexity(String Password1) {
    
        boolean capLetCheck = false;
	boolean specialChar = false;
	boolean numCheck = false;
	boolean checkAll = false ;
        boolean lengthpass = false;
    
       
        
        String specialCharacters = " !#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String CapitalLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String Numbers = "1234567890" ;
        
	Password = JOptionPane.showInputDialog( "Please create a password: ");
        
         Password1 = Password;
        
         Pattern CapLetter = Pattern.compile("[A-Z]", Pattern.CASE_INSENSITIVE);
            Pattern Number = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
            Pattern Special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]", Pattern.CASE_INSENSITIVE);
           
            Matcher hasCapLetter = CapLetter.matcher(Password1);
            Matcher hasNumber = Number.matcher(Password1);
            Matcher Specialcharacter = Special.matcher(Password1);
            
            boolean containsSpecialCharacter = Specialcharacter.find();
            boolean containsNumber = hasNumber.find();
            boolean containsCapLetter = hasCapLetter.find();
            
            
	//If the length of the password is < 8, -> everything remains false
	if(Password1.length()>=8 ) {
            lengthpass = true;
           
                    }
         else{
           
        lengthpass = false ;
        }
        
        
        if(containsSpecialCharacter == true){
            specialChar = true ;
         
        }
         else{
            
        specialChar = false ;
        }
        
        
        if(containsNumber == true){
            numCheck = true;
          
        }
        else{
            
        numCheck = false ;
        }
        
        
        if(containsCapLetter == true){
             capLetCheck = true;
           
        }
           
             else{
            
        capLetCheck = false ;
        }
            
     

if (capLetCheck == true && numCheck == true && specialChar == true && lengthpass == true) {
                checkAll = true; 
                
    
}
	
 return checkAll ;
}
	
    

public String registerUser() {
    
    UserStorage storage = new UserStorage();
    
    String Message   ;
   
    
	if(checkUserName(username)==true){
		Message = "Username Captured successfully" ;
        JOptionPane.showMessageDialog(null, Message);}
        
        else{
		Message = "Username is not correctly formatted, please \n"
						+ "ensure that your username contains an \n"
						+ "underscore and is no less than \n"
						+ "5 characters in length." ;
        JOptionPane.showMessageDialog(null, Message);
        checkUserName(username);
        }
		
        
        
	if(checkPasswordComplexity(Password) == true){
		
        storage.setfirstName(firstName);
        storage.setsurname(surname);
        
        Message = " user has been registerd successfully";
         JOptionPane.showMessageDialog(null, Message);
        }
        
        else{
		Message = "Password is not correctly formatted, please \n"
						+ "ensure that the password contains 8 \n"
						+ "characters, a capital letter, a number and a \n"
						+ "special character.";
        JOptionPane.showMessageDialog(null, Message);
        checkPasswordComplexity(Password);
        
        }
        
        
	return Message;
}


 
public boolean loginUser() {
    
   
        UserStorage storage = new UserStorage();
        
        boolean usernameCheck = false;
        boolean passwordCheck = false;
        boolean firstnameCheck = false;
        boolean surnameCheck = false;
        
        
        if (storage.getusername().matches(username)) {
            usernameCheck = true;
        }
        
        
        if (storage.getPassword().matches(Password)) {
            passwordCheck = true;
        }
        
        if (storage.getfirstName().matches(firstName)){
            firstnameCheck = true ;
        }
        
        if (storage.getsurname().matches(surname)){
            surnameCheck = true ;
        }
      
        if ((usernameCheck == true) || (passwordCheck == true) || (firstnameCheck == true) || (surnameCheck == true)) {
           
       
        }
         return  true;
}

 




public String returnLoginStatus(boolean status) {
    
    
        UserStorage storage = new UserStorage();
        
     
        if (status) {
            return "Welcome " + storage.getfirstName()+ ", " + storage.getsurname() + 
                    "it is great to see you.";            
        } else return "Username or password incorrect, please try again";
}

        }
   

    
 
 
 
  
    
        

    
        
    
    
 
            

