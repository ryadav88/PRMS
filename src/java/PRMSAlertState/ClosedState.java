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
public class ClosedState implements AlertState
{
    
    @Override
    public AlertState set(Alert alert)
    {
        return this;
    }
    
    @Override
    public AlertState snooze(Alert alert)
    {
        return this;
    }
    
    @Override
    public AlertState display(Alert alert)
    {
        return this;
    }
    
    @Override
    public AlertState close(Alert alert)
    {
        return this;
    }
   
}
