package br.com.pip.gerenciador.bd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.pip.gerenciador.modelo.Empresa;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static int nextId = 1;
	
	static {
		Banco banco = new Banco();
		
		Empresa e1 = new Empresa();
		e1.setNome("Kurko");
		e1.setCnpj("Nindo");
		banco.adiciona(e1);
		
		Empresa e2 = new Empresa();
		e2.setNome("Zimtom");
		e2.setCnpj("Curújo");
		banco.adiciona(e2);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(nextId++);
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return lista;
	}

	public void remove(int id) {
		lista.removeIf((p) -> p.getId() == id);
	}
	
	public Empresa buscar(int id) {
		Optional<Empresa> search = lista.stream().filter((p) -> p.getId() == id).findAny();
		return search.orElse(null);
	}

}
