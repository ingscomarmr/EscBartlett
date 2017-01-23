<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


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