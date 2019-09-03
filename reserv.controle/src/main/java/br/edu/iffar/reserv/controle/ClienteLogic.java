package br.edu.iffar.reserv.controle;

import java.util.List;

import br.edu.iffar.reserv.modelo.Cliente;

/**
 * <p>
 * Classe com as regras de negócio para o cliente
 * </p>
 * 
 * @author Professor
 * @since Sep 2, 2019 8:12:34 PM
 */
public class ClienteLogic {
	/**
	 * <p>
	 * Grava um novo cliente ou atualiza caso já exista
	 * </p>
	 * 
	 * @param cli
	 *            cliente a ser gravado ou atualizado
	 */
	public void gravar(Cliente cli) {
		// implementacao futura de persistencia
	}

	/**
	 * <p>
	 * Remove um cliente do sistema
	 * </p>
	 * 
	 * @param cli
	 *            cliente a ser removido
	 */
	public void excluir(Cliente cli) {
		// implementacao futura de persistencia
	}

	/**
	 * <p>
	 * Busca um cliente pelo campo chave idUsuario, pois cliente é um tipo de
	 * usuário
	 * </p>
	 */
	public Cliente buscaPorID(long id) {
		return null;
	}

	/**
	 * <p>
	 * Traz todos os cliente da base,
	 *  possibilitando a ordenação (ascendente) por um campo 
	 *  específico
	 * </p>
	 */
	public List<Cliente> buscaTodos(String campoOrdem) {
		return null;
	}
}
