package fknappe.alieninvasion.gui.components;

import javax.swing.Icon;

import fknappe.alieninvasion.patterns.Command;
import fknappe.alieninvasion.patterns.Controller;

/**
 * Classe responsavel por criar um botao que sera responsavel
 * pela acao de pausar a execucao do jogo
 * 
 * @author fknappe
 *
 */
public class JButtonPauseGame extends javax.swing.JButton implements Command {

	// Declaracao das variaveis de instancia
	/**
	 * @uml.property  name="med"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Controller med;
	
	/**
	 * Construtor
	 * Constroi uma nova instancia do botao com o icone
	 * especificado
	 * 
	 * @param Icon ic
	 * @param Controlador m
	 */
	public JButtonPauseGame(Icon ic, Controller m) {
		this.setIcon(ic);
		this.med = m;
	}
	
	@Override
	public void executar() {
		this.med.pausar();
	}
}
