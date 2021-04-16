package aula07b;

/*
	Regras da luta
		- Só pode ser marcada entre lutadores da mesma categoria.
		- Desafiado e desafiante devem ser lutadores diferentes.
		- Só pode acontecer se estiver aprovada.
		- Só pode ter como vitória de um dos lutadores ou o empate.
*/

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
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
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
		if (aprovada)  {
			desafiado.apresentar();
			desafiante.apresentar();
			/* // Feito em pseudocódigo
			vencedor = aleatorio(0..2);
			*/
			int vencedor = 0;
			switch  (vencedor) {
				case 1: 
					System.out.println("Empatou");
					desafiado.empatarLuta();
					desafiante.empatarLuta();
					break;
				case 2:
					System.out.println(desafiado.getNome() + " venceu a luta!");
					desafiado.ganharLuta();
					desafiante.perderLuta();
					break;
				case 3: 
					System.out.println(desafiante.getNome() + " venceu a luta!");
					desafiado.perderLuta();
					desafiante.ganharLuta();
				}
		} else {
			System.out.println("A luta não pode acontecer");
		}
	}
}
