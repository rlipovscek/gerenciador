<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<c:if test="${not empty usuarioLogado}">
		Usuário ${usuarioLogado.getEmail()} deslogado com sucesso!
	</c:if>
	<c:if test="${empty usuarioLogado}">
		Não exite usuário logado!
	</c:if>
</body>
</html>