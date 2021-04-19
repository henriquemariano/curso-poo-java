package aula02bExerc;

public class Carro {
	String marca;
	String modelo;
	int combustivel;
	String placa;
	boolean freioDeMao;
	
	
	void status() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("N�vel de combust�vel: " + this.combustivel + "%");
	}
	
	void soltaFreioDeMao() {
		this.freioDeMao = false;
	}
	
	void puxaFreioDeMao() {
		this.freioDeMao = true;
	}
	
	void andar() {
		if(freioDeMao == true) {
			System.out.println("Decis�o incongruente! O carro n�o pode andar, pois o freio de m�o est� puxado.");
		} else {
			System.out.println("O carro est� andando.");
		}
	}
	
	void parar() {
		if(freioDeMao == true) {
			System.out.println("O carro est� parado e com o freio de m�o puxado.");
		} else {
			System.out.println("O carro est� parado.");
		}
	}
}