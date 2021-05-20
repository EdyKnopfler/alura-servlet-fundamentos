package br.com.pip.gerenciador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.pip.gerenciador.modelo.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

public class EmpresaForm {
	
	private Empresa dados;
	
	public EmpresaForm() {
		this.dados = new Empresa();
	}

	public EmpresaForm(Empresa empresa) {
		this.dados = empresa;
	}

	public void parseData(HttpServletRequest request) throws ServletException {
		String nome = request.getParameter("nome");
		String cnpj = request.getParameter("cnpj");
		String dataAberturaStr = request.getParameter("dataAbertura");
		Date dataAbertura;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			dataAbertura = sdf.parse(dataAberturaStr);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		dados.setNome(nome);
		dados.setCnpj(cnpj);
		dados.setDataAbertura(dataAbertura);
	}

	public void parseId(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		dados.setId(id);
	}
	
	public Empresa getDados() {
		return dados;
	}

	public void setDados(Empresa empresa) {
		this.dados = empresa;
	}
	
}