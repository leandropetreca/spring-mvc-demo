<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>Registro de Clientes</title>
	<style type="text/css">
		.error{color:red}
	</style>
</head>
<body>

<form:form action="processForm" modelAttribute="cliente">
	<p>Primeiro Nome: <form:input path="firstName"/></p>
	<p>Sobrenome(*): <form:input path="lastName"/> <form:errors path="lastName" cssClass="error" /></p>
	

<input type="submit" value="Enviar">


 </form:form>

</body>
</html>
