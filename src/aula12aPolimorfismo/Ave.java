package aula12aPolimorfismo;

public class Ave extends Animal {
	private String corPena;
	
	public void fazerNinho() {
		System.out.println("Fazendo ninho");
	}

	@Override
	public void locomover() {
		System.out.println("Andando ou voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo sementes");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
}