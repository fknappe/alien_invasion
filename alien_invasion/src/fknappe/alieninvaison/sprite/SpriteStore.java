package fknappe.alieninvaison.sprite;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;

import fknappe.alieninvasion.utils.Messages;

/**
 * 
 * @author fknappe
 *
 */
public class SpriteStore {

	// Declaracao das variaveis de instancia
	private static SpriteStore single = new SpriteStore();
	/**
	 * @uml.property  name="sprites"
	 * @uml.associationEnd  qualifier="ref:java.lang.String br.edu.unifei.cct720.alieninvasion.sprite.Sprite"
	 */
	private HashMap sprites = new HashMap();

	/**
	 * Metodo que retorna a instancia do SpriteStore
	 * 
	 * @return SpriteStore
	 */
	public static SpriteStore get() {
		single = (single != null) ? single : new SpriteStore();
		return single;
	}

	/**
	 * Metodo responsavel por obter o sprite especificado do
	 * cache
	 * 
	 * @param String ref
	 * 
	 * @return Sprite
	 */
	public Sprite getSprite(String ref) {

		// Declaracao das variaveis locais
		BufferedImage sourceImage = null;
		Sprite sprite = null;

		// Caso o sprite j‡ exista no cache
		if (sprites.get(ref) != null) {
			return (Sprite) sprites.get(ref);
		}

		/*
		 * Caso contrario, devemos obter o sprite do
		 * gerenciador do ClassLoader
		 */
		try {
			URL url = this.getClass().getClassLoader().getResource(ref);
			sourceImage = ImageIO.read(url);
		} catch (IOException e) {
			Messages.mostraErro(null, "Falha na leitura: " + ref);
		} 

		/*
		 * Cria a imagem a ser armazenada pelo sprite
		 */
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
		Image image = gc.createCompatibleImage(sourceImage.getWidth(),sourceImage.getHeight(),Transparency.BITMASK);
		image.getGraphics().drawImage(sourceImage,0,0,null);

		/*
		 * Instancia um novo sprite e adiciona-o ao cache
		 */
		sprite = new Sprite(image);
		sprites.put(ref,sprite);

		return sprite;
	}

	/**
	 * Metodo auxiliar para tratamento do erro de
	 * leitura do recurso do ClassLoader 
	 * 
	 * @param String message
	 * 
	 * @return void
	 */
	private void failure(String message) {
		System.err.println(message);
		System.exit(0);
	}
}
