<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<h2>Bem vindo ao nosso gerenciador de empresas!</h2>
	<c:if test="${not empty usuarioLogado}">
	 	E-mail: ${usuarioLogado.getEmail()}
	</c:if>
	<c:if test="${empty usuarioLogado}">
		<form action="executa" method="post">
			<input type="hidden" name="tarefa" value="Login">
			<p>Efetuar Login</p>
			E-mail: <input type="email" name="email" /> Senha: <input
				type="password" name="senha" /> <input type="submit" name="Enviar"
				value="logar" />
		</form>
	</c:if>

	<form action="executa" method="post">
		<input type="hidden" name="tarefa" value="CadastrarEmpresa">
		<p>Cadastro de empresas:</p>
		Nome: <input type="text" name="nome" /> <input type="submit"
			name="Enviar" />
	</form>

	<form action="executa" method="post">
		<input type="hidden" name="tarefa" value="BuscaEmpresa">
		<p>Buscar Empresas:</p>
		Nome:<input type="text" name="filtro" /> <input type="submit"
			name="Buscar" value="Buscar" />
	</form>
	<br />
	<br />

	<form action="executa" method="post">
		<input type="hidden" name="tarefa" value="Logout">
		<input type="submit" name="Deslogar" value="Deslogar" />
	</form>

</body>
</html>