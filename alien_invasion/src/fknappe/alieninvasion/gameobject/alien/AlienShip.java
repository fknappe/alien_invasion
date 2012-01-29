package fknappe.alieninvasion.gameobject.alien;

import fknappe.alieninvasion.gameobject.GameObject;

public class AlienShip extends GameObject {

	/**
	 * Construtor 
	 * Constroi uma nova instancia da nave alienigena
	 * protetora de acordo com o a referencia e a 
	 * localizacao especificados
	 * 
	 * @param String ref
	 * @param int x
	 * @param int y
	 */
	public AlienShip(String ref, int x, int y) {
		super(ref, x, y);
	}
	
	@Override
	public void mover(long delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ocorreuColisao(GameObject ent) {
		// TODO Auto-generated method stub
		return false;
	}
}
