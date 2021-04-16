package aula02bExerc;

public class ObjetoCarro {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.marca = "Volkswagen";
		carro1.modelo = "Jetta";
		carro1.combustivel = 92;
		carro1.status();
		
		carro1.puxaFreioDeMao();
		carro1.andar();
	}
}
