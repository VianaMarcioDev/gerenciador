package gerenciadorservlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Empresa> listaEmpresas = new ArrayList<>();

	public void adicionar(Empresa empresa) {
		
		listaEmpresas.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.listaEmpresas;
	}
}
