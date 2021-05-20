package br.com.pip.gerenciador;

import java.io.IOException;

import br.com.pip.gerenciador.bd.Banco;
import br.com.pip.gerenciador.modelo.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/editaEmpresa")
public class MostraEmpresaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Banco banco = new Banco();
		Empresa empresa = banco.buscar(id);
		
		if (empresa == null)
			throw new ServletException("Empresa não encontrada!");
		
		RequestDispatcher rd = request.getRequestDispatcher("/EditarEmpresa.jsp");
		request.setAttribute("empresa", empresa);
		rd.forward(request, response);
	}

}
