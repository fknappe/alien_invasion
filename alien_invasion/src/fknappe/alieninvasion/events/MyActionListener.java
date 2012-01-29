package fknappe.alieninvasion.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fknappe.alieninvasion.patterns.Command;

/**
 * Classe responsavel por registrar todos os eventos
 * da GUI
 * 
 * @author fknappe
 *
 */
public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Command cmd = (Command)e.getSource();
		cmd.executar();
	}
}
