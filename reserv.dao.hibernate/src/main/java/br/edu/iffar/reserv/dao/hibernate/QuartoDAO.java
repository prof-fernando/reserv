package br.edu.iffar.reserv.dao.hibernate;

import br.edu.iffar.reserv.modelo.Quarto;
import br.edu.iffar.reserv.modelo.core.dao.IQuartoDAO;

/**
 * <p>
 * Implementação concreta dos comportamentos personalizados
 * de persistencia para a entidade Quarto
* </p>
* @author Professor
* @since Sep 17, 2019 10:01:11 PM
*/
public class QuartoDAO extends HibernateDAO
                             implements IQuartoDAO {

	public QuartoDAO() {
		super(Quarto.class);
	}
}
