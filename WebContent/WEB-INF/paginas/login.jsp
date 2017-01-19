<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<c:if test="${not empty usuarioLogado}">
		Usuário ${usuarioLogado.getEmail()} logado com sucesso!
	</c:if>
	<c:if test="${empty usuarioLogado}">
		Usuário invalido!
	</c:if>
		

	
</body>
</html>