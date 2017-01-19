package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;

@WebFilter(urlPatterns = "/*")
public class FiltroDeAuditoria implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			HttpServletRequest rqs = (HttpServletRequest) request;
			String uri = rqs.getRequestURI();
			
			String usuario = getNome(rqs);
			System.out.println("Usuário "+usuario+" acessou a URI "+ uri);
			chain.doFilter(request, response);
			
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}
	
	private String getNome(HttpServletRequest rq){
		HttpSession session = rq.getSession();
		Usuario usuario =(Usuario)session.getAttribute("usuarioLogado");
		
			if(usuario == null){
				return "<Deslogado>";
			}
			return usuario.getEmail();
				
	}

}
