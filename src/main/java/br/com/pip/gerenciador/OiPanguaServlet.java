package br.com.pip.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/oi")
public class OiPanguaServlet extends HttpServlet {
	
	public OiPanguaServlet() {
		System.out.println("Criando este trem...");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		try {
			PrintWriter out = resp.getWriter();
			out.print("<meta charset=\"utf-8\">");
			out.print("<h1>Olá panguá</h1>");
			System.out.println("Pronto, uai!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
