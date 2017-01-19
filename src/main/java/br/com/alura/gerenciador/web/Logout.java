package br.com.alura.gerenciador.web;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Tarefa {

	@Override
	public String executar(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		session.removeAttribute("usuarioLogado");
		return "/WEB-INF/paginas/logout.jsp";
	}
}
