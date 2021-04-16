package aula08bExercicioRPG;

/*
Regras da luta
	- Só pode ser marcada entre lutadores da mesma categoria.
	- Desafiado e desafiante devem ser lutadores diferentes.
	- Só pode acontecer se estiver aprovada.
	- Só pode ter como vitória de um dos lutadores ou o empate.
	
	Este é o if do marcarLuta() sem usar .equals(): l1.getCategoria() == l2.getCategoria()
*/

import java.util.Random;

public class Luta {
private Lutador desafiado; 
private Lutador desafiante;
private int rounds;
private boolean aprovada;
private int golpeForte;
private boolean contadorLuta;

public void setDesafiado(Lutador dd) {
	this.desafiado = dd;
}

public Lutador getDesafiado() {
	return desafiado;
}

public void marcarLuta(Lutador l1, Lutador l2) {
	if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
		aprovada = true;
		desafiado = l1;
		desafiante = l2;
		
	} else {
		this.aprovada = false;
		this.desafiado = null;
		this.desafiante = null;
	}
}

public void lutar() {
	if (this.aprovada)  {
		
		Random dado = new Random();
		while (desafiado.getVida() > 0 || desafiante.getVida() > 0 && desafiado.getVida() != desafiante.getVida()) {
			int nocauteDesafiado = dado.nextInt(30);
			int nocauteDesafiante = dado.nextInt(30);
			int dadoSwitch = dado.nextInt(3);
			int golpeForte = dado.nextInt(2);
			int golpe = dado.nextInt(2);
			switch (dadoSwitch) {
			 	case 0: // Chance de nocaute
			 		if (nocauteDesafiado == 2) {
			 			System.out.println("QUE GOLPE MEUS AMIGOS! O lutador " + desafiado.getNome() + " conseguiu encaixar um nocaute e ganhou a luta, INCRÍVEL!");
			 			desafiante.setVida(0);
			 			desafiado.setVitorias(desafiado.getVitorias() + 1);
			 			desafiante.setDerrotas(desafiante.getDerrotas() + 1);
			 			System.exit(0);
			 		} else if (nocauteDesafiante == 2) {
			 			System.out.println("QUE GOLPE MEUS AMIGOS! O lutador " + desafiante.getNome() + " conseguiu encaixar um nocaute e ganhou a luta, INCRÍVEL!");
			 			desafiado.setVida(0);
			 			desafiante.setVitorias(desafiante.getVitorias() + 1);
			 			desafiado.setDerrotas(desafiado.getDerrotas() + 1);
			 			System.exit(0);
			 		}
			 		break;
			 	case 1: // Golpe forte no 
			 		if (golpeForte == 1) {
			 			System.out.println("* O lutador " + desafiado.getNome() + " deu um golpe forte no " + desafiante.getNome());
				 		desafiado.setVida(desafiado.getVida() - 25);
			 		} else if (golpeForte == 0) {
			 			System.out.println("* O lutador " + desafiante.getNome() + " deu um golpe forte no " + desafiado.getNome());
				 		desafiante.setVida(desafiante.getVida() - 25);
			 		}
			 		break;
			 	case 2: // Golpe forte no desafiado
			 		if (golpe == 1) {
			 			System.out.println("* O lutador " + desafiado.getNome() + " deu um golpe no " + desafiante.getNome());
			 			desafiado.setVida(desafiado.getVida() - 15);
			 		} else if (golpe == 0) {
			 			System.out.println("* O lutador " + desafiante.getNome() + " deu um golpe no " + desafiado.getNome());
			 			desafiante.setVida(desafiado.getVida() - 15);
			 		}
			 		break;	 		
			}			
		 	System.out.println("Vida " + desafiado.getNome() + ": " + desafiado.getVida());
		 	System.out.println("Vida " + desafiante.getNome() + ": " + desafiante.getVida());
		}
					
		if (desafiante.getVida() < desafiado.getVida()) {
			System.out.println("O lutador " + desafiado.getNome() + " venceu!");
		} else {
			System.out.println("O lutador " + desafiante.getNome() + " venceu!");
		}
		
	} else {
		System.out.println("A luta não pode acontecer");
	}
	System.out.println("-------------------------------");
}
}