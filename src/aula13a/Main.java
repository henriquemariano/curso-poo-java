package aula13a;

public class Main {
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		
		c.reagir("Olá");
		
		c.reagir(21,00);
		c.reagir(11,40);
		c.reagir(false);
		System.out.println("-------------------------");
		c.reagir(4,9.0f);
	}
}
