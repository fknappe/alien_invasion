package fknappe.alieninvasion.gui.components;

import javax.swing.Icon;

import fknappe.alieninvasion.patterns.Command;
import fknappe.alieninvasion.patterns.Controller;

/**
 * Classe responsavel por criar um botao que sera responsavel
 * pela acao de silenciar os sons do jogo
 * 
 * @author fknappe
 *
 */
public class JButtonMute extends javax.swing.JButton implements Command {

	// Declaracao das variaveis de instancia
	/**
	 * @uml.property  name="med"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Controller med;
	
	/**
	 * Construtor
	 * 
	 * @param Icon ic
	 * @param Controlador m
	 */
	public JButtonMute(Icon ic, Controller m) {
		this.setIcon(ic);
		this.med = m;
	}
	
	@Override
	public void executar() {
		this.med.silenciar();
	}
}
