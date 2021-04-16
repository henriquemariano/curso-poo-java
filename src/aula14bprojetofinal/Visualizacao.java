package aula14bprojetofinal;
//A visualização possui um Gafanhoto.
//O espectador é um Gafanhoto.
//Cada espectador (Gafanhoto) pode acessar seus métodos e atributos (setTotalAssistido)
public class Visualizacao {
	private Gafanhoto espectador;
	private Video filme;
	
	//A visualização será feita atrvés de uma relação entre um objeto da classe Gafanhoto e um objeto da classe Vídeo
	public Visualizacao(Gafanhoto espectador, Video filme) { //espectador = g[0] (Gafanhoto Bruna) | filme = v[0] (Curso POO - Aula 01)
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}
	
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float percent) {
		int total = 0;
		
		if (percent <= 20) {
			total = 3;
		} else if (percent <= 50) {
			total = 5;
		} else if (percent <= 90) {
			total = 8;
		} else {
			total = 10;
		}
		
		this.filme.setAvaliacao(total);
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
}
