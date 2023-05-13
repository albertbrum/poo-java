package empresa;

import java.util.ArrayList;

public class Cofrinho {


	ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();
	
	public void adicionar(Moeda M) {
		listaMoeda.add(M);
	}
	
	public void remover(Moeda M) {
		listaMoeda.remove(M);
	}
	
	public void listar() {
		
		for (Moeda M : listaMoeda) {
					
			System.out.println(M);
		}
	}
	
	public void listarTotalConvertido() {
		
		double total = 0;
		for (Moeda M : listaMoeda) {
			total += M.calculaConversao();
		}
		
		System.out.println("Total Valor Convertido:" + total );
	}


}