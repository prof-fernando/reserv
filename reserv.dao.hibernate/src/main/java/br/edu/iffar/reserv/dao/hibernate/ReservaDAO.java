package br.edu.iffar.reserv.dao.hibernate;

import br.edu.iffar.reserv.modelo.Reserva;
import br.edu.iffar.reserv.modelo.core.dao.IReservaDAO;

/**
 * <p>
 * Implementacao dos comportamentos específicos da reserva
 * </p>
 * 
 * @author Professor
 * @since Sep 23, 2019 8:07:54 PM
 */
public class ReservaDAO extends HibernateDAO implements IReservaDAO {

	public ReservaDAO() {
		super(Reserva.class);
	}

}
