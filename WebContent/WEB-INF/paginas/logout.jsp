<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<c:if test="${not empty usuarioLogado}">
		Usu�rio ${usuarioLogado.getEmail()} deslogado com sucesso!
	</c:if>
	<c:if test="${empty usuarioLogado}">
		N�o exite usu�rio logado!
	</c:if>
</body>
</html>