package br.edu.iffar.reserv.controle;

import java.util.List;

import br.edu.iffar.reserv.modelo.Cliente;
import br.edu.iffar.reserv.modelo.core.IEntidade;

/**
 * <p>
 * Classe abastrata que concentra todas as acoes que são
 *  comuns as entidades
* </p>
* @author Professor
* @since Sep 3, 2019 9:12:29 PM
*/
public abstract class ALogic {
	/**
	 * <p>
	 * Grava uma nova entidade ou atualiza caso já exista
	 * </p>
	 * 
	 * @param entidade
	 *            entidade a ser gravado ou atualizado
	 */
	public void gravar(IEntidade entidade) {
		// implementacao futura de persistencia
	}

	/**
	 * <p>
	 * Remove uma entidade do sistema
	 * </p>
	 * 
	 * @param entidade
	 *            entidade a ser removido
	 */
	public void excluir(IEntidade entidade) {
		// implementacao futura de persistencia
	}

	/**
	 * <p>
	 * Busca uma entidade pelo campo chave primaria
	 * </p>
	 */
	public IEntidade buscaPorID(long id) {
		return null;
	}

	/**
	 * <p>
	 * Traz todos os registros de uma determinada entidade,
	 *  possibilitando a ordenação (ascendente) por um campo 
	 *  específico
	 * </p>
	 */
	public List<IEntidade> buscaTodos(String campoOrdem) {
		return null;
	}

}
