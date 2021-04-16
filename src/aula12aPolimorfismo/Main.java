package aula12aPolimorfismo;

public class Main {

	public static void main(String[] args) {
		/*
		  Animal n1 = new Animal(); 
		  Não se pode instanciar um objeto da classe Animal pois ela é abstrata.
		*/
		System.out.println("Mamifero");
		Mamifero m1 = new Mamifero();
		m1.setPeso(85.3f);
		m1.setIdade(2);
		m1.setMembros(4);
		m1.locomover();
		m1.alimentar();
		m1.emitirSom();
		
		System.out.println("---------------------------");
		
		Reptil r1 = new Reptil();
		
		
		Peixe p1 = new Peixe();
		p1.setPeso(0.35f);
		p1.setIdade(1);
		p1.setMembros(6);
		p1.locomover();
		p1.alimentar();
		p1.emitirSom();
		
		System.out.println("---------------------------");
		
		Ave a1 = new Ave();
		a1.setPeso(0.88f);
		a1.setIdade(25);
		a1.setMembros(4);
		a1.locomover();
		a1.alimentar();
		a1.emitirSom();
		a1.fazerNinho();
		
		System.out.println("---------------------------");
		
		Canguru c1 = new Canguru();
		c1.locomover();
		
		System.out.println("---------------------------");
		
		Cachorro k1 = new Cachorro();
		k1.abanarRabo();
		k1.locomover();
		
		
		
	}
}