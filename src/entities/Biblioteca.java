package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {

	private List<Livro> livro = new ArrayList<>();
	private List<Emprestimo> emprestimo = new ArrayList<>();
	private List<Usuario> usuario = new ArrayList<>();

	public void cadastrarLivro(Livro livro) {
		this.livro.add(livro);
	}

	public void cadastrarUsuario(Usuario usuario) {
		this.usuario.add(usuario);
	}

	public void emprestarLivro(int livroId, int usuarioId, Date dataEmprestimo, Date dataDevolucao) {
		Livro livros = livro.stream().filter(l -> l.getId() == livroId && l.isDisponivel()).findFirst().orElse(null);
		Usuario usuarios = usuario.stream().filter(u -> u.getId() == usuarioId).findFirst().orElse(null);

		if (livros != null && usuarios != null) {
			livros.setDisponivel(false);

			Emprestimo emprestimos = new Emprestimo(livros, usuarios, dataEmprestimo, dataDevolucao);

			emprestimo.add(emprestimos);

			System.out.println("Livro Emprestado com sucesso!");
		} else {

			System.out.println("Livro não pode ser emprestado");

		}

	}

	public void devolverrLivro(int livroId) {
		for(Emprestimo emp : emprestimo) {
			if(emp.getLivro().getId() == livroId && !emp.getLivro().isDisponivel()){
				emp.getLivro().setDisponivel(true);
				
				System.out.println("Livro Devolvido com sucesso!");
			} else {
				
				System.out.println("Livro não encontrado!");
			}
		}

	}
	
	
	public void listarDisponiveis() {
		System.out.println("Livros Disponíveis");
		
		boolean encontrou = false;
		
		for(Livro liv: livro) {
			if(liv.isDisponivel()) {
				System.out.println(liv);
				encontrou = true;
			}
		}
		
		if(!encontrou) {
			System.out.println("Nenhum livro disponivel");

		}
	}
	
	
}