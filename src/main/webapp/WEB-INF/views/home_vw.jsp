<%@ include file="/WEB-INF/views/include.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home - <fmt:message key="profesor.app.home.title" /></title>
<%@ include file="/WEB-INF/views/assets_header.jsp"%>
</head>
<body>

	<div class="container">

		<div class="masthead">
			<nav>
			<ul class="nav nav-justified">
				<li class="active scroll"><a href="#">Nosotros</a></li>
				<li><a class="scroll" href="#mision-div">Misi&oacute;n</a></li>
				<li><a class="scroll" href="#vision-div">Visi&oacute;n</a></li>
				<li><a class="scroll" href="#">Historia</a></li>
				<li><a class="scroll" href="#">Contacto</a></li>
				<li><a href="#">Login</a></li>
			</ul>
			</nav>
		</div>

		<!-- Jumbotron -->
		<div class="jumbotron">
			<h1>CEC Sur Bachilleres</h1>
			<img alt=""
				src="${pageContext.request.contextPath}/resources/img/logo_cecsur.png">
			<p class="lead">Cras justo odio, dapibus ac facilisis in, egestas
				eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris
				condimentum nibh, ut fermentum massa justo sit amet.</p>
		</div>


		<!-- Example row of columns -->
		<div class="row">
			<div class="col-lg-4">
				<h2>Safari bug warning!</h2>
				<p class="text-danger">As of v9.1.2, Safari exhibits a bug in
					which resizing your browser horizontally causes rendering errors in
					the justified nav that are cleared upon refreshing.</p>
				<p>Donec id elit non mi porta gravida at eget metus. Fusce
					dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
					ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
					magna mollis euismod. Donec sed odio dui.</p>
				<p>
					<a class="btn btn-primary" href="#" role="button">View details
						&raquo;</a>
				</p>
			</div>
			<div class="col-lg-4">
				<div id="mision-div">
					<h2>Misi&oacute;</h2>
					<p>Donec id elit non mi porta gravida at eget metus. Fusce
						dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
						ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
						magna mollis euismod. Donec sed odio dui.</p>
					<p>
						<a class="btn btn-primary" href="#" role="button">View details
							&raquo;</a>
					</p>
				</div>

				<div id="vision-div">
					<h2>Visi&oacute;</h2>
					<p>Donec id elit non mi porta gravida at eget metus. Fusce
						dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh,
						ut fermentum massa justo sit amet risus. Etiam porta sem malesuada
						magna mollis euismod. Donec sed odio dui.</p>
					<p>
						<a class="btn btn-primary" href="#" role="button">View details
							&raquo;</a>
					</p>
				</div>
			</div>
			<div class="col-lg-4">
				<h2>Heading</h2>
				<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in,
					egestas eget quam. Vestibulum id ligula porta felis euismod semper.
					Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum
					nibh, ut fermentum massa.</p>
				<p>
					<a class="btn btn-primary" href="#" role="button">View details
						&raquo;</a>
				</p>
			</div>
		</div>

		<!-- Site footer -->
		<footer class="footer">
		<p>&copy; 2016 CEC SUR Bachilleres.</p>
		</footer>

	</div>
	<!-- /container -->
	<%@ include file="/WEB-INF/views/assets_foot.jsp"%>


	<script src="${pageContext.request.contextPath}/resources/js/home.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			efScrollDown();
		});
	</script>
</body>
</html>