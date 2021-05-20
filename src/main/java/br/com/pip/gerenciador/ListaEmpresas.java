package br.com.pip.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;

import br.com.pip.gerenciador.bd.Banco;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListaEmpresas extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		Banco banco = new Banco();
		RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresas.jsp");
		request.setAttribute("listaEmpresas", banco.getEmpresas());
		rd.forward(request, response);
	}

}
