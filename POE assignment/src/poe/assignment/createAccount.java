
package poe.assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class createAccount extends JFrame implements ActionListener{

 
//for account page
     
//labels
    JLabel accountpageLabel ;
    JLabel nameLabel ;
    JLabel surnameLabel ;
    JLabel createusernameLabel ;
    JLabel createpasswordLabel ;
    JLabel retypepasswordLabel ;
    JLabel success1 ;
    JLabel cancel1 ;
//text
    JTextField nameText ;
    JTextField surnameText ;
    JTextField createusernameText ;
    JPasswordField createpasswordText ;
    JPasswordField retypepasswordText ;
//buttons
    JButton buttonCreateAccount ;
    JButton buttonCancelAccount ;
   
   JFrame frame = new JFrame() ;
    
createAccount(){
    
     UserStorage userStorage = new UserStorage() ;
    
    
       
        JPanel panel = new JPanel();
        
        frame.setSize(350, 500) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        frame.add(panel) ;
        
        //Titel on form
      setTitle("ACCOUNT");
        panel.setLayout(null) ;
        
//create account label
    accountpageLabel = new JLabel("Please login to your account below.") ;
    accountpageLabel.setBounds(40, 60, 300, 30) ;
    panel.add(accountpageLabel) ;
    
//first name label    
    nameLabel = new JLabel("First name:") ;
    nameLabel.setBounds(40, 130, 100, 30) ;
    panel.add(nameLabel) ;
//first name text   
    nameText = new JTextField(20) ;
    nameText.setBounds(150, 130, 150, 30) ;
    panel.add(nameText) ;
    
    
//surname label    
    surnameLabel = new JLabel("Surname:") ;
    surnameLabel.setBounds(40, 170, 100, 30) ;
    panel.add(surnameLabel) ;
//surname text   
    surnameText = new JTextField(20) ;
    surnameText.setBounds(150, 170, 150, 30) ;
    panel.add(surnameText) ;
  
    
//username label    
    createusernameLabel = new JLabel("Username:") ;
    createusernameLabel.setBounds(40, 210, 100, 30) ;
    panel.add(createusernameLabel) ;
//username text   
    createusernameText = new JTextField(20) ;
    createusernameText.setBounds(150, 210, 150, 30) ;
    panel.add(createusernameText) ;

    
//password label    
    createpasswordLabel = new JLabel("Password:") ;
    createpasswordLabel.setBounds(40, 250, 100, 30) ;
    panel.add(createpasswordLabel) ;
//password text
    createpasswordText = new JPasswordField() ;
    createpasswordText.setBounds(150, 250, 150, 30) ;
    panel.add(createpasswordText) ;
    
    
    
//retype password label    
    retypepasswordLabel = new JLabel("Retype Password:") ;
    retypepasswordLabel.setBounds(40, 290, 200, 30) ;
    panel.add(retypepasswordLabel) ;
//retype password text
    retypepasswordText = new JPasswordField() ;
    retypepasswordText.setBounds(150, 290, 150, 30) ;
    panel.add(retypepasswordText) ;
    

    
//create account button
    buttonCreateAccount = new JButton("Login") ;
    buttonCreateAccount.setBounds(40, 330, 150, 30) ;
    
//new code runs if button is hit, create a new class
  
    panel.add(buttonCreateAccount) ;
    
//create account successful text 
    success1 = new JLabel("");
    success1.setBounds(40, 360, 200, 30) ;
    panel.add(success1);
    
    
//cancel button
    buttonCancelAccount = new JButton("Cancel") ;
    buttonCancelAccount.setBounds(200, 330, 100, 30) ;
   
    panel.add(buttonCancelAccount) ;
//cancel text     
    cancel1 = new JLabel("");
    cancel1.setBounds(40, 360, 350, 30) ;
    panel.add(cancel1);

    
     buttonCreateAccount.addActionListener(this) ;
     buttonCancelAccount.addActionListener(this) ;

    
    frame.setVisible(true) ;
        
   
    
}
 
 
    @Override
    public void actionPerformed(ActionEvent ae)     
    {  
        UserStorage storage = new UserStorage();
        
        String Password = storage.getPassword() ;
        String username = storage.getusername() ;
        String firstName = storage.getfirstName() ;
        String surname = storage.getsurname() ;
        
       
        
        String nameValue = nameText.getText();
        String surnameValue = surnameText.getText();
        String userValue = createusernameText.getText();        //get user entered username from the textField1  
        String passValue = createpasswordText.getText();        //get user entered pasword from the textField2  
        String retypePassValue = retypepasswordText.getText();
   
        userValue = username ;
        Password = passValue ;
        nameValue = firstName ;
        surnameValue = surname ;
        retypePassValue = Password ;
        
   
       if (ae.getSource() == buttonCreateAccount){
           
       }
        
        
 
        if (firstName.equals(nameText.getText()) && 
                surname.equals(surnameText.getText()) && 
                username.equals(createusernameText.getText()) && 
                Password.equals(createpasswordText.getText()) && 
                Password.equals(retypepasswordText.getText()) &&
                ae.getSource() == buttonCreateAccount ) {   
      
            
            
           
            
            
            frame.setVisible(false);
            
//create instance of the NewPage  
           Welcome page = new Welcome();  
              
//make page visible to the user  
            page.setVisible(true);  
              
//success message 
            success1.setText("Account successfully created ");
            
           
            
//create a welcome label and set it to the new page  
            JLabel newlabel = new JLabel("       Welcome " + nameValue + " " + surnameValue + " to EasyKanban" ); 
            newlabel.setBounds(20, 30, 300, 30);
            page.add(newlabel);  
            
           
            





        }
//if details dont match        
        else{
            JOptionPane.showMessageDialog(null, "Please enter valid username and password");
        }
        
//if passwords dont match     
        if (retypepasswordText.getText().equals(createpasswordText.getText()) ){
         
                    }
            else{
                JOptionPane.showMessageDialog(null, "Passwords do not match");
            }
//if name dont match
        if (firstName.equals(nameText.getText()) ){
         
                    }
            else{
                JOptionPane.showMessageDialog(null, "Name of account does not match");
            }
//if surname doesnt match 
        if (surname.equals(surnameText.getText()) ){
         
                    }
            else{
                JOptionPane.showMessageDialog(null, "Surname of account does not match");
            }
//if username doesnt match
        if (username.equals(createusernameText.getText()) ){
         
                    }
            else{
                JOptionPane.showMessageDialog(null, "Username does not match");
            }
//cancel button
        if (ae.getSource() == buttonCancelAccount ){
            JOptionPane.showMessageDialog(null, "We are sad to see you go");
            System.exit(EXIT_ON_CLOSE);
        }
       
 
  
    }
    
}
