/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRMSalert;
import alertsystemdatabase.*;
import java.sql.Timestamp;
import java.util.*;
/**
 *
 * @author Ravi
 */
public class DeleteAlertController {
    
    private Alert alertInfo;
    private Alert alert;
    private Alert alertcheck[];
    private DBCommandInvoker dbCommandInvoker;
    private List<Alert> alertsList;
    
    public DeleteAlertController(Alert alert)
    {
        this.alertInfo = alert;
    }
    
    
    public void archive()
    {
        int alertID = alertInfo.getAlertId();
        copyAlertHistory(alertID);
        copyAlert(alertID);
        
    }
        
    
    private void copyAlertHistory(int alertID)
    {
        DBGetAlertHistoryForTheAlertIdCommand getCommand = new DBGetAlertHistoryForTheAlertIdCommand(alertID);
        dbCommandInvoker = new DBCommandInvoker(getCommand);
        dbCommandInvoker.execute();
         
        List<Alerthistory> alertHistoryList = getCommand.getResult();
        Alerthistory[] alertHistory = new Alerthistory[alertHistoryList.size()];
        for(int i=0; i<alertHistoryList.size();i++)
        {
            createAlertHistoryArchive(alertHistoryList.get(i));
            deleteAlertHistory(alertHistoryList.get(i));
        }
        
    }
    
    private void createAlertHistoryArchive(Alerthistory alertHistory)
    {
        Alerthistoryarchive historyArchive = new Alerthistoryarchive(alertHistory.getAlertHistoryId(), 
                alertHistory.getAlert().getAlertId(), alertHistory.getAlertUpdateTime(), alertHistory.getAlertUpdateType(),
                alertHistory.getAlertRemark());
        DBInsertAlertHistoryArchiveCommand insertCommand = new DBInsertAlertHistoryArchiveCommand(historyArchive);
        dbCommandInvoker = new DBCommandInvoker(insertCommand);
        dbCommandInvoker.execute();
    }
    
    private void deleteAlertHistory(Alerthistory alertHistory)
    {
        DBDeleteAlertHistoryCommand deleteAlertHistory = new DBDeleteAlertHistoryCommand(alertHistory);
        dbCommandInvoker = new DBCommandInvoker(deleteAlertHistory);
        dbCommandInvoker.execute();
    
    }
    
    
   
    
    private void copyAlert(int alertID)
    {
    DBGetAlertsForTheAlertIdCommand getAlertCommandForAlertId = new DBGetAlertsForTheAlertIdCommand(alertID);
        dbCommandInvoker = new DBCommandInvoker(getAlertCommandForAlertId);
        dbCommandInvoker.execute();                 
        
        List<Alert> alertSubList;
        Alert alert;
        alertSubList = getAlertCommandForAlertId.getResult();
        alert = alertSubList.get(0);
        Alertarchive alertarchive = new Alertarchive(alert.getAlertId(), alert.getAlertCreatedTime(), 
                alert.getAlertTime(), new Timestamp(new Date().getTime()), alert.getAlertCreatedBy(),
                alert.getUserinfo().getUserId(), alert.getAlertText(), alert.getAlertSourceType(),
                alert.getAlertSourceId(), alert.getAlertState(), alert.getRepeating(), alert.getRepeatFrequency(),
                alert.getSeverity());
        
        createAlertArchive(alertarchive);
        deleteAlert(alert);
        
    }
    
    private void createAlertArchive(Alertarchive alertarchive)
    {
        DBInsertAlertArchiveCommand insertCommand = new DBInsertAlertArchiveCommand(alertarchive);
        DBCommandInvoker dbCommandInvoker = new DBCommandInvoker(insertCommand);
        dbCommandInvoker.execute();
        
    }
    
    private void deleteAlert(Alert alert)
    {
        DBDeleteAlertCommand deleteAlert = new DBDeleteAlertCommand(alert);
        dbCommandInvoker = new DBCommandInvoker(deleteAlert);
        dbCommandInvoker.execute();

    }
     
}
