package model;

public class Atividade {

	
	private Integer quantidadePaginas;
	private String assunto;
	
	public Atividade() {
		super();
	}

	public Integer getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(Integer quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	@Override
	public String toString() {
		return "Atividade [a quantidade de Paginas = " + quantidadePaginas + ", e o assunto  = " + assunto + "]";
	}

	
	
}
