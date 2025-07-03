package application;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import entities.Aluno;
import entities.Biblioteca;
import entities.Livro;
import entities.Professor;

public class AppBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Biblioteca biblioteca = new Biblioteca();
		Scanner sc = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("*** Seletor de Opções ***");
			System.out.println("1 - CADASTRAR LIVRO");
			System.out.println("2 - CADASTRAR USUARIO");
			System.out.println("3 - PEGAR LIVRO EMPRESTADO");
			System.out.println("4 - DEVOLVER LIVRO");
			System.out.println("5 - LISTAR LIVROS Disponíveis");
			System.out.println("0 - FINALIZAR");
			System.out.println("OPÇÃO: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1: {
				System.out.println("Digite o ID do livro: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Digite o Titulo do livro: ");
				String titulo = sc.nextLine();

				System.out.println("Digite o Autor do livro: ");
				String autor = sc.nextLine();

				Livro livro = new Livro(id, titulo, autor);
				biblioteca.cadastrarLivro(livro);
			}
				break;
			case 2: {
				System.out.println("Digite o ID do Usuario: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Digite o nome do Usuario: ");
				String nome = sc.nextLine();

				System.out.println("Tipo (Aluno : 1 | Professor: 2) :");
				int tipo = sc.nextInt();
				sc.nextLine();

				if (tipo == 1) {

					System.out.println("Aluno digite seu curso: ");
					String curso = sc.nextLine();
					Aluno aluno = new Aluno(id, nome, curso);
					biblioteca.cadastrarUsuario(aluno);
					System.out.println("✅ Aluno registrado!");

				} else if (tipo == 2) {

					System.out.println("Professor digite seu Departamento: ");
					String dpt = sc.nextLine();

					Professor prof = new Professor(id, nome, dpt);
					biblioteca.cadastrarUsuario(prof);
					System.out.println("✅ Professor registrado!");

				} else {

					System.out.println("❌ Tipo Invalido");
				}
			}
				break;
			case 3: {

				System.out.println("Digite o ID do livro: ");
				int idLivro = sc.nextInt();
				sc.nextLine();

				System.out.println("Digite o ID do Usuario: ");
				int idUsuario = sc.nextInt();
				sc.nextLine();

				Date hoje = new Date();

				Calendar cal = Calendar.getInstance();
				cal.setTime(hoje);
				cal.add(Calendar.DAY_OF_MONTH, 7);

				Date devolucao = cal.getTime();

				biblioteca.emprestarLivro(idLivro, idUsuario, hoje, devolucao);
			}
			 break;
			case 4: {
				System.out.println("ID do Livro a ser devolvido: ");
				int id = sc.nextInt();
				sc.nextLine();
				biblioteca.devolverrLivro(id);
			}
				break;
			case 5:
				biblioteca.listarDisponiveis();
				break;
			case 0:
				System.out.println("Encerrando...");
				break;
			default:
				System.out.println("❌ Opção inválida!");

			}

		} while (opcao != 0);

	}

}
