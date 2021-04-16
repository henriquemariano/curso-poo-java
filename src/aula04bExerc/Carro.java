package aula04bExerc;

public class Carro {
	private String marca;
	private String modelo;
	private boolean andar;
	private boolean freioDeMao;
	private int combustivel;
	
	public Carro(String ma, String mo, int co) {
		this.marca = ma;
		this.modelo = mo;
		this.combustivel = co;
	}
	
	public void andar() {
		this.andar = true;
	}
	
	public void parar() {
		this.andar = false;
	}
	
	public void puxarFreioDeMao() {
		this.freioDeMao = true;
	}
	
	public void soltarFreioDeMao() {
		this.freioDeMao = false;
	}
		
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}

	public void status() {
		System.out.println("Combustível: " + this.combustivel);
		System.out.println("Marca: " + this.marca);
		System.out.println("Freio de mão: " + this.freioDeMao);
	}
}
