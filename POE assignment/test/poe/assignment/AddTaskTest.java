import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import poe.assignment.AddTask;


public class AddTaskTest
{
    AddTask testTasks = new AddTask();
    
    public AddTaskTest {
}

     @Test
    public void testCreateTaskID() 
    {
        String expected = "LO:1:BYN";
        String actual = testTasks.createTaskID("Add login Feature", 1, "Robyn");
        assertEquals(expected,actual);
                    
    }

    
    @Test
    public void testReturnTotalHours() 
    {
        
    }

    @Test
    public void testPrintTaskDetails() 
    {
        
        int expected = 80;
        int actual = testTasks.returnTotalHours(2, 40);
        assertEquals(expected,actual);
    }

    @Test
    public void testAddSlackTime() 
    {
        // TestingLoops
        int expected = 40;
        int actual = testTasks.addSlackTime(2, 20, 10);
        assertEquals(expected,actual);
    }
}

        