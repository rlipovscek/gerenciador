package br.com.alura.gerenciador.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class Cookies extends HttpServlet {
	
	private Cookie cookieLocal;
	
	public void setCookie(Cookie cookie){
		this.cookieLocal =cookie;
	}
	
	public Cookie getCookie(HttpServletRequest req){
		Cookie[] cookies = req.getCookies();
		if(cookies==null)
			return null;
		for(Cookie cookie : cookies){
			if(cookie.getName().equals("usuario.logado")){
				return cookie;
		}
	}
		return null;
	}

}
