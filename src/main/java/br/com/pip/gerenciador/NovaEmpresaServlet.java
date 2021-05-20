package br.com.pip.gerenciador;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.pip.gerenciador.bd.Banco;
import br.com.pip.gerenciador.modelo.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		EmpresaForm form = new EmpresaForm();
		form.parseData(request);
		Empresa empresa = form.getDados();
		
		if (!empresa.getNome().equals("") && !empresa.getCnpj().equals("")) {
			Banco banco = new Banco();
			banco.adiciona(empresa);
		}
		
		System.out.println("cadastro porra nenhuma");
		
		/*
		// Chamar o JSP
		RequestDispatcher rd = request.getRequestDispatcher("/NovaEmpresaCriada.jsp");
		request.setAttribute("nomeEmpresa", nome);
		rd.forward(request, response);
		*/
		
		response.sendRedirect("listaEmpresas");
	}

}
