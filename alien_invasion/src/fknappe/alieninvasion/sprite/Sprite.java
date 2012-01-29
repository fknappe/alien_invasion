package fknappe.alieninvasion.sprite;

import java.awt.Graphics;
import java.awt.Image;

/**
 * Classe que permite representar as mesmas entidades (objetos)
 * da aplicacao atraves de uma imagem apenas
 * 
 * @author fknappe
 *
 */
public class Sprite {
	
	// Declaracao das variaveis de instacia
	/**
	 * @uml.property  name="image"
	 */
	private Image image;
	
	/**
	 * Construtor
	 * Cria uma nova instancia do sprite com base
	 * em uma imagem
	 * 
	 * @param Image im
	 */
	public Sprite(Image im) {
		this.image = im;
	}
	
	/**
	 * Metodo responsavel por retornar o valor
	 * da largura do sprite
	 *
	 * @return int
	 */
	public int getLargura() {
		return image.getWidth(null);
	}

	/**
	 * Metodo responsavel por retornar o valor
	 * da altura do sprite
	 * 
	 * @return The height in pixels of this sprite
	 */
	public int getAltura() {
		return image.getHeight(null);
	}
	
	/**
	 * Metodo responsavel por desenhar o sprite dentro
	 * de um contexto grafico especificado
	 * 
	 * @param Graphics g 
	 * @param int x 
	 * @param int y
	 * 
	 * @return void
	 */
	public void desenhar(Graphics g, int x, int y) {
		g.drawImage(image,x,y,null);
	}

}
