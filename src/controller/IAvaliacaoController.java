package controller;

public interface IAvaliacaoController<T> {

	public void addElement(T t);
	
	public void removeSemestre(T t);
	public T buscarAvalicao(int posicao);
	public void mostrarAvaliacao();
	
}
