package aula05a;

/* 
	numConta
	tipo----------------// Vai poder aceitar Conta Polpança (CP = Ganha 150 reais) ou Conta Corrente (CC = Ganha 50 reais na conta)
	dono 
	saldo 
	status--------------// Os métodos de abrir e fechar conta que vão modificar para true ou false.

	abrirConta()--------// Para abrir a conta eu devo antes informar qual é o tipo da conta.
	fecharConta()-------// Não pode ter dinheiro, e também não pode ter saldo negativo.
	depositar()---------// Para fazer um depósito, a conta deve estar aberta, ou seja, status = true;
	sacar()-------------// A conta precisa estar ativa, e preciso ter saldo para poder sacar.
	pagarMensalidade()--// No momento que for chamado, vai descontar diretamente do saldo. CC (12 reais) CP (20 reais). Mas só pode pagar caso possua saldo.
*/

public class Banco {
	public int numeroDaConta;
	protected String tipoDaConta;
	private String dono;
	private float saldo;
	private boolean status;

	public Banco() {
		this.status = false;
		this.saldo = 0;
	}
	
	public void abrirConta(String tC, String d) {
		this.dono = d;
		switch(tC) {
			case "CC":
				tipoDaConta = tC;
				this.saldo = this.saldo + 50;
				break;
			case "CP":
				tipoDaConta = tC;
				this.saldo = this.saldo + 150;
				break;
			default:
			System.out.println("Por favor, digite uma das duas opções de conta: \n\"CC\" (Conta Corrente) / \"CP\" (Conta Polpança)");
		}		
		
		if(tC == this.tipoDaConta) {
			this.status = true;
		}
	}

	public void fecharConta() {
		if(this.saldo == 0 ) {
			this.status = false;
			System.out.println("Sua conta no banco foi fechada.");
		} else {
			System.out.println("Você não pode fechar sua conta, pois ainda possui saldo.");
		}
	}
	
	public void depositar(float d) {
		if(this.status == true) {
			this.saldo = this.saldo + d;
		} else {
			System.out.println("Você ainda não pode depositar, pois não abriu uma conta.");
		}
	}
	
	public void sacar(float s) {
		if(s > this.saldo) {
			System.out.println("Erro! Tentativa de saque acima do valor em saldo.");
		} else { 
			this.saldo = this.saldo - s;
		}
		
	}
	
	public void pagarMensalidade() {
		if(status == true) {
			if(this.tipoDaConta == "CC" && this.saldo > 12) {
				this.saldo = saldo - 12;
			} else if(this.saldo > 20) {
				this.saldo = this.saldo - 20;
			} else {
				System.out.println("Você não possui saldo suficiente.");
			}
		} else {
			System.out.println("Não é possível cobrar a mensalidade, pois a conta está fechada.");
		}
	}

	
	void setNumeroDaConta(int nDC) {
		numeroDaConta = nDC;  
	}
	
	int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	
	public void setTipoDaConta(String t) {
		this.tipoDaConta = t;
	}
	
	/*
	void setTipoDaConta(String tC) {
		switch(tC) {
			case "CC":
				tipoDaConta = tC;
				this.saldo = 50;
				break;
			case "CP":
				tipoDaConta = tC;
				this.saldo = 150;
				break;
			default:
				System.out.println("Por favor, digite uma das duas opções de conta: \n\"CC\" (Conta Corrente) / \"CP\" (Conta Polpança)");
		}
	}
	*/
	
	String getTipoDaConta() {
		return this.tipoDaConta;
	}
	
	void setDono(String d) {
		this.dono = d;
	}
	
	String getDono() {
		return this.dono;
	}
	
	void setSaldo(float s) {
		this.saldo = s;
	}
	
	float getSaldo() {
		System.out.println("Saldo: R$" + this.saldo);
		return this.saldo;
	}
	
	boolean getStatus() {
		System.out.println("Conta aberta: " + this.status);
		return this.status;
	}
	
	void extrato() {
		System.out.println("Extrato" + "\nNome: " + dono + "\nNúmero da conta: " + this.numeroDaConta + "\nTipo da conta: " + this.tipoDaConta + 
		"\nSaldo: " + this.saldo + "\nStatus da conta: " + this.status);
	}
	
}