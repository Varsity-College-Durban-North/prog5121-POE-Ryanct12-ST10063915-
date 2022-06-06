
package poe.assignment;

import javax.swing.JOptionPane;


public class AddTask {
    
    String numberOfTasks;
    String Description; 
    String TaskName;
    String Developer; 
    String Duration; 
    String selectedOption ;
    String[] options = {"To Do", "Done", "Doing"};
    int option; 
    int taskNum;
    int noOfTasks;
    int sumtotalHours = 0;
 
     public void addTask(){
       
     String ToDo = "To Do" ;
     String Done = "Done" ;
     String Doing = "Doing" ;
         
         
         
     String[] option = new String[3];
     option[0] = ToDo;
     option[1] = Done ;
     option[2] = Doing ;
         
         
       numberOfTasks =  JOptionPane.showInputDialog(null, "Please enter the amount of tasks you wish to enter"); 
       noOfTasks = Integer.parseInt(numberOfTasks); 
       
      
      
      for( taskNum = 1; taskNum<= noOfTasks; taskNum++){
          TaskName =  JOptionPane.showInputDialog(null, "Please Enter name of task: "+ taskNum);
          checkTaskDescription(); 
          Developer = JOptionPane.showInputDialog(null, "please eneter developer details for task: "+ taskNum); 
          Duration = JOptionPane.showInputDialog(null, "Please enter estimated time of task " + taskNum + " in hours:");
          
          
          selectedOption = (String) JOptionPane.showInputDialog(null,"Please choose task status",  
                  "Click a button",
                  JOptionPane.QUESTION_MESSAGE, null, option, "default");
          
          
          
          printTaskDetails();
         
          returnTotalHours();
          
        
                
      }
      
      
     
     }
    
            
 
boolean checkTaskDescription(){
    boolean DescriptionChecker = false;
    
     Description = JOptionPane.showInputDialog(null, "Please enter Task Description for task: " + taskNum); 
    
     int count = 0 ;    
     
     for(int i=0;i<Description.length();i++){
         if(Description.charAt(i)!=' '){
         count++; 
     }
     }
     
         if(Description.length()<50){
            JOptionPane.showMessageDialog(null, "Task successfully captured");
             DescriptionChecker = true;
             }
         else{
             JOptionPane.showMessageDialog(null, "Please enter a description of less than 50 characters");
             DescriptionChecker = false;
             checkTaskDescription();
         }
    
     
    
    
    return DescriptionChecker;
}

String createTaskID(){
    
     String ID; 
    

var firstTwoLetters = TaskName.substring(0,2);
var lastThreeLetters = Developer.substring(Developer.length() - 3);

String CapfirstTwoLetters = firstTwoLetters.toUpperCase();
String CapLastThreeLetters = lastThreeLetters.toUpperCase();

ID = CapfirstTwoLetters + ":" + taskNum + ":" + CapLastThreeLetters;
   
JOptionPane.showMessageDialog(null, "Task " + taskNum + " ID is: " + ID);

    return ID; 
}

String printTaskDetails(){
    
    
   String taskdetails = "Task Details";
   
           JOptionPane.showMessageDialog(null, "Task " + taskNum + " details:\n" +
                                      "------------------------------------\n" +
                                      "Name:                  " + TaskName + "\n" +
                                      "Task Description:\n"+
                                      Description +"\n"+
                                      "------------------------------------\n" +
                                      "Developer assigned: " + Developer + "\n" +
                                      "Esimated duration on task: " + Duration +"\n"+
                                      "Task ID: " + createTaskID() +"\n"+
                                      "Task status: " + selectedOption
    );
         
    
    
    return taskdetails; 
}

 int returnTotalHours(){
   
    
    System.out.println("returntotal hours running");
    
    
    int time = Integer.parseInt(Duration);
     
    sumtotalHours = sumtotalHours + time;
    
    
    if(taskNum >= noOfTasks){
        
        JOptionPane.showMessageDialog(null,"Total Hours: " + sumtotalHours);
    }
    
    
   
    
    return sumtotalHours;
}
    


}
        