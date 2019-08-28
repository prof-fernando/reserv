package br.edu.iffar.reserv.modelo;

/**
 * <p>
 * Entidade que representa um quarto que pode ser reservado
 * </p>
 * 
 * @author Professor
 * @since Aug 19, 2019 8:14:03 PM
 */
public class Quarto {

	private long idQuarto;
	// quantidade de pessoas que o quarto comporta
	private int capacidade;
	// agrupa os quartos, ex. standard, luxo, suíte etc
	private String tipoQuarto;
	// tamanho em mt quadrados
	private double tamanho;

	public long getIdQuarto() {
		return idQuarto;
	}

	public void setIdQuarto(long idQuarto) {
		this.idQuarto = idQuarto;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

}
