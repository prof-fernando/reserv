package br.edu.iffar.reserv.dao.hibernate;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import br.edu.iffar.reserv.modelo.core.IEntidade;
import br.edu.iffar.reserv.modelo.core.dao.DAOException;
import br.edu.iffar.reserv.modelo.core.dao.IDAO;

/**
 * <p>
 * Implementacao do padrao DAO com base no framework hibernate
 * </p>
 * 
 * @author Professor
 * @since Sep 10, 2019 10:20:29 PM
 */
public class HibernateDAO implements IDAO {
	private Session sessao;
	// referencia para a classe da entidade
	private Class<? extends IEntidade> classeEntidade;
	/**
	 * <p>
	 * Construtor padrão para definição de modelo de persistencia
	 * </p>
	 */
	public HibernateDAO() {
		// chama o construtor que recebe como parametro
		// uma classe de entidade
		this(null);
	}
	
	/**
	 * <p> Somente cria-se instancias de dao para entidades
	 * do sistema. Deve-se passar sempre como parametro
	 * a classe (.class) da entidade
	 */
	public HibernateDAO(Class<? extends IEntidade> entidade) {
		this.classeEntidade = entidade;
		this.sessao = HibernateHelper.getSessao();
	}
	
	public void gravar(IEntidade entidade) throws DAOException {
		this.sessao.beginTransaction();
		this.sessao.saveOrUpdate(entidade);
		this.sessao.getTransaction().commit();
	}

	public void excluir(IEntidade entidade) throws DAOException {
		this.sessao.beginTransaction();
		this.sessao.delete(entidade);
		this.sessao.getTransaction().commit();
	}

	public IEntidade buscaPorChave(long chave) throws DAOException {
		return this.sessao.get(this.classeEntidade, chave);
	}

	public List<IEntidade> getList(String ordem) throws DAOException {
		CriteriaQuery<? extends IEntidade> c =
		  this.sessao.getCriteriaBuilder()
		 .createQuery( this.classeEntidade );
		
		Root r = c.from(this.classeEntidade);
		c.select(   r );
		
		List itens =
		this.sessao.createQuery(c).getResultList();
		
		return itens;
	}

	public <Futuro extends IDAO> Futuro criaNovoDAO(Class<? extends IEntidade> classeEntidade) throws DAOException {
		// monta o pacote da classe a ser instanciada
		StringBuffer pacote = new StringBuffer();
		pacote.append("br.edu.iffar.reserv.dao.hibernate.");
		pacote.append( classeEntidade.getSimpleName() );
		pacote.append("DAO");
		try {
			Class classeDAO = Class.forName(pacote.toString());
			return (Futuro) classeDAO.newInstance();
		}catch( Exception ex ) {
			throw new DAOException(ex.getMessage());
		}
	}

}
