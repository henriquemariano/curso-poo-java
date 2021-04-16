package aula12b;

public class Ave extends Animal {
	private String corPena;
	
	@Override
	public void locomover() {
		System.out.println("Andando ou Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Sementes");
	}

	@Override
	public void emitirSom() {
		System.out.println("Piando");
	}
	
	public void fazerNinho() {
		System.out.println("Construindo Ninho");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}