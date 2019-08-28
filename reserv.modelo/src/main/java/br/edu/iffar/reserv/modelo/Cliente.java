package br.edu.iffar.reserv.modelo;

/**
 * <p>
 * Entidade que representa um cliente que realiza as reservas
 * </p>
 * 
 * @author Professor
 * @since Aug 19, 2019 8:25:10 PM
 */
public class Cliente extends Usuario {

	private String endereco;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
