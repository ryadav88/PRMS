/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PRMSalert;

import alertsystemdatabase.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author Ravi
 */
public class NotifyAlertController extends TimerTask
{
    private static NotifyAlertController instance = new NotifyAlertController();
    String smtpHost="smtp.gmail.com";
    int smtpPort=587;
    String from="dummyprojectsdp@gmail.com";
    String urPasswd="fall2011!";        
    
    public  static NotifyAlertController getInstance()
    {
        return instance;        
    }
    
    public void registerToTimer()
    {
        Calendar cal = Calendar.getInstance();
        cal.roll(Calendar.MINUTE, true);  
        Timer timer = new Timer(false);
        timer.scheduleAtFixedRate(this, cal.getTime(), 60000);        
    }

    public void run() {
        
        checkAlertsAndSendNotifications();
    }
    
    public void checkAlertsAndSendNotifications()
    {
        List<Alert> eAlertList = getAlertList();
        
        for(int i=0; i<eAlertList.size();i++)
        {
         /*   String to = eAlertList.get(i).getUserInfo().getEmailId();
            String subject = eAlertList.get(i).getAlertInfo().getAlertName();
            String content = eAlertList.get(i).getAlertInfo().getAlertText();
            sendMail(to, subject, content); 
            System.out.println("Sent mail to: "+to+" With Subject: "+subject+" And Content: "+content); */
        }
        
    }
    
    public List<Alert> getAlertList()
    {
    
        DBCommandInvoker dbCommandInvoker = null;
        
        String startTime = "1970-02-15 00:00:00";
        Date endDate = new Date();
        
        DateFormat formatter ; 
        Date startDate = null; 

        
        formatter = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        try {
            startDate = (Date)formatter.parse(startTime);            
        } catch (ParseException ex) {
            Logger.getLogger(ex.getMessage());
        }
              
        
        DBGetAlertsBetweenTheTimeCommand command = new DBGetAlertsBetweenTheTimeCommand(startDate, endDate);
        
        dbCommandInvoker = new DBCommandInvoker(command);
        
        dbCommandInvoker.execute();
        
        List<Alert> alertList = command.getResult();
        
        System.out.println("Start Time: "+startDate.getTime()+" End Time: "+endDate.getTime());
        
        System.out.println("GetAlertsBetweenTheTime: "+alertList.size());
        
        return alertList;
        
    }
    
    public void sendMail(String to, String subject, String content)
    {
            	
    	try{
                		java.util.Properties props = new java.util.Properties();
        			props=System.getProperties(); 
        			props.put("mail.smtp.host", smtpHost);
        			props.put("mail.smtp.starttls.enable", "true");
        			props.put("mail.smtps.auth", "true");

        			Session mailSession = Session.getDefaultInstance(props, null);
        			mailSession.setDebug(false);
        			Message msg = new MimeMessage(mailSession);
        			
        			msg.setFrom(new InternetAddress(from));
        			InternetAddress[] address = {new InternetAddress(to)};
        			msg.setRecipients(Message.RecipientType.TO, address);
        			msg.setSubject(subject);
        			msg.setSentDate(new Date());
        			msg.setText(content);
        			//Send the message
        			
        			//System.out.println("Printed!");
        			Transport transport = mailSession.getTransport("smtp");
        			transport.connect(smtpHost,smtpPort,from, urPasswd);
        			transport.sendMessage(msg, msg.getAllRecipients());
        			transport.close();
          			
        }
    	catch(Exception e)
    	{
    		
    		e.getMessage();
    		
    	}        
        
    }

    /*
        public static void Notify()
        {
            DateFormat dF ; 
            Calendar cal = Calendar.getInstance();
            dF = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
            String nStartDate = dF.format(cal.getTime());
            String nEndDate = dF.format(cal.getTime());
            //NotifyAlertController notifyAlert = new NotifyAlertController(nStartDate, nEndDate);
            
        }
        
        public NotifyAlertController(String nStartDate, String nEndDate)
    { 
        DateFormat formatter ; 
        formatter = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        try 
        {
            Date startDate = (Date)formatter.parse(nStartDate);
            Date endDate = (Date)formatter.parse(nEndDate);
        } catch (ParseException ex) 
            
        {
            Logger.getLogger(NotifyAlertController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
     * */
     
        /*
    public AlertInfo getAlert(Date startDate, Date endDate)
    {
        eGetAlert = new DBGetAlertsBetweenTheTimeCommand(startDate,endDate);
        DBCommandInvoker cmdInvoker = new DBCommandInvoker(eGetAlert);
        cmdInvoker.execute();
        
        eAlertList = eGetAlert.getResult();
        
        for(int i=0; i<eAlertList.size();i++)
        {
            //eGetAlertInfo = new DBGetAlertInfoCommand(eAlertList.get(i).getAlertId());
            //eGetUserInfo = new DBGetUserInfoCommand(eAlertList.get(i).getUserInfo());
            //SendMail(eGetAlertInfo.getResult(), eGetUserInfo.getResult());
            SendMail(eAlertList.get(i).getAlertInfo(), eAlertList.get(i).getUserInfo());
        }
        
        return alertsDue;
    }
    public boolean view(AlertInfo alertInfo)
    {
        alertInfo.view();
        return true;
    }

    private void SendMail(AlertInfo alertInfo, UserInfo userInfo) 
    {
       String userMmailId = userInfo.getEmailId();
       String alertMsg = alertInfo.getAlertText();
       
       
    }
         * /
         
    }
         */
}