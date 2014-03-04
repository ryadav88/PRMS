<%@page import="edu.uta.tsrh.model.FileDetail"%>
<%@page import="edu.uta.tsrh.model.SearchResult"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!--?xml version="1.0" encoding="UTF-8"?-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript" />

<title>Search Results for file tracking</title>
<meta charset="utf-8">
<meta name="description" content="Place your description here">
<meta name="keywords" content="put, your, keyword, here">
<meta name="author" content="Templates.com - website templates provider">
<link rel="stylesheet" href="/TSRH/css/reset.css" type="text/css"
	media="all">
<link rel="stylesheet" href="/TSRH/css/layout.css" type="text/css"
	media="all">
<link rel="stylesheet" href="/TSRH/css/style.css" type="text/css"
	media="all" />
<script type="text/javascript" src="/TSRH/js/maxheight.js"></script>
<script type="text/javascript" src="/TSRH/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="/TSRH/js/cufon-yui.js"></script>
<script type="text/javascript" src="/TSRH/js/cufon-replace.js"></script>
<script type="text/javascript" src="/TSRH/js/Myriad_Pro_400.font.js"></script>
<script type="text/javascript" src="/TSRH/js/script.js"></script>
<script type="text/javascript" src="/TSRH/js/jquery.js"></script>
<script type="text/javascript" src="/TSRH/js/jquery-slide.js"></script>

<!-- Function for Slide and show -->
<script type="text/javascript">
$(document).ready(function(){
	
	$(".accordion h3:first").addClass("active");
	$(".accordion .sliding:not(:first)").hide();

	$(".accordion h3").click(function(){
		$(this).next(".sliding").slideToggle("slow")
		.siblings(".sliding:visible").slideUp("slow");
		$(this).toggleClass("active");
		$(this).siblings("h3").removeClass("active");
	});

});
</script>
<!-- Function for Slide and Show -->
<style type="text/css">
.accordion {
	width: 500px;
	border-bottom: solid 1px #c4c4c4;
}
.accordion h3 {
	background: url(/TSRH/images/index.png) no-repeat left -51px;
	margin: 0;
	padding-top:10px;
	padding-bottom:10px;

	font-size:16px;
	text-align:center;
	border-bottom: none;
	cursor: pointer;
}
.accordion h3.active {
	background-position: right 5px;
}
.accordion div.sliding {
	
	margin: 0;
	padding: 10px 15px 20px;

}
</style>
<!--[if lt IE 7]>
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
		<div class="container">
			<div class="ic">More Website Templates at TemplateMonster.com!</div>
			<div class="inside">
				<div class="wrapper indent">
					<article class="col-1">
					<h2>Search Results</h2>
					<div class="accordion">
						<div id="tabltxt">
							<table cellspacing = "30">
								<tr>
									<th class="fileid">File ID</th>
									<th class="patname">Patient Name</th>
									<th class="location">Location</th>
								</tr>
								<%
								FileDetail fileDetail = (FileDetail) request.getAttribute("fileDetail");
				ArrayList<SearchResult> searchResult = (ArrayList<SearchResult>) request.getAttribute("searchResult");
        		String url;
        		int id= 0;
        		String idString = null;
        		String patientName = null;
        		String checkout = "disabled=\"disabled\"";
        		String checkin = "disabled=\"disabled\"";
        		String transfer = "disabled=\"disabled\"";
        		for (int i=0;i<searchResult.size();i++)
        		{
            		url="/TSRH/filetracking/search/results.org?fileID=";
            		SearchResult searchResultElement = (SearchResult) searchResult.get(i);
           			 id=(int)searchResultElement.getFileID();
           			 idString = Integer.toString(id);
            			url= url+idString;
        		String checkoutUrl = "/TSRH/filetracking/file/checkoutpage.org?fileId="+ idString;
        		String checkinUrl = "/TSRH/filetracking/file/checkinpage.org?fileId="+ idString;
        		String transferUrl = "/TSRH/filetracking/file/transferpage.org?fileId="+ idString;
            		patientName = searchResultElement.getPatientFirstName() + " " + searchResultElement.getPatientLastName();
           			if(searchResultElement.getFileState().equals("OUT"))
           			{
           			 checkin = "enabled=\"enabled\"";
     			   	 transfer = "enabled=\"enabled\"";
     			   	checkout = "disabled=\"disabled\"";
     				}
     			else
     			{
     			    checkout = "enabled=\"enabled\"";
     			   checkin = "disabled=\"disabled\"";
           		 transfer = "disabled=\"disabled\"";
           			}
				%>
				<tr>
					<td>
						<h3 class="active">
							<%=searchResultElement.getFileID()%><br />
						</h3>
						<div class="sliding" style="display: none;">
							<table cellspacing="3">
							<tr>
							<td>	
							<form action="<%=checkoutUrl %>" method="post" >
								<input type="submit" value="checkout"<%=checkout%>/> 	
								</form>
							</td>
							<td>
							<form action="<%=checkinUrl %>" method="post" >
								<input type="submit" value="checkin" <%=checkin%> /> 
							</form>
							</td>
							<td>
							<form action="<%=transferUrl %>" method="post" >
								<input type="submit" value="transfer" <%=transfer%> />
							</form>
							</td>
							</tr>
							</table>
						</div>
					</td>
					<td class="patname">
						<a href="<%=url%>"><%=patientName%></a>
					</td>
					<td class="location">
						<%=searchResultElement.getLocation()%>
					</td>
				</tr>
			<%
		}
	%>
							</table>
						</div>
					</article>
					<ul class="banners col-2">
						<p>&nbsp;</p>


					</ul>
				</div>
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
					<a rel="nofollow" >Website template</a> designed by
					TemplateMonster.com<br />
					<a href="http://www.templates.com/product/illustrations/"
						class="new_window">Vector Illustrations</a> provided by
					Templates.com
				</div>
			</div>
		</div>
	</div>
	</footer>
	<script type="text/javascript">
		Cufon.now();
	</script>
</body>
</html>
