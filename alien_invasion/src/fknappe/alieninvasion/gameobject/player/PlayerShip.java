package fknappe.alieninvasion.gameobject.player;

import fknappe.alieninvasion.gameobject.GameObject;

public class PlayerShip extends GameObject {

	/**
	 * Construtor
	 * Constroi uma instancia da nave do jogador
	 * de acordo com a referencia e a localizacao
	 * 
	 * @param String ref
	 * @param int x
	 * @param int y
	 */
	public PlayerShip(String ref, int x, int y) {
		super(ref, x, y);
	}

	/*
	 * TODO implementar acao de movimento do jogador
	 *
	 */
	@Override
	public void mover(long delta) {
		// TODO Auto-generated method stub
	}

	/*
	 * TODO implementar tratamento de colisao do jogador
	 *
	 */
	@Override
	public boolean ocorreuColisao(GameObject ent) {
		// TODO Auto-generated method stub
		return false;
	}

}
