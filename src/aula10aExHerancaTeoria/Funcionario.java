package aula10aExHerancaTeoria;

public class Funcionario extends Pessoa {
	public String setor;
	public boolean trabalhando;
	
	public void mudarTrabalho() {
		
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
}