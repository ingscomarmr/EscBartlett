<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div id="sidebar" class="nav-collapse ">
	<ul class="sidebar-menu" id="nav-accordion">
		<p class="centered">
			<a href="profile.html">
			<img src="${pageContext.request.contextPath}/resources/assets/img/ui-sam.jpg"
					class="img-circle" width="60"></a>
			</p>
			<h5 class="centered"><fmt:message key="home.titulo.escuela" /></h5>
	
			<li class="mt">
				<a class="" href="#"> 
					<i class="fa"><span class="glyphicon glyphicon-edit"></span> </i> 
					<span><fmt:message key="home.app.lb.registro" /></span>
				</a>
			</li>
	
			<li class="mt">
				<a href="login.htm"> 
					<i class="fa"> <span class="glyphicon glyphicon-user"></span></i>    
					<span><fmt:message key="home.app.lb.login" /></span>
				</a>
			</li>
	
			<li class="mt">
				<a href="#"> 
					<i class="fa">
						<span class="glyphicon glyphicon-copyright-mark"></span> 
					</i> 
					<span>Power by Gestu@pp</span>
				</a>
			</li>
	</ul>
</div>