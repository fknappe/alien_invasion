package fknappe.alieninvasion.utils;

import java.awt.Component;
import java.awt.DefaultKeyboardFocusManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Classe responsavel por apresentar as mensagens ao usuario do sistema
 * 
 * @author fknappe
 *
 */
public class Messages {

	/**
	 * Metodo responsavel por apresentar uma mensagem de confirmacao ao usuario
	 * 
	 * @param Component componente
	 * @param String mensagem
	 * 
	 * @return boolean
	 */
	public static boolean confirmaMensagem(Component componente, String mensagem) {
		final JOptionPane j = new JOptionPane(mensagem, JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION, null);
		j.setComponentOrientation(((componente == null) ?
				JOptionPane.getRootFrame() : componente).getComponentOrientation());
		final Component componenteFoco = DefaultKeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
		JDialog dialog = j.createDialog(componente, "Confirmar");
		dialog.setVisible(true);
		dialog.addWindowListener(new WindowAdapter() {

			public void windowDeactivated(WindowEvent e) {
				if(componenteFoco != null && (j.getValue().equals(JOptionPane.CLOSED_OPTION) || ((Integer)j.getValue()).equals(JOptionPane.NO_OPTION))) {
					componenteFoco.requestFocus();
				}
			}

		});
		return j.getValue().equals(JOptionPane.YES_OPTION);
	}
	
	/**
	 * Metodo responsavel por apresentar as mensagens de erro ao usuario
	 * 
	 * @param Component componente
	 * @param String erro
	 * 
	 * @return void
	 */
	public static void mostraErro(final Component componente, String erro) {
		JOptionPane j = new JOptionPane(erro, JOptionPane.ERROR_MESSAGE);
		j.setComponentOrientation(((componente == null) ?
				JOptionPane.getRootFrame() : componente).getComponentOrientation());

		final Component componenteFoco = DefaultKeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
		JDialog dialog = j.createDialog(componente, "ERRO!");
		dialog.addWindowListener(new WindowAdapter() {

			@Override
			public void windowDeactivated(WindowEvent e) {
				if(componenteFoco != null) {
					componenteFoco.requestFocus();
				}
			}

		});
		dialog.setVisible(true);
	}
	
	/**
	 * Metodo responsavel por apresentar as mensagens informativas ao usuario
	 * 
	 * @param Component componente
	 * @param String mensagem
	 * 
	 * @return void
	 */
	public static void mostraMensagem(final Component componente, String mensagem) {
		JOptionPane j = new JOptionPane(mensagem, JOptionPane.INFORMATION_MESSAGE);
		j.setComponentOrientation(((componente == null) ?
				JOptionPane.getRootFrame() : componente).getComponentOrientation());

		final Component componenteFoco = DefaultKeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
		JDialog dialog = j.createDialog(componente, "");
		dialog.addWindowListener(new WindowAdapter() {

			@Override
			public void windowDeactivated(WindowEvent e) {
				if(componenteFoco != null) {
					componenteFoco.requestFocus();
				}
			}

		});
		dialog.setVisible(true);
	}
	
	/**
	 * Metodo responsavel por apresentar as informacoes sobre o(s) autor(es) deste projeto
	 * 
	 * @param Component componente
	 * @param String mensagem
	 * 
	 * @return void
	 */
	public static void mostraMensagemSobre(final Component componente, String mensagem) {
		JOptionPane j = new JOptionPane(mensagem, JOptionPane.PLAIN_MESSAGE);
		j.setComponentOrientation(((componente == null) ?
				JOptionPane.getRootFrame() : componente).getComponentOrientation());

		final Component componenteFoco = DefaultKeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
		JDialog dialog = j.createDialog(componente, "");
		dialog.addWindowListener(new WindowAdapter() {

			@Override
			public void windowDeactivated(WindowEvent e) {
				if(componenteFoco != null) {
					componenteFoco.requestFocus();
				}
			}

		});
		dialog.setVisible(true);
	}
	
	/**
	 * Metodo responsavel por receber os dados de entrada do usuario 
	 * e converte-los em um valor inteiro
	 * 
	 * @param String mensagem
	 * @return int
	 * @throws NumberFormatException
	 */
	public static int entradaDeDadosInteiros(String mensagem) throws NumberFormatException {
		String valor = JOptionPane.showInputDialog(
				null, 
				mensagem, 
				JOptionPane.INFORMATION_MESSAGE
		);
		int vl = 0;
		if(valor != null) {
			vl = Integer.parseInt(valor);
		}
		return vl;
	}
	
	/**
	 * Metodo responsavel por receber os dados de entrada do usuario 
	 * e converte-los em um valor ponto flutuante
	 * 
	 * @param String mensagem
	 * @return int
	 * @throws NumberFormatException
	 */
	public static double entradaDeDadosDouble(String mensagem) throws NumberFormatException {
		String valor = JOptionPane.showInputDialog(
				null, 
				mensagem, 
				JOptionPane.INFORMATION_MESSAGE
		);
		double vl = 0;
		if(valor != null) {
			vl = Double.parseDouble(valor);
		}
		return vl;
	}
}
