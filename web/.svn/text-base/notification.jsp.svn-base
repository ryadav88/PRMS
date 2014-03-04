
<html lang="en">
    
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import ="java.util.*" import="PRMSalert.*" import="PRMSAlertDatabase.*" %>
<head>
<title>Home - Home Page |</title>
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
<!-- UTF-8 is the recommended encoding for your pages -->
    <meta http-equiv="content-type" content="text/xml; charset=utf-8" />
    <title>Zapatec DHTML Calendar</title>

<!-- Loading Theme file(s) -->
    <link rel="stylesheet" href="themes/forest.css" />
    <link rel="stylesheet" href="themes/layouts/small.css" />

<!-- Loading Calendar JavaScript files -->
    <script type="text/javascript" src="src/calendar.js"></script>
<!-- Loading language definition file -->
    <script type="text/javascript" src="lang/calendar-en.js"></script>
<script language="javascript" type="text/javascript" src="datetimepicker.js">



</script>

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
		<div class="container">
			<h1><a href="index.jsp">Hope Center</a></h1>
			<nav>
				<ul>
					<li ><a href="index.jsp"><strong>Home</strong></a></li>
					<li><a href="test.jsp"><strong>Test/Consult</strong></a></li>
		<li><a href="/TSRH/filetrackingpage.org">File Tracking</a></li>
                <li class="current"><a href="notification.jsp"><strong>Set Alert</strong></a></li>
									
			  </ul>
			</nav>
		  <div id="slogan"></div>
	  </div>
	</header>
<!-- content -->
	<section id="content">
		<div class="container"><div class="ic">More Website Templates at TemplateMonster.com!</div>
			<div class="inside">
				<div class="wrapper indent">
					<article class="col-1">
                                         	<h2>Enter Alert Details</h2> 
						<p><strong>
                        	 <table width="700">

         <tr>
          <td width = "150"> <h3>Priority:      </h3></blink></td>
          <td><form name="form1" method="post" action="setAlert.jsp">
            <label for="priority"></label>
            <select name="priority" id="priority">
              <option id="3" value="3">High</option>
              <option id="2" value="2">Medium</option>
              <option id="1" value="1">Low</option>
            </select>
             
         
           </td>
            <td><h3>Alert To:</h3></td>
           <td width="200"><p>
             <select name="to"  size="1">
  <option value="user1">user1</option>
  <option value="user2">user2</option>
  <option value="user3">user3</option>
  <option value="user4">user4</option>
</select>
</td>
          
          <tr></tr>
          

          </tr>
           <tr>
         
                 </p>
             <p>&nbsp;</p>
             <p>
               <label for="alertTitle"></label>
             </p></td>
          </tr>
           <tr>
          <td><h3>Alert Title:</h3></td>
           <td width="200"><p>
             <input type="text" name="alertTitle" id="alertTitle">
           </p>
             <p>
               <label for="alertTitle"></label>
             </p></td>
          </tr>
                    <tr>
          <td><h3>Message:</h3></td>
           <td width="200"><p>
            <textarea name="alertMessage" cols="30" rows="6"></textarea>
           </p>
            </td>
          </tr>
           <tr>
          <td><h3>Frequency:</h3></td>
           <td width="200"><p>
             <select name="freq" id="freq">
               <option id="1" value="1">Alert Once</option>
               <option id="2" value"2">Two days</option>
               <option id="3" value="3">Three days</option>
               <option id="7" value="7">One week</option>
             </select>
          
           </p>
             
               <label for="freq"></label>
             
             </td>
          </tr>
            
          <tr>
          <td><h3>Alert Date:</h3></td>
          <td><p>
          <input type="text" id="calendar" name="calendar" />
    <button id="trigger">...</button>
    <script type="text/javascript">//<![CDATA[
      Zapatec.Calendar.setup({
        firstDay          : 1,
        weekNumbers       : false,
        showOthers        : true,
        electric          : false,
        inputField        : "calendar",
        button            : "trigger",
        ifFormat          : "%m/%d/%Y",
        daFormat          : "%Y/%m/%d"
      });
    //]]></script>
<noscript>
Either enable Javascript in your Browser or upgrade to a newer version.
</noscript>
          </p>
           </td>
          
          </tr>
           
         
           
         
         
         
         
          <tr>
          <td>&nbsp;</td>
           <td>&nbsp;</td>
          </tr>
         
        
          <tr>
         
        
          
          <td >&nbsp;</td>
          <td  colspan="2"><h3><input type="submit" align="right"  style = "background-image:url(images/button.gif)" value="Set Alert">   </h3>       </tr>
         </form>
                                 </table>
                        </p>
					</article>
					<ul class="banners col-2">
                    
                        
                    
                      
						
                        
                        
                    <p>&nbsp;</p>
                        <p><%@ include file="Displayalert.jsp" %><p>&nbsp;</p>
                        <p>&nbsp;</p>
                       
                        <p>&nbsp;</p>                          
                        <p>&nbsp;</p>
                        
                    </ul>
				</div>
				<ul class="articles">
				  <li class="maxheight"></li>
					<li class="maxheight"></li>
					<li class="maxheight last"></li>
				</ul>
			</div>
		</div>
	</section>
</div>
<!-- footer -->
<footer>
	<div class="container">
		<div class="left">
			<div class="right">
				<div class="inside">
<a rel="nofollow" href="http://www.templatemonster.com/" class="new_window">Website template</a> designed by TemplateMonster.com<br/><a href="http://www.templates.com/product/illustrations/" class="new_window">Vector Illustrations</a> provided by Templates.com
				</div>
			</div>
		</div>
	</div>
</footer>
<script type="text/javascript">Cufon.now();</script>
</body>
</html>