package br.edu.iffar.reserv.visao.web;

import br.com.caelum.vraptor.Controller;

/**
 * <p>
 * Controlador padrão para requisições inicias
 * </p>
 * 
 * @author Professor
 * @since Oct 1, 2019 9:42:14 PM
 */
@Controller
public class IndexController {

	public void hello() {
		String mensagem = "hello world!";
		System.out.println(mensagem);
	}
}
