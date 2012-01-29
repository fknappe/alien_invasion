package fknappe.alieninvasion.gameobject;

import java.awt.Graphics;

import fknappe.alieninvasion.collision.BoundingBox;
import fknappe.alieninvasion.sprite.Sprite;
import fknappe.alieninvasion.sprite.SpriteStore;


public abstract class GameObject {
	
	// Declaracao das variaveis de instancia
	protected int x;
	protected int y;
	protected int dx;
	protected int dy;
	protected Sprite sprite;
	protected BoundingBox bdBox;
	
	/**
	 * Construtor
	 * 
	 * Constroi uma nova entidade com base na referencia do sprite e 
	 * sua localizacao inicial
	 *
	 * @param String ref 
 	 * @param int x 
	 * @param int y 
	 */
	public GameObject(String ref, int x, int y) {
		this.x = x;
		this.y = y;
		this.sprite = SpriteStore.get().getSprite(ref);
		this.bdBox = new BoundingBox(this.x, this.y, this.sprite.getLargura(), this.sprite.getAltura());
	}
	
	/**
	 * Metodo responsavel por desenhar o objeto
	 * dentro do contexto grafico especificado
	 * 
	 * @param Graphics g
	 * 
	 * @return void
	 */
	public void desenhar(Graphics g) {
		sprite.desenhar(g,(int) x,(int) y);
	}
	
	/**
	 * TODO refatorar este metodo para adequa-lo ao funcionamento
	 * do jogo
	 * 
	 * Metodo responsavel por determinar o movimento do objeto
	 * de acordo com um delta especificado
	 * 
	 * @param long delta
	 * 
	 * @return void
	 */
	public abstract void mover(long delta);
	
	public abstract boolean ocorreuColisao(GameObject ent);
	
	// Metodos getters e setters
	public void setMovimentoHorizontal(int dx) {
		this.dx = dx;
	}

	public void setMovimentoVertical(int dy) {
		this.dy = dy;
	}
	
	public double getMovimentoHorizontal() {
		return dx;
	}
	
	public double getMovimentoVertical() {
		return dy;
	}
	
	/**
	 * @return
	 * @uml.property  name="x"
	 */
	public int getX() {
		return (int) x;
	}

	/**
	 * @return
	 * @uml.property  name="y"
	 */
	public int getY() {
		return (int) y;
	}

	public BoundingBox getBoundingBox() {
		return bdBox;
	}
}
