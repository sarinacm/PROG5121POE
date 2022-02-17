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
public class Search 
{
    public String searchbyTask(String taskName, String [] tasks, String [] developers)
    {
        String returnedResult = null;
        
        for (int i = 0; i < tasks.length; i++) 
        {
            JOptionPane.showMessageDialog(null, tasks[i]);
            if (tasks[i].equalsIgnoreCase(taskName)) 
            {
                returnedResult = tasks[i]+ " " + developers[i];
            }
            
            else 
            {
                returnedResult ="No tasks that match search term foud";
            }
        }
    
        return returnedResult;
    
    }
    
    
}
