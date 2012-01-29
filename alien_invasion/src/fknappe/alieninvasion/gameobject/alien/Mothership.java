package fknappe.alieninvasion.gameobject.alien;

import fknappe.alieninvasion.gameobject.GameObject;

/**
 * Classe responsavel por construir o objeto
 * que representa a nave mae no jogo 
 * 
 * @author fknappe
 *
 */
public class Mothership extends GameObject {

	/**
	 * Construtor
	 * Constroi uma nova instancia da nave mae
	 * com a referencia e localizacao especificados
	 * 
	 * @param String ref
	 * @param int x
	 * @param int y
	 * 
	 */
	public Mothership(String ref, int x, int y) {
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
