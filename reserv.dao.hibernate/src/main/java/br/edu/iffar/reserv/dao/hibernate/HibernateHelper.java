package br.edu.iffar.reserv.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.edu.iffar.reserv.modelo.Item;

/**
 * <p>
 * Classe utilitária para criar novas sessões 
 * de conexão com banco de dados
 * </p>
 * 
 * @author Professor
 * @since Sep 16, 2019 8:04:33 PM
 */
public class HibernateHelper {

	private static SessionFactory fabrica;
	/**
	 * <p>
	 * Abre uma nova sessão de conexão de conexao com banco
	 * de dados
	 * </p>
	 */
	public static Session getSessao() {
		if( fabrica == null  ) {
			// inicializar a fabrica
			configurarFabrica();
		}
		return fabrica.openSession();
	}
	/**
	 * <p>
	 * CRia uma fábrica de sessões, na prática neste método
	 * se realiza a conexão efetiva com banco de dados, com base
	 * no arquivo de configuracao hibernate.properties
	 * </p>
	 */
	private static void configurarFabrica() {
		Configuration cfg = new Configuration();
		// indicar as entidades
		cfg.addAnnotatedClass(Item.class);
		
		// abre a conexao
		fabrica = cfg.buildSessionFactory();
	}
	
	
}
