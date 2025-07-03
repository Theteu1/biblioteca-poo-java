package entities;

public class Livro {

	private int id;
	private String titulo;
	private String autor;
	private boolean disponivel;
	
	public Livro(int id, String titulo, String autor) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		disponivel = true;
	}
	
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "================================="
			+ "\nid: " + id 
			+ ", titulo: " + titulo 
			+ ", autor: " + autor 
			+ ", disponivel: " + disponivel
			+ "\n================================";
	}
	
	
}
