package aula12b;

public class Main {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(40.3f);
		m.setCorPelo("Preto");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		System.out.println("---------------------------");
		
		r.setIdade(12);
		r.setCorEscama("Verde");
		r.setMembros(0);
		r.setPeso(3.51f);
		r.emitirSom();
		r.alimentar();
		
		System.out.println("---------------------------");
		
		a.locomover();
		
		System.out.println("---------------------------");
		
		Canguru c = new Canguru();
		c.locomover();
		c.emitirSom();
		
		System.out.println("---------------------------");
		
		Cachorro k = new Cachorro();
		k.locomover();
		k.emitirSom();
		
	}

}
