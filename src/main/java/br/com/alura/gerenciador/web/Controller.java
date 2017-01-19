package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/executa")
public class Controller extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tarefa = req.getParameter("tarefa");
		if (tarefa == null) {
			throw new IllegalArgumentException("Você não informou uma tarefa!");
		}

		String nomeDaClasse = "br.com.alura.gerenciador.web." + tarefa;
		Class<?> type = null;
		try {
			type = Class.forName(nomeDaClasse);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Tarefa instancia = null;
		try {
			instancia = (Tarefa) type.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		String uri = instancia.executar(req, resp);
		RequestDispatcher dispatcher = req.getRequestDispatcher(uri);
		dispatcher.forward(req, resp);

	}
}
