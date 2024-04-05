package view;

import controller.AtividadeController;
import controller.ProvaController;
import model.Atividade;
import model.Prova;

public class Principal {

	public static void main(String [] args) {
		
	Prova p1 = new Prova();
	Prova p2 = new Prova();
	
	Atividade a1 = new Atividade();
	Atividade a2 = new Atividade();
	
	p1.setQuestoes(20);
	p1.setMedia(Math.random() * 11 );
	p2.setQuestoes(30);
	p2.setMedia(Math.random() * 11 );
	
	a1.setQuantidadePaginas(50);
	a1.setAssunto("humanas");
	
	a2.setQuantidadePaginas(80);
	a2.setAssunto("Math");

	
	ProvaController provacontroller = new ProvaController();
	AtividadeController atividadecontroller = new AtividadeController();
	
	atividadecontroller.addElement(a1);
	atividadecontroller.addElement(a2);
	atividadecontroller.mostrarAvaliacao();
	System.out.println("===============================================================");
	provacontroller.addElement(p1);
	provacontroller.addElement(p2);
	provacontroller.mostrarAvaliacao();
	System.out.println("===============================================================");
	
	System.out.println();
	System.out.println("apagando o semestre incluindo as provas e as atividades");
	
	
	provacontroller.removeSemestre(p1);
	provacontroller.removeSemestre(p2);
	
	
	atividadecontroller.removeSemestre(a1);
	atividadecontroller.removeSemestre(a2);
	
	System.out.println("**********************************");
	provacontroller.mostrarAvaliacao();
	atividadecontroller.mostrarAvaliacao();
	
	}

}
