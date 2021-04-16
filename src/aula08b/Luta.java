package aula08b;

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
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();

			Random aleatorio = new Random();			
			int vencedor = aleatorio.nextInt(3); 
			System.out.println("==== Resultado da luta ====");
			switch  (vencedor) {
				case 0: 
					System.out.println("Empatou");
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					break;
				case 1:
					System.out.println(desafiado.getNome() + " venceu a luta!");
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				case 2: 
					System.out.println(desafiante.getNome() + " venceu a luta!");
					desafiado.perderLuta();
					desafiante.ganharLuta();
					break;
				}
		} else {
			System.out.println("A luta não pode acontecer");
		}
		System.out.println("-------------------------------");
	}
}
