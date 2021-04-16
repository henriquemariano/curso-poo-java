package aula05a;

public class ObjetoBancoCorrecao {
	public static void main(String[] args) {
		BancoCorrecao conta1 = new BancoCorrecao();
		conta1.setNumConta(1111);
		conta1.setDono("Julibeu");
		conta1.abrirConta("CC");
		
		BancoCorrecao conta2 = new BancoCorrecao();
		conta2.setNumConta(2222);
		conta2.setDono("Creuza");
		conta2.abrirConta("CP");			
		
		conta1.depositar(100);
		conta2.depositar(500);
		conta2.sacar(100);
	
		conta1.sacar(150);	
		conta1.fecharConta();
		
		conta1.estadoAtual();
		conta2.estadoAtual();
	}
}
