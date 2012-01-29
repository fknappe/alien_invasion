package fknappe.alieninvasion.gui.components;

import javax.swing.Icon;

import fknappe.alieninvasion.patterns.Command;
import fknappe.alieninvasion.patterns.Controller;

/**
 * Classe responsavel pela construcao de um botao que sera
 * responsavel pela inicializacao do jogo
 * 
 * @author fknappe
 *
 */
public class JButtonNewGame extends javax.swing.JButton implements Command {

	// Declaracao das variaveis de instancia
	/**
	 * @uml.property  name="med"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Controller med;

	/**
	 * Construtor
	 * Constoi um novo botao para inicializacao do jogo
	 * 
	 * @param Icon icon
	 * @param Controlador m
	 */
	public JButtonNewGame(Icon icon, Controller m) {
		this.setIcon(icon);
		this.med = m;
	}
	
	@Override
	public void executar() {
		this.med.iniciar();
	}
}
