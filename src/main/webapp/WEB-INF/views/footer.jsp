
<!-- ######### PARTE DEL FOOTER  ######### {-->
<!-- js placed at the end of the document so the pages load faster -->
	<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/jquery-1.8.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript"
		src="${pageContext.request.contextPath}/resources/assets/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.scrollTo.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.nicescroll.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.sparkline.js"></script>


	<!--common script for all pages-->
	<script src="${pageContext.request.contextPath}/resources/assets/js/common-scripts.js"></script>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/assets/js/gritter/js/jquery.gritter.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/gritter-conf.js"></script>

	<!--script for this page-->
	<script src="${pageContext.request.contextPath}/resources/assets/js/sparkline-chart.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/zabuto_calendar.js"></script>

	<script src="${pageContext.request.contextPath}/resources/assets/event-calendar/jquery.eventCalendar.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/event-calendar/moment.js"></script>
	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							var unique_id = $.gritter
									.add({
										// (string | mandatory) the heading of the notification
										title : 'Bienvenido',
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

	
	
        $(document).ready(function () {
            $("#date-popover").popover({html: true, trigger: "manual"});
            $("#date-popover").hide();
            $("#date-popover").click(function (e) {
                $(this).hide();
            });
            
            $("#date-popover").click();

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
	
	
<!-- ######### PARTE DEL FOOTER  ######### }-->