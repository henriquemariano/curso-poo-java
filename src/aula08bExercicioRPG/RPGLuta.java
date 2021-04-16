package aula08bExercicioRPG;

	// String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates

public class RPGLuta {
	public static void main(String[] args) {
		Lutador lutador1 = new Lutador("Jacquin", "Brasil", 30, 1.52f, 100.9f, 10, 2, 0);
		Lutador lutador2 = new Lutador("Cebolinha", "Brasil", 20, 1.52f, 93.9f, 10, 2, 0);

		

		
		Luta luta1 = new Luta();
		
		luta1.marcarLuta(lutador1, lutador2);
		
		luta1.lutar();

	}
}
