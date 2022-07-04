
package poe.assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


class ShowReport extends JFrame implements ActionListener{

  
    //text 
    JLabel Select ;
    
    
   
//buttons
    JButton A ;
    JButton B ;
    JButton C ;
    JButton D ;
    JButton E ;
    JButton F ;
 
  
    JButton quit ;
    
    JFrame frame = new JFrame() ;

    
public void ShowReport(){
       
        
        JPanel features = new JPanel();
        
        frame.setSize(400, 500) ;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        frame.add(features) ;
        frame.setTitle("EasyKanBan");
        features.setLayout(null) ;
        
    Select = new JLabel("Please choose Option Below") ;
    Select.setBounds(40, 30, 300, 30) ;
    features.add(Select) ;
  
    A = new JButton("Display all Tasks that are Done") ;
    A.setBounds(40, 80, 300, 30) ;
    features.add(A) ;
    
    B = new JButton("Display Task with Longest Duration") ;
    B.setBounds(40, 130, 300, 30) ;
    features.add(B) ;
    
    
    C = new JButton("Search for Task") ;
    C.setBounds(40, 180, 300, 30) ;
    features.add(C) ;
    
    
    D = new JButton("Search for Developer") ;
    D.setBounds(40, 230, 300, 30) ;
    features.add(D) ;
    
    E = new JButton("Delete a Task") ;
    E.setBounds(40, 280, 300, 30) ;
    features.add(E) ;
    
    F = new JButton("Show Report") ;
    F.setBounds(40, 330, 300, 30) ;
    features.add(F) ;
    
    //quit button
    quit = new JButton("Quit") ;
    quit.setBounds(40, 380, 300, 30) ;
    features.add(quit) ;
        
        
        
        
        A.addActionListener(this);
        B.addActionListener(this);
        C.addActionListener(this);
        D.addActionListener(this);
        E.addActionListener(this);
        F.addActionListener(this);
        
        quit.addActionListener(this);
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<String> rDeveloper = ReportStorage.getDeveloper();
        ArrayList<String> taskName = ReportStorage.getTaskName();
        ArrayList<String> taskID = ReportStorage.getTaskID();
        ArrayList<String> taskDuration = ReportStorage.getTaskDuration();
        ArrayList<String> taskStatus = ReportStorage.getTaskStatus();
        
        if(e.getSource() == quit){
            frame.setVisible(false);

        }
        
        if(e.getSource() == A){
            String sDisplay = "";
            for(int i=0; i<rDeveloper.size(); i++){
                String ts = taskStatus.get(i);
                if(ts.equals("Done")){
                    sDisplay += "Developer assigned:        " + rDeveloper.get(i) + "\n" +
                            "Task Name:                 " + taskName.get(i) + "\n" +
                            "Task Status:               " + taskStatus.get(i) +"\n" +
                            "Esimated duration on task: " + taskDuration.get(i) +
                            "\n"+"\n";
                }
            }
            JOptionPane.showMessageDialog(null, sDisplay);
        }
        
        if(e.getSource() == B){
            String sDisplay = "";
             String obj = Collections.max(taskDuration);
             int index = taskDuration.indexOf(obj);
             sDisplay += "Developer assigned:        " + rDeveloper.get(index) + "\n" +
                         "Esimated duration on task: " + taskDuration.get(index) +
                          "\n"+"\n";
            JOptionPane.showMessageDialog(null, sDisplay);
        }
        
        if(e.getSource() == C){
            String userTaskName = JOptionPane.showInputDialog(null, "Enter task name: ");
            String sDisplay = "";
            for(int i=0; i<rDeveloper.size(); i++){
                if(taskName.get(i).equals(userTaskName)){
                    sDisplay += "Developer assigned:        " + rDeveloper.get(i) + "\n" +
                                "Task Name:                 " + taskName.get(i) + "\n" +
                                "Task Status:               " + taskStatus.get(i) +
                                "\n"+"\n";
                }
            }
            JOptionPane.showMessageDialog(null, sDisplay);
        }
        
        if(e.getSource() == D){
            String userDeveloper = JOptionPane.showInputDialog(null, "Enter developer name: ");
            String sDisplay = "";
            for(int i=0; i<rDeveloper.size(); i++){
                if(rDeveloper.get(i).equals(userDeveloper)){
                    sDisplay += "Developer assigned:        " + rDeveloper.get(i) + "\n" +
                                "Task Name:                 " + taskName.get(i) + "\n" +
                                "Task Status:               " + taskStatus.get(i) +
                                "\n"+"\n";
                }
            }
            JOptionPane.showMessageDialog(null, sDisplay);
        }
        
        if(e.getSource() == E){
            String userTaskName = JOptionPane.showInputDialog(null, "Enter task name: ");
            for(int i=0; i<rDeveloper.size(); i++){
                if(taskName.get(i).equals(userTaskName)){
                    rDeveloper.remove(i);
                    taskName.remove(i);
                    taskID.remove(i);
                    taskDuration.remove(i);
                    taskStatus.remove(i);
                    JOptionPane.showMessageDialog(null,"Task successfully removed.");
                }
            }
        }
        
        if(e.getSource() == F){
            String sDisplay = "";
            for(int i=0; i<rDeveloper.size(); i++){
                sDisplay += "Developer assigned:        " + rDeveloper.get(i) + "\n" +
                            "Task Name:                 " + taskName.get(i) + "\n" +
                            "Task Status:               " + taskStatus.get(i) +"\n" +
                            "Esimated duration on task: " + taskDuration.get(i) +
                            "\n"+"\n";
            }
            JOptionPane.showMessageDialog(null, sDisplay);
        }
        
        
        
    }

}
    