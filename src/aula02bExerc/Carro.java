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
		System.out.println("Nível de combustível: " + this.combustivel + "%");
	}
	
	void soltaFreioDeMao() {
		this.freioDeMao = false;
	}
	
	void puxaFreioDeMao() {
		this.freioDeMao = true;
	}
	
	void andar() {
		if(freioDeMao == true) {
			System.out.println("Decisão incongruente! O carro não pode andar, pois o freio de mão está puxado.");
		} else {
			System.out.println("O carro está andando.");
		}
	}
	
	void parar() {
		if(freioDeMao == true) {
			System.out.println("O carro está parado e com o freio de mão puxado.");
		} else {
			System.out.println("O carro está parado.");
		}
	}
}