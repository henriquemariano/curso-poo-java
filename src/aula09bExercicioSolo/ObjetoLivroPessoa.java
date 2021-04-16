package aula09bExercicioSolo;

public class ObjetoLivroPessoa {
	public static void main(String[] args) {
		Pessoa[] pessoa = new Pessoa[2];
		Livro[] livro = new Livro[3];
		
		pessoa[0] = new Pessoa("Amazor", "M", 23);
		pessoa[1] = new Pessoa("Sylvia", "F", 32);

		livro[0] = new Livro("A volta dos que não foram", "Jão da Silva", 300, pessoa[0]);
		livro[1] = new Livro("A história de um careca cabeludo", "Mariane Ferreira", 450, pessoa[0]);
		livro[2] = new Livro("Poeira em alto mar", "Fern Grawn", 230, pessoa[1]);
		
		livro[1].avancarPag();
		livro[1].abrir();
		
		System.out.println(livro[1].detalhes());
		System.out.println("\n" + livro[2].detalhes());
		System.out.println("\n" + livro[0].detalhes());
		
		
	}
}
