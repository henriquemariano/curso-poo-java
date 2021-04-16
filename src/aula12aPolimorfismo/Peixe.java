package aula12aPolimorfismo;

public class Peixe extends Animal {
	private String corEscama;
	
	public void soltarBolhas() {
		System.out.println("Soltando bolhas");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de nado");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
}