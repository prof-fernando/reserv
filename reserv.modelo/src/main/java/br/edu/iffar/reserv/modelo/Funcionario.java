package br.edu.iffar.reserv.modelo;
/**
 * <p>
 * Entidade que representa um funcionario
* </p>
* @author Professor
* @since Aug 19, 2019 8:26:45 PM
*/
public class Funcionario extends Usuario {

	private String setor;
	private String funcao;
	
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
}
