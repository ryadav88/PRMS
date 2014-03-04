<!DOCTYPE html>
<html lang="en">
     <%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.util.*" import="PRMSalert.*" import="alertsystemdatabase.*" %>
<head>
<title>Test Record - Expanded</title>
<meta charset="utf-8">
<meta name="description" content="Place your description here">
<meta name="keywords" content="put, your, keyword, here">
<meta name="author" content="Templates.com - website templates provider">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script type="text/javascript" src="js/maxheight.js"></script>
<script type="text/javascript" src="js/jquery-1.4.2.min.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/Myriad_Pro_400.font.js"></script>
<script type="text/javascript" src="js/script.js"></script>

<SCRIPT TYPE="text/javascript">
<!--

 function closepopup()
   {
      if(false == my_window.closed)
      {
         my_window.close ();
      }
      else
      {
         alert('Window already closed!');
      }
   }

//-->
</SCRIPT>
<!--[if lt IE 7]>
	<link rel="stylesheet" href="css/ie/ie6.css" type="text/css" media="screen">
	<script type="text/javascript" src="js/ie_png.js"></script>
	<script type="text/javascript">
		ie_png.fix('.png, #slogan, header nav ul li a, .icon img, .link1, .link1 span');
	</script>
<![endif]-->
<!--[if lt IE 9]>
	<script type="text/javascript" src="js/html5.js"></script>
<![endif]-->
</head>
<body id="page1" onLoad="new ElementMaxHeight();">
<div class="wrap">
<!-- header -->
	<header>
	 

	   
   <table align="center">     
       <tr>
  <td align="center" >
       
<h2 >&nbsp; &nbsp; &nbsp; Viewing Alert Details  </h2> </td> </tr>            

          </table>
	      
<br /><br />
<br /><br /><br /><br />






	</header>
<!-- content -->
	<section id="content">
    
    
 <table width="600">
      <%  DisplayAlertController displayAlert = new DisplayAlertController();
      Alert alertInfo = new Alert();
          alertInfo =  displayAlert.view(Integer.parseInt(request.getParameter("alertId")));
          session.setAttribute("alert", alertInfo);
    %>

         <tr>
          <td width = "100"> <h3>Priority:      </h3></td>
          <td><p>
              <font color="#00BFFF">    <label><%= alertInfo.getSeverity() %></label>
          </p>
           </td>
           <td width = "100"> <h3>Alert Type:      </h3></td>
          <td><p>
              <font color="#00BFFF">   <label><%= alertInfo.getAlertSourceType() %></label>
          </p>
          </td>
          <tr></tr>
          

          </tr>
           <tr>
          <td><h3>Alert:</h3></td>
           <td  width="200" align="left"><p>
                   <font color="#00BFFF">     <label><%= alertInfo.getAlertSourceId() %></label> 
           </p>
           </td>
          </tr>
                    <tr>
          <td><h3>Message:</h3></td>
           <td width="200"><p>
               <font color="#00BFFF">      <%= alertInfo.getAlertText() %> 
           </p>
            </td>
          </tr>
            
          <tr>
          <td width = "100"><h3>Set By:</h3></td>
          <td><p>
              <font color="#00BFFF">      <label><%= alertInfo.getAlertCreatedBy() %></label> 
          </p>
         </td>
            <td width = "100"> <h3>Time:      </h3></td>
          <td><p>
             <font color="#00BFFF">     <label><%= alertInfo.getAlertTime() %></label>
          </p></td>
           <br />
           <br />
          </tr>
           
          <% Alerthistory[] alertHistory = displayAlert.getHistory(Integer.parseInt(request.getParameter("alertId")));
                if(alertHistory.length > 0)
                { %>
              
         <tr> <br /> </tr>
           <tr> <br /> </tr>
      <table border="10" bordercolor="#0099FF">
          <tr bgcolor="#0099FF">
          	<tr bordercolor="#0000CC"> 
            	<td align="center"> User </td>
                <td align="center"> Remark </td>
                <td align="center"> <p>Time </p></td> 
                <br />
           <br />
            </tr>
             
            <tr>
            <br />
           <br />
            </tr>
        <% for(int i = 0; i<alertHistory.length; i++)
           { %>
            <tr bordercolor="#0000CC"> 
            	<td align="center"><%= alertHistory[i].getAlertUpdateType() %></td>
                <td align="center"><%= alertHistory[i].getAlertRemark() %> </td>
                <td align="center"> <p><%= alertHistory[i].getAlertUpdateTime() %></p>
                <p>&nbsp;</p></td>
                
            </tr>
         <% } %>
            
            <tr>
            <br />
           <br />
            </tr>
           
        <% } %>
          </tr>
            <tr>
            <form name="form1" method="post" action="setRemark.jsp">
            <td> Remark</td>
            <td> <input type="textarea"  name="Remark" > </td> <p>&nbsp;  </p>
            </tr>
        
        </table>
          <tr>
         
        
          <td  align="right" >  <input type="button" value="View"  style = "background-image:url(images/button.gif)"  onClick="window.close()" ></td>
          <td align="center"><input type="submit" value="Update"  style = "background-image:url(images/button.gif)" ></td></form>
            <form name="Archive" method="post" action="AlertArchive.jsp"><td  align="left"><input type="submit"  style = "background-image:url(images/button.gif)" value="Archive">          </tr>
                      </form>

     </table>
</form>
     
</div>
	</section>
</div>

<script type="text/javascript">Cufon.now();</script>
</body>
</html>