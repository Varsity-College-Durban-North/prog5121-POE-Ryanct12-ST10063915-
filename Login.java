
package poe.assignment;



//import required classes and packages  
public class Login{
    
  public boolean checkUserName(String username) {
     
	boolean checker = false;
        
        
	//If the length of the username is < 5, -> checker remains false
	if(username.length()>4) {
		for(int i=0; i<username.length(); i++) {
			//char letter = username.charAt(i);
			//Checking ascii value of "_" to verify that it exists in the string
			if(username.charAt(i) == 95)
				checker = true;
		}
	}
return checker;
}
	
 
public boolean checkPasswordComplexity(String Password) {
	
        
	boolean capLetCheck = false;
	boolean specialChar = false;
	boolean numCheck = false;
	boolean checkAll = false;
	
	//If the length of the password is < 8, -> everything remains false
	if(Password.length()>4) {
		for(int i=0; i<Password.length(); i++) {

			//capLetCheck
			if(Password.charAt(i) < 91 && 64 < Password.charAt(i))
				capLetCheck = true;
			//specialChar
			if(Password.charAt(i) < 48 && 32 < Password.charAt(i))
				specialChar = true;
			//numCheck
			if(Password.charAt(i) < 58 && 47 < Password.charAt(i))
				numCheck = true;
		}
	}
	if(capLetCheck==true && specialChar==true && numCheck==true)
		checkAll = true;
	return checkAll;	
	
}


public String registerUser(String username, String Password, String firstName, String surname) {
    
    UserStorage storage = new UserStorage();
    
    String Message = "" ;
    
	if(checkUserName(username)==true && checkPasswordComplexity(Password)==true)
		System.out.println("");
	if(checkPasswordComplexity(Password)==true){
		System.out.println("Password successfully captured.");
        storage.setfirstName(firstName);
        storage.setsurname(surname);
        storage.setPassword(Password);
        storage.setUsername(username);
        Message = " user has been registerd successfully";
        
        }
                else
		Message = "Password is not correctly formatted, please \n"
						+ "ensure that the password contains 8 \n"
						+ "characters, a capital letter, a number and a \n"
						+ "special character.";
	if(checkUserName(username)==true)
		Message = "Welcome "+ username ;
	else
		Message = "Username is not formatted, please \n"
						+ "ensure that your username contains an \n"
						+ "underscore and is no less than \n"
						+ "5 characters in length." ;
	return Message;
}
 
public boolean loginUser(String username, String Password) {
    
    
        UserStorage storage = new UserStorage();
        
        boolean usernameCheck = false, passwordCheck = false;
        
        
        if (storage.getUsername().matches(username)) {
            usernameCheck = true;
        }
        
        
        if (storage.getPassword().matches(Password)) {
            passwordCheck = true;
        }
        
      
        if ((usernameCheck == true) || (passwordCheck == true)) {
            return  true;
        } else {
            return false;
        }
}

public String returnLoginStatus(boolean status) {
    
    
        UserStorage storage = new UserStorage();
        
     
        if (status) {
            return "Welcome " + storage.getfirstName()+ ", " + storage.getsurname() + 
                    "it is great to see you.";            
        } else return "Username or password incorrect, please try again";
}

        }
   

    
 
 
 
  
    
        

    
        
    
    
 
            

