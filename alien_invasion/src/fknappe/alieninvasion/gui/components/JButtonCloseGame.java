package fknappe.alieninvasion.gui.components;

import javax.swing.Icon;

import fknappe.alieninvasion.patterns.Command;
import fknappe.alieninvasion.patterns.Controller;

public class JButtonCloseGame extends javax.swing.JButton implements Command {

	// Declaracao das variaveis de instancia
	/**
	 * @uml.property  name="med"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Controller med;
	
	public JButtonCloseGame(Icon ic, Controller m) {
		this.setIcon(ic);
		this.med = m;
	}
	
	@Override
	public void executar() {
		this.med.sair();	
	}
}
