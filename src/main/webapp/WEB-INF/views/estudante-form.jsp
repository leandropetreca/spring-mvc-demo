<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
	<title>Matricula</title>
</head>
<body>

 <form:form action="processForm" modelAttribute="estudante">
<p>Primeiro Nome: <form:input path="firstName"/></p>
<p>Sobrenome: <form:input path="lastName"/> </p>
<p>
	Sexo: 
	<form:select path="sexo">
		<form:option value="masculino" label="Masculino"></form:option>
		<form:option value="feminino" label="feminino"></form:option>
	</form:select>
</p>
<p>Pais: 
<form:select path="pais">
	<form:options items="${estudante.paisOptions}" />
</form:select>
</p>

<p>Curso escolhido:<br>
	Java <form:radiobutton path="curso" value="Java"/>
	Angular <form:radiobutton path="curso" value="Angular"/>
	PostgreSQL<form:radiobutton path="curso" value="PostgreSQL"/>
</p>

<p>Sistema:<br>
Linux <form:checkbox path="sistema" value="Linux"/> 
OSX <form:checkbox path="sistema" value="OSX"/>
Ruindows <form:checkbox path="sistema" value="Ruindows"/>

</p>
<input type="submit" value="Enviar">


 </form:form>

	
	
	
</body>
</html>
