package aula02b;

public class ObjetoCaneta {
	public static void main(String[] args) {
		//Caneta 1
		Caneta caneta1 = new Caneta();
		caneta1.cor = "Azul";
		caneta1.ponta = 0.5f;
		caneta1.tampar();
		
		caneta1.status();
		caneta1.rabiscar();
		
		
		//Caneta 2
		Caneta caneta2 = new Caneta();
		caneta2.modelo = "Hostnet";
		caneta2.cor = "Preta";
		caneta2.ponta = 0.5f;
		caneta2.destampar();
		
		caneta2.status();
		caneta2.rabiscar();
	}
}
