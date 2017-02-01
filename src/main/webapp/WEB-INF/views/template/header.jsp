<!-- Soy el header -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="sidebar-toggle-box">
	<div class="fa fa-bars tooltips" data-placement="right"
		data-original-title="Toggle Navigation"></div>
</div>
<!--logo start-->
<a href="index.html" class="logo"><b>
<fmt:message key="home.titulo.escuela" /></b></a>
<!--logo end-->
<div class="nav notify-row" id="top_menu">
	<!--  notification start -->
	<ul class="nav top-menu">
		<!-- settings start -->

		<!-- settings end -->
		<!-- inbox dropdown start
					<li id="header_inbox_bar" class="dropdown"><a
						data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
							<i class="fa fa-envelope-o"></i> <span class="badge bg-theme">5</span>
					</a>
						<ul class="dropdown-menu extended inbox">
							<div class="notify-arrow notify-arrow-green"></div>
							<li>
								<p class="green">You have 5 new messages</p>
							</li>
							<li>
								<a href="index.html#"> <span class="photo"><img
										alt="avatar"
										src="${pageContext.request.contextPath}/resources/assets/img/User_01.png"></span>
									<span class="subject"> <span class="from">Juan
											Jiménez</span> <span class="time">Just now</span>
									</span> <span class="message"> Hi mate, how is everything? </span>
								</a>
							</li>
							<li><a href="index.html#"> <span class="photo"><img
										alt="avatar"
										src="${pageContext.request.contextPath}/resources/assets/img/User_03.png"></span>
									<span class="subject"> <span class="from">Predro
											Martinez</span> <span class="time">40 mins.</span>
								</span> <span class="message"> Hi, I need your help with this. </span>
							</a></li>
							<li><a href="index.html#"> <span class="photo"><img
										alt="avatar"
										src="${pageContext.request.contextPath}/resources/assets/img/User_02.png"></span>
									<span class="subject"> <span class="from">Maria
											Romero</span> <span class="time">2 hrs.</span>
								</span> <span class="message"> Love your new Dashboard. </span>
							</a></li>

							<li><a href="index.html#">See all messages</a></li>
						</ul></li>
					inbox dropdown end -->

	</ul>
	<!--  notification end -->
</div>
<!-- 
<div class="top-menu">
	<ul class="nav pull-right top-menu">
		<li><a class="logout" href="login.html"> <span class="glyphicon glyphicon-user"></span> <fmt:message key="home.app.lb.login" /></a></li>
		<li><a class="logout" href="login.html"><span class="glyphicon glyphicon-edit"></span> <fmt:message key="home.app.lb.registro" /></a></li>
	</ul>
</div>
-->