package br.com.alura.gerenciador.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

public class CadastrarEmpresa implements Tarefa{

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) {
		String nome = req.getParameter("nome");
		Empresa empresa = new Empresa(nome);
		EmpresaDAO bancoDeEmpresas = new EmpresaDAO();
		bancoDeEmpresas.adiciona(empresa);
		return "/WEB-INF/paginas/novaEmpresa.jsp";
	}
}
