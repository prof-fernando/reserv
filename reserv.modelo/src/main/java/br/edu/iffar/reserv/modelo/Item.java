package br.edu.iffar.reserv.modelo;
/**
 * <p>
 * Entidade que representa um item presente no 
 * quarto, como por exemplo, frigobar, cama 
 * de casal, secador de cabelo entre outros
 * </p>
 * @author Professor
 * @since 19/08/2019 20:04
 */
public class Item {
	// chave pri maria
	private long idItem;
	// descreve o item do quarto
	private String descricao;
	
	public long getIdItem() {
		return idItem;
	}
	public void setIdItem(long idItem) {
		this.idItem = idItem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
