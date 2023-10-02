package gerenciadorservlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Avanade");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Microsoft");
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
		
	}
	

	public void adicionar(Empresa empresa) {
		
		listaEmpresas.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.listaEmpresas;
	}
}
