package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Prova;

public class ProvaController implements IAvaliacaoController<Prova> {

	private List<Prova> prova;
	
	public ProvaController() {
		prova = new ArrayList<>();
	}

	@Override
	public void addElement(Prova att) {
		prova.add(att);
		
	}



	@Override
	public Prova buscarAvalicao(int posicao) {
		return prova.get(posicao);
				
	}
	


	@Override
	public void mostrarAvaliacao() {
		System.out.println(Arrays.toString(prova.toArray()));
		
	}

	@Override
	public void removeSemestre(Prova att) {
		prova.clear();
	}
	
}