package aula11a;
//Essa classe n�o pode gerar objetos, apenas ter subclasses (classes filhas)
public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public final void fazerAniversario() {
		this.idade++;
	}
}