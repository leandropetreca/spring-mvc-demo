<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
	<title>Confirmação de Matricula</title>
</head>
<body>

Estudante confirmado: ${estudante.firstName} ${estudante.lastName}<br>
Sexo: ${estudante.sexo}<br>
Pais: ${estudante.pais}<br>
Curso: ${estudante.curso}<br>

Sistema:
<ul>
<c:forEach var="sis" items="${estudante.sistema}">
<li>${sis}</li>
</c:forEach>

</ul> 

	
</body>
</html>
