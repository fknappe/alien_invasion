package fknappe.alieninvasion.patterns;

import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;

import fknappe.alieninvasion.main.view.MainWindow;

/**
 * Classe abstrata responsavel por intermediar as ações
 * da GUI com o restante da aplicacao
 * 
 * @author fknappe
 *
 */
public abstract class Controller {
	
	//Declaracao das variaveis de instancia
	/**
	 * @uml.property  name="frame"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	protected MainWindow frame = null;
	
	/**
	 * Construtor
	 * @param JFrame j
	 */
	public Controller(MainWindow j) {
		this.frame = j;
	}
	
	/**
	 * Metodo responsavel por posicionar a janela interna dentro do desktop
	 * @param JInternalFrame j
	 * @return void
	 */
	public void lancarFrame(JInternalFrame j) {
		if(this.frame != null) {
			j.setLocation((frame.getWidth() / 2) - (j.getWidth() / 2), (frame.getHeight() / 2) - (j.getHeight() / 2) - 20);
			frame.getLayeredPane().add(j);
			j.setVisible(true);
			j.toFront();
			
			try {
				j.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		}
	}
	
	public abstract void registraEventos();
	public void iniciar(){}
	public void pausar(){}
	public void parar(){}
	public void silenciar(){}
	public void sair(){}
}


