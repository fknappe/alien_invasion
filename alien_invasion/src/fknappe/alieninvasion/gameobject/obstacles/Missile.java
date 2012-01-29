package fknappe.alieninvasion.gameobject.obstacles;

import fknappe.alieninvasion.gameobject.GameObject;

public class Missile extends GameObject{

	/**
	 * Construtor
	 * Constroi uma instancia do missil,
	 * de acordo com a referencia e localizacao
	 * especificados
	 * 
	 * @param String ref
	 * @param int x
	 * @param int y
	 */
	public Missile(String ref, int x, int y) {
		super(ref, x, y);
	}
	
	/*
	 * TODO implementar acao de movimento do missil
	 * 
	 */
	@Override
	public void mover(long delta) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * TODO implementar acao de colisao do missil
	 * 
	 */
	@Override
	public boolean ocorreuColisao(GameObject ent) {
		// TODO Auto-generated method stub
		return false;
	}
}
