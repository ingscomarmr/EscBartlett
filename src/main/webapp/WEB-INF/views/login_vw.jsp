<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<br /> <br />
			<h4 style="border-bottom: 1px solid #c5c5c5;">
				<i class="glyphicon glyphicon-user"> </i>
				<fmt:message key="login.title.iniciar" />
			</h4>
			<div style="padding: 20px;" id="form-olvidado">
				<form accept-charset="UTF-8" role="form" id="login-form"
					method="POST" action="${contextPath}/logon.htm">
					<fieldset>
						<div class="form-group input-group">
							<span class="input-group-addon"> @ </span> <input
								class="form-control"
								placeholder="<fmt:message key="login.lb.usuario" />"
								name="username" type="email" required="" autofocus="">
						</div>
						<div class="form-group input-group">
							<span class="input-group-addon"> <i
								class="glyphicon glyphicon-lock"> </i>
							</span> <input class="form-control"
								placeholder="<fmt:message key="login.lb.password" />"
								name="password" type="password" value="" required="">
								<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						</div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary btn-block">
								<fmt:message key="login.lb.btn.login" />
							</button>
							<p class="help-block">
								<a class="pull-right text-muted" href="#" id="olvidado"> <small><fmt:message
											key="login.lb.olvidado" /></small>
								</a>
							</p>
						</div>
					</fieldset>
				</form>
			</div>
			<div style="display: none;" id="form-olvidado">
				<h4 class="">
					<fmt:message key="login.lb.olvidado" />
				</h4>
				<form accept-charset="UTF-8" role="form" id="login-recordar"
					method="post">
					<fieldset>
						<span class="help-block"> 
							<fmt:message key="login.lb.recuperar.ayuda" />
						</span>
						<div class="form-group input-group">
							<span class="input-group-addon"> @ </span> <input
								class="form-control" placeholder="<fmt:message key="login.lb.usuario" />" name="email"
								type="email" required="">
						</div>
						<button type="submit" class="btn btn-primary btn-block"
							id="btn-olvidado"><fmt:message key="login.lb.btn.olvidado" /></button>
						<p class="help-block">
							<a class="text-muted" href="#" id="acceso">
								<small>
									<fmt:message key="login.title.iniciar" />
								</small>
							</a>
						</p>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</div>

<script>
	$(document).ready(function() {
		$('#olvidado').click(function(e) {
			e.preventDefault();
			$('div#form-olvidado').toggle('500');
		});
		$('#acceso').click(function(e) {
			e.preventDefault();
			$('div#form-olvidado').toggle('500');
		});
	});
</script>