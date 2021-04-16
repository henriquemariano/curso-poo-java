package aula09bExercicio;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String n, int i, String s) {
		this.nome = n;
		this.idade = i;
		this.sexo = s;
	}
	
	public void fazerAniversario() {
		idade = idade + 1;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setSexo(String s) {
		this.sexo = s;
	}
	
	public String getSexo() {
		return this.sexo;
	}
}
