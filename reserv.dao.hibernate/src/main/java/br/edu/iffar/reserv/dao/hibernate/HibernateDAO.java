package br.edu.iffar.reserv.dao.hibernate;

import java.util.List;

import br.edu.iffar.reserv.modelo.core.IEntidade;
import br.edu.iffar.reserv.modelo.core.dao.DAOException;
import br.edu.iffar.reserv.modelo.core.dao.IDAO;

/**
 * <p>
 * Implementacao do padrao DAO com base no framework
 * hibernate
* </p>
* @author Professor
* @since Sep 10, 2019 10:20:29 PM
*/
public class HibernateDAO implements  IDAO{

	public void gravar(IEntidade entidade) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	public void excluir(IEntidade entidade) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	public IEntidade buscaPorChave(long chave) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IEntidade> getList(String ordem) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
