<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

<%@ include file="/WEB-INF/views/include.jsp"%>

<title><fmt:message key="home.titulo.escuela"/></title>

</head>

<body>

	<section id="container">
		<!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
		<!--header start-->
		<header class="header black-bg">
			<div class="sidebar-toggle-box">
				<div class="fa fa-bars tooltips" data-placement="right"
					data-original-title="Toggle Navigation"></div>
			</div>
			<!--logo start-->
			<a href="index.html" class="logo"><b><fmt:message key="home.titulo.escuela"/></b></a>
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
		</header>
		<!--header end-->

		<!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
		<!--sidebar start-->
		<aside>
			<div id="sidebar" class="nav-collapse ">
				
				<ul class="sidebar-menu" id="nav-accordion">

					<p class="centered">
						<a href="profile.html">
						<img src="${pageContext.request.contextPath}/resources/assets/img/ui-sam.jpg"
							class="img-circle" width="60"></a>
					</p>
					<h5 class="centered"><fmt:message key="home.titulo.escuela" /></h5>

					<li class="mt">
						<a class="" href="index.html"> 
							<i class="fa"><span class="glyphicon glyphicon-edit"></span> </i> 
							<span><fmt:message key="home.app.lb.registro" /></span>
						</a>
					</li>

					<li class="mt">
						<a href="#"> 
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
		</aside>
		<!-- sidebar end-->

		<!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">

				<div class="row">
					<div class="col-lg-9 main-chart">


						<div class="row mt">
							<!-- SERVER STATUS PANELS -->

							<div class="col-md-4 col-sm-4 mb">
								<div class="white-panel pn">
									<div class="white-header">
										<h5>Educar para la vida</h5>
									</div>
									<div class="row">
										<div class="col-sm-4 col-xs-4 goleft">
											<p>
												<i class="fa fa-heart"></i> 122
											</p>
										</div>
										<div class="col-sm-4 col-xs-4"></div>
									</div>
									<div class="centered">

										<a class="btn"
											href="https://www.youtube.com/watch?v=hAvPyIfWLPg" data-lity>
											<img src="${pageContext.request.contextPath}/resources/assets/img/2.png" width="200px" height="100px" />
										</a>
									</div>
								</div>
							</div>
							<!-- /col-md-4 -->
							<div class="col-md-4 col-sm-4 mb">
								<div class="white-panel pn">
									<div class="white-header">
										<h5>Importancia de la Educación</h5>
									</div>
									<div class="row">
										<div class="col-sm-4 col-xs-4 goleft">
											<p>
												<i class="fa fa-heart"></i> 122
											</p>
										</div>
										<div class="col-sm-4 col-xs-4"></div>
									</div>
									<div class="centered">

										<a class="btn"
											href="https://www.youtube.com/watch?v=A3fABH5YeOU" data-lity>
											<img src="${pageContext.request.contextPath}/resources/assets/img/1.png" width="200px" height="100px" />
										</a>
									</div>
								</div>
							</div>
							<!-- /col-md-4 -->
							<div class="col-md-4 col-sm-4 mb">
								<div class="white-panel pn">
									<div class="white-header">
										<h5>Competencias para Educación</h5>
									</div>
									<div class="row">
										<div class="col-sm-12 col-xs-12 goleft">
											<p>
												<i class="fa fa-heart"></i> 122
											</p>
										</div>
										<div class="col-sm-12 col-xs-12"></div>
									</div>
									<div class="centered">
										<a class="btn"
											href="https://www.youtube.com/watch?v=oQlOb63-2HQ" data-lity><img
											src="${pageContext.request.contextPath}/resources/assets/img/3.png" width="200px" height="100px" /></a>
									</div>
								</div>
							</div>
							<!-- /col-md-4 -->




						</div>
						<!-- /row -->


						<div class="row">
							<!-- TWITTER PANEL -->


							<div class="col-md-6 col-sm-6 mb">
								<!-- REVENUE PANEL -->
								<div class="darkblue-panel pn">
									<div class="darkblue-header">
										<h5>Misi&oacute;n</h5>
									</div>
									<p class="mt" style="text-align: justify;">
										<b><fmt:message key="home.text.mision" /></b>
									</p>
								</div>
							</div>
							<!-- /col-md-4 -->
							<div class="col-md-6 col-sm-6 mb">
								<!-- REVENUE PANEL -->
								<div class="darkblue-panel pn">
									<div class="darkblue-header">
										<h5>Visi&oacute;n</h5>
									</div>
									<p class="mt" style="text-align: justify;">
										<b><fmt:message key="home.text.vision" /></b>
									</p>
								</div>
							</div>
							<!-- /col-md-4 -->

							<div class="col-md-12 col-sm-12 mb">
								<!-- REVENUE PANEL -->
								<div class="darkblue-panel pn">
									<div class="darkblue-header">
										<h5>Valores</h5>
									</div>
									<p class="mt" style="text-align: justify;">
										<b>Los valores y la educación están ligados, y son
											escenciales para el cumplimiento de la misión y visión de la
											Secretaría de Educación, establecer de manera interna y
											externa el compromiso de todos los actores del sector
											educativo de conocerlos, difundirlos, apropiarse de ellos,
											asumirlos y llevarlos a la praxis en el quehacer diario
											dentro y fuera de las instituciones educativas.</b>
									</p>
								</div>
							</div>
							<!-- /col-md-4 -->



						</div>
						<!-- /row -->

						<div class="row mt">
							<!--CUSTOM CHART START -->

							<!--custom chart end-->
						</div>
						<!-- /row -->

					</div>
					<!-- /col-lg-9 END SECTION MIDDLE -->


					<!-- **********************************************************************************************************************************************************
      RIGHT SIDEBAR CONTENT
      *********************************************************************************************************************************************************** -->

					<div class="col-lg-3 ds">
					
					<!-- ###### NOTICIAS ####### -->
						<h3>Noticias</h3>
					
						<c:forEach items="${model.noticias}" var="n">
							<!-- First Action -->
							<div class="desc">
								<div class="thumb">
									<span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
								</div>
								<div class="details">
									<p>
										<muted>Vencimiento:<c:out value="${n.strFechaFin}"/></muted>
										<br /> <a href="#"><c:out value="${n.titulo}"/></a>
										</br><c:out value="${n.contenido}"/><br />
									</p>
								</div>
							</div>
					      
					    </c:forEach>
					    

						<!-- ### CURSOS #### -->
						<h3>Cursos</h3>
						
						<c:forEach items="${model.cursos}" var="c">
							<!-- First Action -->
							<div class="desc">
								<div class="thumb">
									<img class="img-circle" src="${pageContext.request.contextPath}/resources/profesor/perfiles/<c:out value="${c.profesor.urlImg}"/>"
										width="40px" height="40px" align="">
								</div>
								<div class="details">
									<p>
										<a href="#"><c:out value="${c.asignatura}"/></a><br />
										<muted>Profesor - <c:out value="${c.profesor.nombreCompleto}"/></muted>
									</p>
								</div>
							</div>
					      
					    </c:forEach>
						
						
						<h3>Calendario</h3>
						<!-- CALENDAR-->
						<div id="calendar" class="mb">
							<div class="panel green-panel no-margin">
								<div class="panel-body">
									<div id="date-popover" class="popover top"
										style="cursor: pointer; disadding: block; margin-left: 33%; margin-top: -50px; width: 175px;">
										<div class="arrow"></div>
										<h3 class="popover-title" style="disadding: none;"></h3>
										<div id="date-popover-content" class="popover-content"></div>
									</div>
									<div id="my-calendar"></div>
								</div>
							</div>
						</div>
						<!-- / calendar -->

					</div>
					<!-- /col-lg-3 -->
				</div>
				<! --/row -->
			</section>
		</section>

		<!--main content end-->
		<!--footer start-->
		<footer class="site-footer">
			<div class="text-center">
				<fmt:message key="home.titulo.escuela" /> 
				<a href="index.html#" class="go-top"> <i
					class="fa fa-angle-up"></i>
				</a>
			</div>
		</footer>
		<!--footer end-->
	</section>

	
<script type="text/javascript">
var eventsInline = ${model.eventoJsonArray};
</script>

<%@ include file="/WEB-INF/views/footer.jsp"%>



</body>
</html>
