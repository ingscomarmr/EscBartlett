<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="Dashboard">
	<meta name="keyword"
		content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
	<!-- ######### PARTE DEL INCLUDE  ######### {-->
	<!-- Bootstrap core CSS -->
	<link
		href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.css"
		rel="stylesheet">
	<!--external css-->
	<link
		href="${pageContext.request.contextPath}/resources/assets/font-awesome/css/font-awesome.css"
		rel="stylesheet" />
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/assets/css/zabuto_calendar.css">
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/assets/js/gritter/css/jquery.gritter.css" />
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/assets/lineicons/style.css">
	
	<!-- Custom styles for this template -->
	<link
		href="${pageContext.request.contextPath}/resources/assets/css/style.css"
		rel="stylesheet">
	<link
		href="${pageContext.request.contextPath}/resources/assets/css/style-responsive.css"
		rel="stylesheet">
	
	<script
		src="${pageContext.request.contextPath}/resources/assets/js/chart-master/Chart.js"></script>
	
	
	<link
		href="${pageContext.request.contextPath}/resources/assets/css/prism.css"
		media="all" rel="stylesheet" type="text/css">
	<link
		href="${pageContext.request.contextPath}/resources/assets/css/lity.css"
		rel="stylesheet" />
	
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/assets/event-calendar/eventCalendar.css">
	
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/resources/assets/event-calendar/eventCalendar_theme_responsive.css">
	
	<script>
		(function(i, s, o, g, r, a, m) {
			i['GoogleAnalyticsObject'] = r;
			i[r] = i[r] || function() {
				(i[r].q = i[r].q || []).push(arguments)
			}, i[r].l = 1 * new Date();
			a = s.createElement(o), m = s.getElementsByTagName(o)[0];
			a.async = 1;
			a.src = g;
			m.parentNode.insertBefore(a, m)
		})(window, document, 'script', '//www.google-analytics.com/analytics.js',
				'ga');
	
		ga('create', 'UA-34232738-1', 'auto');
		ga('set', 'anonymizeIp', true);
		ga('send', 'pageview');
	</script>
	
	<script
		src="${pageContext.request.contextPath}/resources/assets/js/jquery.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/assets/js/lity.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/assets/js/prism.js"></script>
	
	
	<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!--[if lt IE 9]>
		      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
		      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
		    <![endif]-->
	<!-- ######### PARTE DEL INCLUDE  #########  } -->
	
	<!-- Title -->
	<title><tiles:insertAttribute name="title" /></title>
	
	<!-- Extra header -->
</head>
<body>

	<section id="container" >
		<!-- **********************************************************************************************************************************************************
	      TOP BAR CONTENT & NOTIFICATIONS
	      *********************************************************************************************************************************************************** -->
	      <!--header start-->
	       <header class="header black-bg">
	       		<tiles:insertAttribute name="header" />
	       </header>
	      <!--header end-->
	      
	     <!-- **********************************************************************************************************************************************************
	      MAIN SIDEBAR MENU
	      *********************************************************************************************************************************************************** -->
		<!--sidebar start-->
		<aside>
			<tiles:insertAttribute name="menu" />
		</aside>
		<!-- sidebar end-->
	     
	    <!-- **********************************************************************************************************************************************************
	      MAIN CONTENT
	      *********************************************************************************************************************************************************** -->
		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">
				<tiles:insertAttribute name="body" />
			</section>
		</section>
		
		<!--footer start-->
		<footer class="site-footer">
			<tiles:insertAttribute name="footer" />
		</footer>
	      
	</section>
	
	<tiles:insertAttribute name="scriptsfinales" />
	
</body>
</html>