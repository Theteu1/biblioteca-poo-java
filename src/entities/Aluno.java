package entities;


public class Aluno extends Usuario {

	private String curso;

	public Aluno(int id, String nome, String curso) {
		super(id, nome);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}
	
	
}
