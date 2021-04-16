package aula04b;

public class Caneta {
	private String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta(String m, float p, String c) {
		this.modelo = m;
		this.ponta = p;
		this.cor = c;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean getTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void status() {
		System.out.println("Modelo: " + modelo + "\nPonta: " + ponta + "\nCor: " + cor);
	}
	
	
	
}
