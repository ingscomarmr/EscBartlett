<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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

	<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.serializejson.min.js"></script>

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
	
	
	<script type="application/javascript">
        $(document).ready(function () {
            $("#date-popover").popover({html: true, trigger: "manual"});
            $("#date-popover").hide();
            $("#date-popover").click(function (e) {
                $(this).hide();
            });
            
            $("#date-popover").click();        	        	
        });
	</script>	
	
	
<!-- ######### PARTE DEL FOOTER  ######### }-->