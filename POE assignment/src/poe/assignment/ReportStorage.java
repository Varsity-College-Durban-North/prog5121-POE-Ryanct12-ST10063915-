
package poe.assignment;

import java.util.ArrayList;


public class ReportStorage {
    
    public static ArrayList<String> Developer = new ArrayList<>();
    public static ArrayList<String> taskName = new ArrayList<>();
    public static ArrayList<String> taskID = new ArrayList<>();
    public static ArrayList<String> taskDuration = new ArrayList<>();
    public static ArrayList<String> taskStatus = new ArrayList<>();
    
    public ReportStorage(String sDeveloper,String sTaskName,String sID,String sDuration,String sStringOption) {
        this.Developer.add(sDeveloper);
        this.taskName.add(sTaskName);
        this.taskID.add(sID);
        this.taskDuration.add(sDuration);
        this.taskStatus.add(sStringOption);
       
    }  
    public static String getDev(){
        return Developer.get(0);
    }
    public static ArrayList<String> getDeveloper(){
        return Developer;
    }
    public static ArrayList<String> getTaskName(){
        return taskName;
    }
    public static ArrayList<String> getTaskID(){
        return taskID;
    }
    public static ArrayList<String> getTaskDuration(){
        return taskDuration;
    }
    public static ArrayList<String> getTaskStatus(){
        return taskStatus;
    }
    
}
