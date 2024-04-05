package model;

public class Prova {

	
	private Integer questoes;
	private Double media ;
	
	public Prova() {
		super();
	}

	

	public Integer getQuestoes() {
		return questoes;
	}

	public void setQuestoes(Integer questoes) {
		this.questoes = questoes;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}
	
	
	@Override
	public String toString() {
		return "Prova [a quantidade de questoes e = " + questoes + ",e a  media = " + media + "]";
	}

	
	
}
