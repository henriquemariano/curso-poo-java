package aula12b;

public class Peixe extends Animal {
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo planctons");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Nadadeira");
	}
	
	public void soltarBolha() {
		System.out.println("Soltando Bolhas");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}