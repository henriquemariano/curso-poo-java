package aula13b;

public class Cachorro extends Lobo {
	@Override
	public void emitirSom() {
		System.out.println("Au, au, au");
	}
	
	public void reagir(String frase) {
		if (frase.equals("Toma comida") || frase.equals("Olá")) {
			System.out.println("Abanando o rabo e latindo");
		} else {
			System.out.println("Rosnando");
		}
	}
	
	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanando o rabo");
		} else if (hora >= 18) {
			System.out.println("Ignorando");
		} else {
			System.out.println("Abanando o rabo e latindo");
		}
	}
	
	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanando o rabo");
		} else {
			System.out.println("Rosnando e latindo");
		}
	}

	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10)  {
				System.out.println("Abanando o rabo");
			} else {
				System.out.println("Latindo");
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnando");
			} else {
				System.out.println("Ignorando");
			}
		}
	}
}