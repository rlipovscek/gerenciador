<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<c:if test="${not empty usuarioLogado}">
		Usu�rio ${usuarioLogado.getEmail()} logado com sucesso!
	</c:if>
	<c:if test="${empty usuarioLogado}">
		Usu�rio invalido!
	</c:if>
		

	
</body>
</html>