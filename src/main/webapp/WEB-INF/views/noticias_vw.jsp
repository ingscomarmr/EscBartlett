<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div style="margin: 10px;">
	<h4>List of Persons</h4>
	<table style="width: 600px" class="reference">
		<tbody>
			<tr>
				<th>ID</th>
				<th>Name</th>
				
			</tr>
			<c:forEach var="n" items="${requestScope.noticias}"
				varStatus="loopCounter">
				<tr>
					<td><c:out value="${n.noticiaId}" /></td>
					<td><c:out value="${n.titulo}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>