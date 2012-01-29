package fknappe.alieninvasion.gui.components;

import javax.swing.Icon;

import fknappe.alieninvasion.patterns.Command;
import fknappe.alieninvasion.patterns.Controller;

/**
 * Classe responsavel por criar um botao responsavel pela acao
 * de parar a execucao do jogo
 * 
 * @author fknappe
 *
 */
public class JButtonStopGame extends javax.swing.JButton implements Command {

	// Declaracao das variaveis de instancia
	/**
	 * @uml.property  name="med"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Controller med;
	
	/**
	 * Construtor
	 * Constroi uma instancia do botao com um icone especificado
	 * 
	 * @param Icon ic
	 * @param Controlador m
	 */
	public JButtonStopGame(Icon ic, Controller m) {
		this.setIcon(ic);
		this.med = m;
	}
	
	@Override
	public void executar() {
		this.med.parar();
	}
}
