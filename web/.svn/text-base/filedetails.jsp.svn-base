<%@page import="edu.uta.tsrh.model.FileDetail"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--?xml version="1.0" encoding="UTF-8"?-->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
<title>File Tracking</title>
<meta charset="utf-8"/>
<meta name="description" content="Place your description here"/>
<meta name="keywords" content="put, your, keyword, here"/>
<meta name="author" content="Templates.com - website templates provider"/>
<link rel="stylesheet" href="/TSRH/css/reset.css" type="text/css" media="all"/>
<link rel="stylesheet" href="/TSRH/css/layout.css" type="text/css" media="all"/>
<link rel="stylesheet" href="/TSRH/css/style.css" type="text/css" media="all"/>
<link href="/TSRH/css/calendar.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="/TSRH/js/jquery-1.js"></script>
<script type="text/javascript" src="/TSRH/js/cal.js"></script>
<script type="text/javascript" src="/TSRH/js/maxheight.js"></script>

<script type="text/javascript" src="/TSRH/js/cufon-yui.js"></script>
<script type="text/javascript" src="/TSRH/js/cufon-replace.js"></script>
<script type="text/javascript" src="/TSRH/js/Myriad_Pro_400.font.js"></script>
<script type="text/javascript" src="/TSRH/js/script.js"></script>
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
<!--Script for datepicker-->
<script type="text/javascript">

jQuery(document).ready(function () {
	
	$('input.three').simpleDatepicker({ startdate: '01/01/1800', enddate: '01/01/2100' });
	
});
</script>
</head>
<body id="page1" onLoad="new ElementMaxHeight();">
<div class="wrap">
<!-- header -->
	<header>
		<div class="container">
			<h1><a href="/TSRH/index.jsp">TSRHC</a></h1>
			<nav>
				<ul>
					<li><a href="/TSRH/index.jsp"><strong>Home</strong></a></li>
					<li><a href="/TSRH/test.jsp"><strong>Test/Consultation</strong></a></li>
					<li class="current"><a href="/TSRH/filetrackingpage.org"><strong>File Tracking</strong></a></li>
					<li><a href="/TSRH/notification.jsp"><strong>Set Alert</strong></a></li>
 				</ul>
			</nav>
			<div id="slogan"></div>
		</div>
	</header>
<!-- content -->
	<section id="content">
			<%
FileDetail fileDetail = (FileDetail) request.getAttribute("fileDetail");
        String historyUrl = "/TSRH/filetracking/file/historypage.org?fileId="+ fileDetail.getFileID();
        String pendingDatesUrl = "/TSRH/filetracking/file/pendingdatespage.org?fileId="+ fileDetail.getFileID();
        String checkoutUrl = "/TSRH/filetracking/file/checkoutpage.org?fileId="+ fileDetail.getFileID();
        String checkinUrl = "/TSRH/filetracking/file/checkinpage.org?fileId="+ fileDetail.getFileID();
        String transferUrl = "/TSRH/filetracking/file/transferpage.org?fileId="+ fileDetail.getFileID();
        String patientName = fileDetail.getPatientFirstName() + " " + fileDetail.getPatientLastName();
        String checkout = "disabled=\"disabled\"";
		String checkin = "disabled=\"disabled\"";
		String transfer = "disabled=\"disabled\"";
		if(fileDetail.getFileState().equals("OUT"))
			{
			    checkin = "enabled=\"enabled\"";
			    transfer = "enabled=\"enabled\"";
			}
			else
			{
			    checkout = "enabled=\"enabled\"";
			}
%>	
		<div class="container"><div class="ic">More Website Templates at TemplateMonster.com!</div>
			<div class="inside">
				<div class="wrapper indent">

					<article class="col-1">
							<form action="<%=historyUrl%>" method="post">
<input type="submit" value="History"  style="float:right"/>
</form>
<p>&nbsp;</p>

<form action="<%=pendingDatesUrl%>" method="post">
<input type="submit" value="Pending Dates" style="float:right"/>
</form>				
	
</br>
<h2>File details:</h2>	
<table>	
	<tr>
		<td width="150"><h3>File ID:</h3></td>
		<td><h3><b><%= fileDetail.getFileID() %></b></h3></td>
	</tr>
	<tr>
		<td><h3>Patient Name:</h3></td>
		<td><h3><b><%= patientName %></b></h3></td>
	</tr>	 
	<tr>
		<td><h3>Date of Birth:</h3></td>
		<td><h3><b><%=fileDetail.getPatientDateOfBirth() %></b></h3></td>
	</tr>
	<tr>
		<td><h3>Location:</h3></td>
		<td><h3><b><%=fileDetail.getLocation() %></b></h3></td>
	</tr>
	<tr>
		<td><h3>Status:</h3></td>
		<td><h3><b><%=fileDetail.getFileState() %></b></h3></td>
	</tr>
</table>		 
<form action="<%=checkoutUrl %>" method="post" style="display:inline">				
			<input type="submit" value="Checkout" <%=checkout%>/>
			</form>&nbsp;&nbsp;&nbsp;&nbsp;
			
<form action="<%=checkinUrl %>" method="post" style="display:inline">
			<input type="submit" value="Checkin" <%=checkin%>/>
			</form>&nbsp;&nbsp;&nbsp;&nbsp;
			
<form action="<%=transferUrl %>" method="post" style="display:inline">			
			<input type="submit" value="Transfer" <%=transfer%>/>
			
			</form>
		
<br />
	</article>
					<ul class="banners col-2">
 <p>&nbsp;</p>
                       
                       
                    </ul>
				</div>
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
<a rel="nofollow">Website template</a> designed by TemplateMonster.com<br/><a href="http://www.templates.com/product/illustrations/" class="new_window">Vector Illustrations</a> provided by Templates.com
				</div>
			</div>
		</div>
	</div>
</footer>
<script type="text/javascript">Cufon.now();</script>
</body>
</html>