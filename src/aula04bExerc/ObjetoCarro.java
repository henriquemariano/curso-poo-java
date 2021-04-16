package aula04bExerc;

public class ObjetoCarro {
	public static void main(String[] args) {
		Carro carro1 = new Carro("Chevrolet", "Camaro", 89);
		carro1.puxarFreioDeMao();
		carro1.setCombustivel(98);
	
		carro1.status();
	}
}