package aula10bPraticaHeranca;

public class ProjetoPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Gabriela");
		p3.setNome("Cl�udia");
		p4.setNome("Fernanda");
		
		p1.setSexo("H");
		p4.setSetor("F");
		p2.setIdade(18);
		
		p2.setCurso("Inform�tica");
		p3.setSalario(2500.75f);
		p4.setSetor("Estoque");
		
		//p1.receberAumento(550.20f);
		//p2.mudarTrabalho();		
		//p4.cancelarMatricula();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}