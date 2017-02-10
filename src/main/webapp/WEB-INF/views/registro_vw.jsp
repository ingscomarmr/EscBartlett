<!-- #### CONTENIDO DE REGISTRO #### -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container">
	<div class="row">

		<div class="col-md-6 col-md-offset-3">
			<br /> <br />
			
			<!-- SELECCION DE USUARIO PARA REGISTRO -->
			<div style="padding: 20px;" id="form-seleccion">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa"><span class="glyphicon glyphicon-hand-down"></span>
							</i>
							<fmt:message key="registro.titulo.selecciona" />
						</h3>
					</div>
					<div class="panel-body">
						<form accept-charset="UTF-8" role="form" id="login-form"
							method="post">
							<fieldset>
								<div class="form-group">
									<a href="#">
										<button id="profesor-btn" type="submit"
											class="btn btn-success btn-block">
											<fmt:message key="registro.lb.btn.profesor" />
										</button>
									</a>
								</div>
								<div class="form-group">									
										<button id="tutor-btn" class="btn btn-warning btn-block">
											<fmt:message key="registro.lb.btn.padre" />
										</button>									
								</div>
								<div class="form-group">
									
									<button type="button" id="estudiante-btn" class="btn btn-danger btn-block">
										<fmt:message key="registro.lb.btn.estudiante" />
									</button>
									
								</div>
							</fieldset>
						</form>
					</div>
				</div>


			</div>
			<!-- FIN DIV  SELECCION DE REGISTRO -->
			
			<!-- Registro Profesor y tutor-->
			<div style="display: none;" id="form-profesor">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa"><span class="glyphicon glyphicon-hand-down"></span>
							</i>
							<span id="profesor-titulo" style="display: none;"><fmt:message key="registro.titulo.profesor" /></span>
							<span id="tutor-titulo" style="display: none;"><fmt:message key="registro.titulo.tutor" /></span>
						</h3>
					</div>
					<div class="panel-body">
						<div class="alert alert-success" role="alert" style="display: none;" id="alert-success-profesor">							
						</div>
						<div class="alert alert-danger" role="alert" style="display: none;" id="alert-danger-profesor">													
						</div>
						<form accept-charset="UTF-8" role="form" id="profesor"
							method="post" action="registrarUsuario.htm">
							<fieldset>
								<div class="form-group">
									<input type="text" class="form-control" name="nombre"
										id="nombre"
										placeholder="<fmt:message key="registro.lb.nombre" />" required>
								</div>
								<div class="form-group">
									<input type="text" class="form-control" name="apellidoPaterno"
										id="apellidoPaterno"
										placeholder="<fmt:message key="registro.lb.apellido.p" />" required>
								</div>
								<div class="form-group">
									<input type="text" class="form-control" name="apellidoMaterno"
										id="apellidoMaterno"
										placeholder="<fmt:message key="registro.lb.apellido.m" />" required>
								</div>
								<div class="form-group">
									<input type="email" class="form-control" name="usuarioName"
										placeholder="<fmt:message key="registro.lb.correo" />" required>
								</div>
								<div class="form-group">
									<input type="password" class="form-control" name="usuarioPwd"
										placeholder="<fmt:message key="registro.lb.pwd" />" required>
								</div>
								<div class="form-group">
									</label> <input type="password" class="form-control" name="confirmaPwd"
										id="confirma-pwd-profesor"
										placeholder="<fmt:message key="registro.lb.pwd.confirmar" />" required>
								</div>

								<input type="hidden" name="usuarioId" value="0" /> 
								<input type="hidden" name="curp" /> 
								<input type="hidden" name="emailAlternativo" /> 
								<input type="hidden" name="urlImg" />
								<input type="hidden" name="tipoUsuarioId" value="2" />

								<button type="submit" class="btn btn-primary btn-block"
									id="btn-olvidado">
									<fmt:message key="registro.lb.guardar" />
								</button>
								<button id="btn-cancelar-profesor"
									class="btn btn-warning btn-block">
									<fmt:message key="registro.lb.cancelar" />
								</button>
							</fieldset>
						</form>
					</div>
					<!-- div body -->
				</div>
				<!-- div panel -->
			</div>
			<!-- fin registro profesor-->			

			<!-- registro estudiante -->
		  	<div style="display: none;" id="form-estudiante">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h3 class="panel-title">
							<i class="fa"><span class="glyphicon glyphicon-hand-down"></span>
							</i>
							<fmt:message key="registro.titulo.estudiante" />
						</h3>
					</div>
					<div class="panel-body">
						<div class="alert alert-success" role="alert" style="display: none;" id="alert-success-estudiante">							
						</div>
						<div class="alert alert-danger" role="alert" style="display: none;" id="alert-danger-estudiante">													
						</div>
						<form accept-charset="UTF-8" role="form" id="estudiante"
							method="post" action="registrarUsuario.htm">
							<fieldset>
								<div class="form-group">
									<input type="text" class="form-control" name="nombre"
										id="nombre"
										placeholder="<fmt:message key="registro.lb.nombre" />" required>
								</div>
								<div class="form-group">
									<input type="text" class="form-control" name="apellidoPaterno"
										id="apellidoPaterno"
										placeholder="<fmt:message key="registro.lb.apellido.p" />" required>
								</div>
								<div class="form-group">
									<input type="text" class="form-control" name="apellidoMaterno"
										id="apellidoMaterno"
										placeholder="<fmt:message key="registro.lb.apellido.m" />" required>
								</div>
								<div class="form-group">
									<input type="email" class="form-control" name="usuarioName"
										placeholder="<fmt:message key="registro.lb.correo" />" required>
								</div>
								<div class="form-group">
									<input type="text" class="form-control" name="curp"
										placeholder="<fmt:message key="registro.lb.curp" />" required>
								</div>
								<div class="form-group">
									<input type="password" class="form-control" name="usuarioPwd"
										placeholder="<fmt:message key="registro.lb.pwd" />" required>
								</div>
								<div class="form-group">
									</label> <input type="password" class="form-control" name="confirmaPwd"	
										placeholder="<fmt:message key="registro.lb.pwd.confirmar" />" required>
								</div>

								<input type="hidden" name="usuarioId" value="0" /> 								
								<input type="hidden" name="emailAlternativo" /> 
								<input type="hidden" name="urlImg" />
								<input type="hidden" name="tipoUsuarioId" value="3" />

								<button type="submit" class="btn btn-primary btn-block"
									id="btn-guardar-estudiante">
									<fmt:message key="registro.lb.guardar" />
								</button>
								
								<button id="btn-cancelar-estudiante" type="reset"
									class="btn btn-warning btn-block">
									<fmt:message key="registro.lb.cancelar" />
								</button>
								
							</fieldset>
						</form>
					</div>
					<!-- div body -->
				</div>
				<!-- div panel -->
			</div>
			<!-- fin registro estudiante-->								
			
		</div>
		<!-- fin row col 6 -->
	</div>
	<!-- fin row -->
</div>
<!-- fin container -->
<script>
	$(document).ready(function() {

		$('#tutor-btn').click(function(e) {
			e.preventDefault();
			$('#profesor-titulo').hide();
			$('#tutor-titulo').show();
			$("#profesor input[name=tipoUsuarioId]").val(4);
			$('div#form-seleccion').toggle('500');
			$('div#form-profesor').toggle('500');			
		});
		
		$('#profesor-btn').click(function(e) {
			e.preventDefault();
			$('#profesor-titulo').show();
			$('#tutor-titulo').hide();
			$("#profesor input[name=tipoUsuarioId]").val(2);
			$('div#form-seleccion').toggle('500');
			$('div#form-profesor').toggle('500');			
		});

		$('#btn-cancelar-profesor').click(function(e) {
			e.preventDefault();
			$("#alert-success-profesor").html('');
			$("#alert-success-profesor").hide();
			$("#alert-danger-profesor").html('');
			$("#alert-danger-profesor").hide();
			
			$("#profesor").closest('form').find("input[type=text], textarea, input[type=email],input[type=password]").val("");
			$('div#form-profesor').toggle('500');
			$('div#form-seleccion').toggle('500');
		});
						
		$('#profesor').submit(function(evento) {
			$("#alert-danger-profesor").hide();
			$("#alert-success-profesor").hide();
			//datos del formulario profesor enviados como json
			
			var esValido = true;
			
			if($("#profesor input[name=usuarioPwd]").val() !== $("#profesor input[name=confirmaPwd]").val()){
				$("#alert-danger-profesor").html('<b>Las contraseñas no coinciden</b>, por favor verifique que introduce la misma contraseña para los dos campos.');
				$("#alert-danger-profesor").show(300);	
				esValido = false;			
			}

			if(esValido){
				var dataForm = JSON.stringify($("#profesor").serializeJSON());
				$.ajax({
					url : 'registrarGuardar.htm',
					type : 'POST',
					data : dataForm,
					processData : false,
					contentType : "application/json",
					success : function(r) {
						var j = jQuery.parseJSON(r);
						if (j.response) {
							//alert(j.message);
							$("#alert-success-profesor").html(j.message);
							$("#alert-success-profesor").show(500);
							//location.href = r.href;
						} else {
							//alert(j.message);
							$("#alert-danger-profesor").html(j.message);
							$("#alert-danger-profesor").show(500);
						}
					},
					error : function(jqXHR, textStatus, errorThrow) {
						alert(textStatus + ' throw:' + errorThrow);
					}
				});
			}						
			evento.preventDefault();
		});

		$("#estudiante-btn").click(function(e){					
			$('div#form-seleccion').toggle('500');
			$('div#form-estudiante').toggle('500');			
			e.preventDefault();			
		});
		
		$("#btn-cancelar-estudiante").click(function(e){								
			$("#alert-success-estudiante").hide();
			$("#alert-success-estudiante").html('');
			$("#alert-danger-estudiante").hide();
			$("#alert-danger-estudiante").html('');
			$("#estudiante").closest('form').find("input[type=text], textarea, input[type=email],input[type=password]").val("");
			$('div#form-estudiante').toggle('500');
			$('div#form-seleccion').toggle('500');			
			e.preventDefault();
		});
		//form estudiante
		$('#estudiante').submit(function(evento) {
			$("#alert-danger-estudiante").hide();
			$("#alert-success-estudiante").hide();
			//datos del formulario profesor enviados como json
			
			var esValido = true;
			
			if($("#estudiante input[name=usuarioPwd]").val() !== $("#estudiante input[name=confirmaPwd]").val()){
				$("#alert-danger-estudiante").html('<b>Las contraseñas no coinciden</b>, por favor verifique que introduce la misma contraseña para los dos campos.');
				$("#alert-danger-estudiante").show(300);	
				esValido = false;			
			}

			if(esValido){
				var dataForm = JSON.stringify($("#estudiante").serializeJSON());
				$.ajax({
					url : 'registrarGuardar.htm',
					type : 'POST',
					data : dataForm,
					processData : false,
					contentType : "application/json",
					success : function(r) {
						var j = jQuery.parseJSON(r);
						if (j.response) {
							//alert(j.message);
							$("#alert-success-estudiante").html(j.message);
							$("#alert-success-estudiante").show(500);
							//location.href = r.href;
						} else {
							//alert(j.message);
							$("#alert-danger-estudiante").html(j.message);
							$("#alert-danger-estudiante").show(500);
						}
					},
					error : function(jqXHR, textStatus, errorThrow) {
						alert(textStatus + ' throw:' + errorThrow);
					}
				});
			}						
			evento.preventDefault();
		});
		
	});
</script>