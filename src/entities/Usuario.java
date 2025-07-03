package entities;

public abstract class Usuario {
	
	
	private int id;
	private String nome;
	
	
	public Usuario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}



	public int getId() {
		return id;
	}
	
	
	
	
	
}
