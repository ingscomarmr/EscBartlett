<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
<!-- /row -->

<script type="text/javascript">
var eventsInline = ${model.eventoJsonArray};
</script>

<script type="text/javascript">
	$(document)
			.ready(
					function() {
						var unique_id = $.gritter
								.add({
									// (string | mandatory) the heading of the notification
									title : 'Bienvenido a <fmt:message key="home.titulo.escuela" />',
									// (string | mandatory) the text inside the notification
									text : 'Aquí encontraras todas las novedades de nuestra escuela',
									// (string | optional) the image to display on the left
									image : '${pageContext.request.contextPath}/resources/assets/img/ui-sam.jpg',
									// (bool | optional) if you want it to fade out on its own or just sit there
									sticky : true,
									// (int | optional) the time you want it to be alive for before fading out
									time : '',
									// (string | optional) the class name you want to apply to that specific message
									class_name : 'my-sticky-class'
								});

						return false;
					});
</script>

<script type="application/javascript">
$(document).ready( function() {
			
       	$("#my-calendar").eventCalendar({
       		jsonData: eventsInline,
       		dateFormat: 'dddd MM-D-YYYY',
       		locales: {
       		    locale: "es",
       			monthNames: [ "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
       				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" ],
       			dayNames: [ 'Domingo','Lunes','Martes','Miércoles',
       				'Jueves','Viernes','Sabado' ],
       			dayNamesShort: [ 'Dom','Lun','Mar','Mie', 'Jue','Vie','Sab' ],
       			txt_noEvents: "No hay eventos para este periodo",
       			txt_SpecificEvents_prev: "",
       			txt_SpecificEvents_after: "eventos:",
       			txt_next: "siguiente",
       			txt_prev: "anterior",
       			txt_NextEvents: "Próximos eventos:",
       			txt_GoToEventUrl: "Ir al evento",
       			moment: {
       		        "months" : [ "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
       		                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" ],
       		        "monthsShort" : [ "Ene", "Feb", "Mar", "Abr", "May", "Jun",
       		                "Julio", "Ago", "Sep", "Oct", "Nov", "Dic" ],
       		        "weekdays" : [ "Domingo","Lunes","Martes","Miércoles",
       		                "Jueves","Viernes","Sabado" ],
       		        "weekdaysShort" : [ "Dom","Lun","Mar","Mie",
       		                "Jue","Vie","Sab" ],
       		        "weekdaysMin" : [ "Do","Lu","Ma","Mi","Ju","Vi","Sa" ],
       		        "longDateFormat" : {
       		            "LT" : "H:mm",
       		            "LTS" : "LT:ss",
       		            "L" : "DD/MM/YYYY",
       		            "LL" : "D [de] MMMM [de] YYYY",
       		            "LLL" : "D [de] MMMM [de] YYYY LT",
       		            "LLLL" : "dddd, D [de] MMMM [de] YYYY LT"
       		        },
       		        "week" : {
       		            "dow" : 1,
       		            "doy" : 4
       		        }
       		    }
       		}
       	});
       	
});
</script>	
	
