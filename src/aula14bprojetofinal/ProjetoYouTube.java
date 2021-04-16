package aula14bprojetofinal;

public class ProjetoYouTube {
	public static void main(String[] args) {
		Video[] v = new Video[3];
		v[0] = new Video("Curso POO - Aula 01");
		v[1] = new Video("Curso POO - Aula 02");
		v[2] = new Video("Curso POO - Aula 03");
		
		Gafanhoto[] g = new Gafanhoto[2];
		g[0] = new Gafanhoto("Bruna", 20, "F", "bru");
		g[1] = new Gafanhoto("Carlos", 18, "M", "carlinhos");
	
		Visualizacao[] vis = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]); //Bruna assiste Curso POO - Aula 03
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]); //Bruna assiste Curso POO - Aula 02
		vis[1].avaliar(63.0f);
		System.out.println(vis[0].toString());
		

		
		
		
		/*
		System.out.println("VÍDEOS\n------------------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println("\nGAFANHOTOS\n------------------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());
		*/
	}
}	