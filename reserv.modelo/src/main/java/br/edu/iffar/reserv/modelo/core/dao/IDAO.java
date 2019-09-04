package br.edu.iffar.reserv.modelo.core.dao;

import java.util.List;

import br.edu.iffar.reserv.modelo.core.IEntidade;

/**
 * <p>
 * Interface com as ações comuns de persistencia
 * </p>
 * 
 * @author Professor
 * @since Sep 3, 2019 10:03:23 PM
 */
public interface IDAO {
	/**
	 * <p>
	 * Grava ou atualiza uma entidade
	 * </p>
	 */
	public void gravar(IEntidade entidade) throws DAOException;

	/**
	 * <p>
	 * Exclui uma entidade
	 * </p>
	 */
	public void excluir(IEntidade entidade) throws DAOException;

	/**
	 * <p>
	 * Busca uma entidade pelo campo chave
	 * </p>
	 */
	public IEntidade buscaPorChave(long chave) throws DAOException;

	/**
	 * <p>
	 * Busca todos os registros de dada tabela, 
	 * possibilitando a ordenacao por uma
	 * coluna especifica
	 * </p>
	 */
	public List<IEntidade> getList(String ordem) throws DAOException;
}
