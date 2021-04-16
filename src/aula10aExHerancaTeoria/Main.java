package aula10aExHerancaTeoria;

public class Main {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Aluno();
		Pessoa p3 = new Professor();
		Pessoa p4 = new Funcionario();
		
		p2.fazerAniv();
		p1.setNome("Pedro");
		p2.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		
		p2.setCurso("Informática");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		p3.receberAum(550.20f);
		p2.mudarTrabalho();
		p4.setSetor("Estoque");
	}
}