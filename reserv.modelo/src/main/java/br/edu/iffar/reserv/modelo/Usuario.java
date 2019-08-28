package br.edu.iffar.reserv.modelo;
/**
 * <p>
 * Entidade genérica que representa um usuário 
 * do sistema. Não existirá usuário sem 
 * especialização, sendo sempre um cliente ou 
 * usuário.
* </p>
* @author Professor
* @since Aug 19, 2019 8:22:31 PM
*/
public abstract class Usuario {

	private long idUsuario;
	private String nome;
	private String telefone;
	private String email;
	private String senha;
	
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
