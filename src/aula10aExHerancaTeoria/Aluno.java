package aula10aExHerancaTeoria;

public class Aluno extends Pessoa {
	public int matricula;
	public String curso;
	
	public void cancelarMatricula() {
		
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