/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRMSalert;
import alertsystemdatabase.*;
import java.util.List;

/**
 *
 * @author Ravi
 */
public class DisplayAlertController 
{
    private DBGetAlertsForTheUserIdCommand getAlert;
    private List<Alert> alertList;
    private List<Alert> alertSubList;
    private Alert[] alertsDue;
    private DBGetAlertsForTheAlertIdCommand getAlertCommandForAlertId;
    private DBCommandInvoker dbCommandInvoker; 
    
    public Alert[] getAlert(String userID)
    {
        getAlert = new DBGetAlertsForTheUserIdCommand(userID);
        dbCommandInvoker = new DBCommandInvoker(getAlert);
        dbCommandInvoker.execute();                 
        
        alertList = getAlert.getResult();
        alertsDue = new Alert[alertList.size()];
        for(int i=0,k=0; i<alertList.size();i++)
        {
            getAlertCommandForAlertId = new DBGetAlertsForTheAlertIdCommand(alertList.get(i).getAlertId());
            dbCommandInvoker = new DBCommandInvoker(getAlertCommandForAlertId);
            dbCommandInvoker.execute();                 
        
            alertSubList = getAlertCommandForAlertId.getResult();
            for(int j=0; j<alertSubList.size();j++)
            {
                alertsDue[k] = alertSubList.get(j);
                k++;
            }
        }
        return alertsDue;
        
    }
    
    public Alert view(int alertID)
    {
        getAlertCommandForAlertId = new DBGetAlertsForTheAlertIdCommand(alertID);
        dbCommandInvoker = new DBCommandInvoker(getAlertCommandForAlertId);
        dbCommandInvoker.execute();                 
        
        alertSubList = getAlertCommandForAlertId.getResult();
           
        return alertSubList.get(0);
       
    }
    
    public Alerthistory[] getHistory(int alertID)
    {
        DBGetAlertHistoryForTheAlertIdCommand getCommand = new DBGetAlertHistoryForTheAlertIdCommand(alertID);
        dbCommandInvoker = new DBCommandInvoker(getCommand);
        dbCommandInvoker.execute();
         
        List<Alerthistory> alertHistoryList = getCommand.getResult();
        Alerthistory[] alertHistory = new Alerthistory[alertHistoryList.size()];
        for(int i=0; i<alertHistoryList.size();i++)
        {
            alertHistory[i] = alertHistoryList.get(i);
        }

        return alertHistory;
    }
    
    public Userinfo getuser(String userID)
    {
        DBGetUserInfoCommand getUserInfoCommand = new DBGetUserInfoCommand(userID);
        dbCommandInvoker = new DBCommandInvoker(getUserInfoCommand);
        dbCommandInvoker.execute();        
        Userinfo userInfo = getUserInfoCommand.getResult();
        return userInfo;
    }
}
