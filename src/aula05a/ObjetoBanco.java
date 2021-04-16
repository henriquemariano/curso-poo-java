package aula05a;

public class ObjetoBanco {
	public static void main(String[] args) {
		Banco conta1 = new Banco();
		conta1.abrirConta("CP", "Henrique");
		conta1.sacar(150);
		conta1.fecharConta();
		
		conta1.extrato();
		
		conta1.pagarMensalidade();
		
	}
}
