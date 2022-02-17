/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121poe;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author ctill
 */
public class TaskTest
{
    Task testTasks = new Task();
    
    public TaskTest() {
    }

     @Test
    public void testCreateTaskID() 
    {
        String expected = "AD:1:BYN";
        String actual = testTasks.createTaskID("Add login Feature", 1, "Robyn");
        assertEquals(expected,actual);
                    
    }

    @Test
    public void testCreateTaskIDinLoop()
    {
          String [] developerNames = new String[] {"Mike","Edward"
       , "Samantha", "Glenda"};
          
          String [] taskNames ={"Create Login", "Create Add Tasks", 
              "Create Report", "Create Search"};
          
          String [] testIDs = {"CR:0:IKE","CR:1:ARD","CR:2:THA","CR:3:NDA"};
          
          for (int i = 0; i < developerNames.length; i++) 
          {
             String expected =  testIDs[i];
             String actual = testTasks.createTaskID(taskNames[i], i, developerNames[i] );
             assertEquals(expected,actual);
          }
         
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
    public void testPopulateDeveloperArray() 
    {
         String [] developers = new String[] {"Mike Smith", "Edward Harrington"
       , "Samantha Paulson", "Glenda Oberholzer"};
         
        String[] capturedDevelopers = new String[3];
        capturedDevelopers = testTasks.populateDeveloperArray();
        for (int i = 0; i < capturedDevelopers.length; i++) 
        {
            String expected = developers[i];
            String actual =capturedDevelopers[i];
            assertEquals(expected,actual);
        }
    }

    @Test
    public void testAddSlackTime() 
    {
        // TestingLoops
        int expected = 40;
        int actual = testTasks.addSlackTime(2, 20, 10);
        assertEquals(expected,actual);
    }

    @Test
    public void testPopulateTaskNameArray() 
    {
          String [] TaskName = new String[] {"Create Login", "Create Add Features"
       , "Create Reports", "Create Arrays"};
         
        String[] capturedTaskNames = new String[3];
        capturedTaskNames = testTasks.populateTaskNameArray();
        for (int i = 0; i < capturedTaskNames.length; i++) 
        {
            String expected = TaskName[i];
            String actual =capturedTaskNames[i];
            assertEquals(expected,actual);
        }
    }
}
