package aula07b;

public class Lutador {
	// Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;

	
	
	public Lutador(String no, String na, int id, float al, float pe, int vi,
				   int de,int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}

	// Métodos Públicos
	public void apresentar() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("CHEGOU A HORA DA LUTA! Ele que vem diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos de idade");
		System.out.println("tendo " + this.getAltura() + " de altura e pesando " + this.getPeso() + 
				           " quilos");
		System.out.println("Vem ai, " + this.getNome().toUpperCase() + "!");
		System.out.println("Possuindo " + this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println("e " + this.getEmpates() + " empates");
		
	}
	
	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("que Ganhou " + this.getVitorias());
		System.out.println("Perdeu " + this.getDerrotas());
		System.out.println("e Empatou " + this.getEmpates());
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if (this.getPeso() <= 70.3) {
			categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			categoria = "Médio";
		} else if (this.getPeso() <= 120.2) {
			categoria = "Pesado";
		} else {
			categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
}
