package br.com.pip.gerenciador;

import java.io.IOException;

import br.com.pip.gerenciador.bd.Banco;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
	
@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpresaForm form = new EmpresaForm();
		form.parseId(request);
		
		Banco banco = new Banco();
		banco.remove(form.getDados().getId());
		response.sendRedirect("listaEmpresas");
	}

}
