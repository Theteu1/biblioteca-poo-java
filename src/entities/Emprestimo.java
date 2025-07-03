package entities;

import java.util.Date;

public class Emprestimo {

	private Livro livro;
	private Usuario usuario;
	private Date dataEmprestimo;
	private Date dataDevolucao;
	
	
	public Emprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao) {
		super();
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}


	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	
	
	
}
