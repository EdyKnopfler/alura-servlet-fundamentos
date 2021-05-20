package br.com.pip.gerenciador;

import java.io.IOException;

import br.com.pip.gerenciador.bd.Banco;
import br.com.pip.gerenciador.modelo.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpresaForm formBusca = new EmpresaForm();
		formBusca.parseId(request);
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscar(formBusca.getDados().getId());
		
		EmpresaForm formEdicao = new EmpresaForm(empresa);
		formEdicao.parseData(request);
		
		response.sendRedirect("listaEmpresas");
	}

}
