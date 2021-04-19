package aula11b;

public class Bolsista extends Aluno {
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
	}

	@Override
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade (desconto de bolsa)");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
