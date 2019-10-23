package br.edu.iffar.reserv.visao.web;

import javax.enterprise.event.Observes;

import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.edu.iffar.reserv.dao.hibernate.HibernateDAO;
import br.edu.iffar.reserv.modelo.core.dao.FabricaDAO;

/**
 * <p>
 * Definir as  configurações necessárias ou pertinentes a 
 * um projeto Java web.
 * Essas configurações ocorrem uma única vez ao inicializar a 
 * aplicação
 * </p>
 * @author fernando
 *
 */
public class ConfiguraProjetoWeb {

	public void inicializa(@Observes VRaptorInitialized init) {
		System.out.println("Inicializando app web!");
		// define o modelo de persistencia
		FabricaDAO.defineModelo(new HibernateDAO());
		System.out.println("Modelo de persistencia defindido!");
	}
	
}
