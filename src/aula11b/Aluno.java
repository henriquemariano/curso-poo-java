package aula11b;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public void pagarMensalidade() {
		if (this.sexo == "F") {
			System.out.println("Pagando a mensalidade da aluna " + this.nome + "...");
		} else {
			System.out.println("Pagando a mensalidade do aluno " + this.nome + "...");
		}
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	} 
}
