package aula09bExercicio;

public class ProjetoLivro {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Letícia", 17, "F");
		p[1] = new Pessoa("Fernanda", 18, "F");
		
		l[0] = new Livro("Aprendando Java", "Josonidelson", 300, p[0]);
		l[1] = new Livro("POO para iniciantes", "Clodoaldo Fernandes", 430, p[1]);
		l[2] = new Livro("Java Avançado", "Marieide Castro", 550, p[1]);
		
		l[0].abrir();
		l[0].folhear(20);
		l[0].avancarPag();
		
		System.out.println(l[1].detalhes());
		System.out.println("\n" + l[2].detalhes());
	}
}
