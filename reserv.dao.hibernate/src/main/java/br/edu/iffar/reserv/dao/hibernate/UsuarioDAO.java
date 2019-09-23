package br.edu.iffar.reserv.dao.hibernate;

import br.edu.iffar.reserv.modelo.Usuario;
import br.edu.iffar.reserv.modelo.core.dao.DAOException;
import br.edu.iffar.reserv.modelo.core.dao.IUsuarioDAO;

/**
 * <p>
 * Implementacao dos comportamentos específicos do usuario
 * </p>
 * 
 * @author Professor
 * @since Sep 23, 2019 8:07:54 PM
 */
public class UsuarioDAO extends HibernateDAO implements IUsuarioDAO {

	public UsuarioDAO() {
		super(Usuario.class);
	}

	public Usuario buscaPorEmail(String email) throws DAOException {
		// TODO Faremos no futuro
		return null;
	}

	public Usuario buscaPorEmailSenha(String email, String senha) throws DAOException {
		// TODO Faremos no futuro
		return null;
	}

}
