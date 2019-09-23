package br.edu.iffar.reserv.dao.hibernate;

import br.edu.iffar.reserv.modelo.Funcionario;
import br.edu.iffar.reserv.modelo.core.dao.IFuncionarioDAO;

/**
 * <p>
 * Implementacao dos comportamentos específicos do funcionario
 * </p>
 * 
 * @author Professor
 * @since Sep 23, 2019 8:07:54 PM
 */
public class FuncionarioDAO extends HibernateDAO implements IFuncionarioDAO {

	public FuncionarioDAO() {
		super(Funcionario.class);
	}

}
