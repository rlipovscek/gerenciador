<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	Resultado da busca:
	<br />
	<ul>
		<c:forEach var="empresa" items="${empresas}">
			<li>${empresa.getId()}: ${empresa.getNome()}</li>
			<br />
		</c:forEach>
	</ul>
</body>
</html>