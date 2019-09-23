package br.edu.iffar.reserv.dao.hibernate;

import br.edu.iffar.reserv.modelo.Item;
import br.edu.iffar.reserv.modelo.core.dao.IItemDAO;

/**
 * <p>
 * Implementação concreta dos comportamentos 
 * personalizados de persistencia para
 * a entidade Item
 * </p>
 * 
 * @author Professor
 * @since Sep 17, 2019 10:01:11 PM
 */
public class ItemDAO extends HibernateDAO implements IItemDAO {

	public ItemDAO() {
		super(Item.class);
	}
}
