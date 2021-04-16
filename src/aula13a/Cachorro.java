package aula13a;

public class Cachorro extends Lobo {
	@Override
	public void emitirSom() {
		System.out.println("Au, au, au");
	}
	
	public void reagir(String frase) {
		if (frase == "Toma comida" || frase == "Olá") {
			System.out.println("Abanando e latindo");
		} else {
			System.out.println("Rosnando");
		}
	}
	
	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanando");
		} else if (hora >= 18) {
			System.out.println("Ignorando");
		} else {
			System.out.println("Abanando e latindo");
		}
	}
	
	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanando");
		} else {
			System.out.println("Rosnando e latindo");
		}
	}
	
	public void reagir(int idade, float peso) {
		if (idade < 5 && idade < 10) {
			System.out.println("Abanando");
		} else {
			System.out.println("Latindo");
		} 
		
		if (peso < 10) {
			System.out.println("Rosnando");
		} else {
			System.out.println("Ignorar");
		}
		
	}
}