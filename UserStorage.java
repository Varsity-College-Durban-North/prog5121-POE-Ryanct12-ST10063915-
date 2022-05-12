
package poe.assignment;


public class UserStorage {
    
    public String username ;
    public String password ;
    public String firstName;
    public String surname ;
  

//firstname storage
    public String getfirstName(){
        return firstName ;
    }
    
    public void setfirstName(String firstName){
        this.firstName = firstName ;
    }
    
//surname storage
    public String getsurname(){
        return surname ;
    }
    
    public void setsurname(String surname){
        this.surname = surname ;
    }
    
//username storage     
    public String getUsername(){
        return username ;
    }
    
    public void setUsername(String username){
        this.username = username ;
    }
    
    
//password storage 
    public String getPassword(){
        return password ;
    }
    
    public void setPassword(String password){
        this.password = password ;
    }
    
    
}
