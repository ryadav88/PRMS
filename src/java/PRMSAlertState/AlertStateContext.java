/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRMSAlertState;

import alertsystemdatabase.*;

/**
 *
 * @author Ravi
 */
public class AlertStateContext {
    private AlertState closedState, displayedState, setState, snoozeState;
    
    private AlertState alertState;
    
    public AlertStateContext()
    {
        closedState = new ClosedState();
        displayedState = new DisplayedState();
        setState = new SetState();
        snoozeState = new SnoozeState();
        alertState = null;
    }
    
    public void alertSet(Alert alert)
    {
        this.alertState = setState;
    }   
    
    public void alertDisplayed(Alert alert)
    {
        alertState.display(alert);
    }
    
    public void Alertsnoozed(Alert alert)
    {
        alertState.snooze(alert);
    }
    
    public void Alertclosed(Alert alert)
    {
        alertState.close(alert);
    }
    
    public AlertState getStatus(Alert alert)
    {
        return alertState;
    }
    
}

