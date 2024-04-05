package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Atividade;



public class AtividadeController implements IAvaliacaoController<Atividade> {

	private List<Atividade> atividade;
	
	public AtividadeController() {
		atividade = new ArrayList<>();
	}

	@Override
	public void addElement(Atividade att) {
		atividade.add(att);
		
	}


	@Override
	public Atividade buscarAvalicao(int posicao) {
		return atividade.get(posicao);
				
	}
	
	@Override
	public void mostrarAvaliacao() {
		System.out.println(Arrays.toString(atividade.toArray()));
		
	}

	@Override
	public void removeSemestre(Atividade att) {
		atividade.clear();
	}

	

}
