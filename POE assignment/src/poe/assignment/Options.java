
package poe.assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


class Options extends JFrame implements ActionListener{

//text
    JLabel Select ;
   
   
//buttons
    JButton addTask ;
    JButton showReport ;
    JButton quit ;
    
    JFrame frame = new JFrame() ;
    
Options(){
        UserStorage userStorage = new UserStorage() ;
        
        JPanel features = new JPanel();
        
        frame.setSize(250, 350) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        frame.add(features) ;
        frame.setTitle("EasyKanBan");
        features.setLayout(null) ;
        
    Select = new JLabel("Would you like to?") ;
    Select.setBounds(40, 30, 300, 30) ;
    features.add(Select) ;
    
    //add task button
    addTask = new JButton("Add Task") ;
    addTask.setBounds(40, 80, 150, 30) ;
    features.add(addTask) ;
    
    //show report button
    showReport = new JButton("Show Report") ;
    showReport.setBounds(40, 130, 150, 30) ;
    features.add(showReport) ;
    
    //quit button
    quit = new JButton("Quit") ;
    quit.setBounds(40, 180, 150, 30) ;
    features.add(quit) ;
        
        
        
        
        addTask.addActionListener(this);
        showReport.addActionListener(this);
        quit.addActionListener(this);
        
        frame.setVisible(true);
    }


 @Override
   public void actionPerformed(ActionEvent ae)     
    {  
        
        
        if(ae.getSource() == addTask){
            AddTask newtask = new AddTask();
            newtask.addTask();
          
        }
        
        if(ae.getSource() == showReport){
            ShowReport newReport = new ShowReport();
            newReport.ShowReport();
        }
        
        if(ae.getSource() == quit){
            JOptionPane.showMessageDialog(null, "See you again soon");        
            System.exit(EXIT_ON_CLOSE);
        }
        }

}
