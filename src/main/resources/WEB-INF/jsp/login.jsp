
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>My Awesome Login Page</title>
    <link rel="stylesheet" href="../static/assets/css/login.css">
</head>

<!--Coded with love by Mutiullah Samim-->
<body>

<div class="form-structor">
	<div class="signup">
		<h2 class="form-title" id="signup"><span>or</span>Sign up</h2>
		<div class="form-holder">
			<input type="text" class="input" placeholder="Name" />
			<input type="email" class="input" placeholder="Email" />
			<input type="password" class="input" placeholder="Password" />
		</div>
		<button class="submit-btn">Sign up</button>
	</div>
	<div class="login slide-up">
		<div class="center">
			<h2 class="form-title" id="login"><span>or</span>Log in</h2>
			<div class="form-holder">
				<c:url var="add_User_url" value="/user/addUser"/>
				<form:form action="${add_User_url}" method="post" modelAttribute="User">
					<form:label path="correo">Correo:</form:label>
					<input type="email" class="input" placeholder="Email" path="correo"/>
					<form:label path="nombre">Nombre:</form:label>
					<input type="text" class="input" placeholder="Nombre" path="nombre"/>
					<form:label path="documento">Documento:</form:label>
					<input type="text" class="input" placeholder="Documento" path="documento"/>
					<form:label path="telefono">Telefono:</form:label>
					<input type="text" class="input" placeholder="Telefono" path="telefono"/>
					<form:label path="direccion">Dijspreccion:</form:label>
					<input type="text" class="input" placeholder="Direccion" path="direccion"/>
					<form:label path="contrasena">Contraseña:</form:label>
					<input type="password" class="input" placeholder="ContraseÃ±a" path="contrasena"/>
				</form:form>
			</div>
			<button class="submit-btn">Log in</button>
			
		</div>
	</div>
</div>

<script src="../static/assets/js/logreg.js"></script>
</body>
</html>
