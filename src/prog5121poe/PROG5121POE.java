/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121poe;

import javax.swing.JOptionPane;

/**
 *
 * @author ctill
 */
public class PROG5121POE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {  
         Task tasks = new Task();
         Search search = new Search();
        int menu = Integer.parseInt(JOptionPane.showInputDialog("1:Add tasks,  2:Report, 3:quit"));
        int numTasks=0;
          
   
         
           while(true)
         {
             switch(menu)
            {
                case 1:
                       numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Tasks "))-1;
                       int duration=0;
                       int totalHours=0;
                       for (int i = 0; i <= numTasks; i++) 
                       {
                            String taskName =  JOptionPane.showInputDialog("Enter Task Name");
                            int taskNumber = i;
                            String taskDescription = JOptionPane.showInputDialog("Enter Task Description");
                            String developerFirstName = JOptionPane.showInputDialog("Enter Task Developer First Name");
                            String developerLastName = JOptionPane.showInputDialog("Enter Task Developer Last Name");
                            duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Duration in hours"));
                            String taskSatus = JOptionPane.showInputDialog("Please select one of the following task statuses: To Do, Done, Doing");
                            String taskID = tasks.createTaskID(taskName, taskNumber, developerFirstName);
                            String finalTaskDetails = tasks.printTaskDetails(taskName, taskNumber, taskDescription, developerFirstName, taskID, duration, taskName, taskSatus);
                            JOptionPane.showMessageDialog(null, finalTaskDetails);
                  
                          
                       
                       }
                       
                       
                        totalHours = tasks.returnTotalHours(numTasks,duration);

                        JOptionPane.showMessageDialog(null, "Your total task hours are "+ Integer.toString(totalHours));
                        int slack = tasks.addSlackTime(numTasks, totalHours, 10);
                        JOptionPane.showMessageDialog(null,"Your total task hours with slack is " + slack );
                       return;

                case 2 :
                     
                    String[] capturedDevelopers = new String[3];
                    String[] taskNames = new String[3];
                    capturedDevelopers = tasks.populateDeveloperArray();
                    taskNames = tasks.populateTaskNameArray();
                    
                        for (String capturedDeveloper : capturedDevelopers) {
                            JOptionPane.showMessageDialog(null, capturedDeveloper);
                        }
                        
                         for (String taskName : taskNames) {
                            JOptionPane.showMessageDialog(null, taskName);
                        }
                        
                        String searchTaskResult = search.searchbyTask("Create Reports", taskNames, capturedDevelopers);
                        JOptionPane.showMessageDialog(null, searchTaskResult);
                    return;
                case 3:
                    return;
                 
            }
   
    }
    
    }
    
}
