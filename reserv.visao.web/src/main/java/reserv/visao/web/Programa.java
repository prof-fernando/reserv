package reserv.visao.web;

import br.edu.iffar.reserv.controle.ItemLogic;
import br.edu.iffar.reserv.modelo.Item;

// classe para testa a estrutura
public class Programa {

	public static void main(String[] args) {
		Item item = new Item();
		item.setDescricao("sofa");
		
		ItemLogic logica = new ItemLogic();
		logica.gravar(item);
		
	}
	
}
