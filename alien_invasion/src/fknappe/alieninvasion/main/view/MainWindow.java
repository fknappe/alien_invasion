package fknappe.alieninvasion.main.view;

import fknappe.alieninvasion.main.controller.MainController;

public class MainWindow extends javax.swing.JFrame {
	
	// Declaracao das variaveis de instancia
	private MainController med;
	
	/**
	 * Construtor
	 * Controi uma nova instancia da janela
	 * principal do jogo com o titulo especificado
	 * 
	 * @param String title
	 */
	public MainWindow(String title) {
		super(title);
		this.med = new MainController(this);
		this.initComponents();
		this.med.registraEventos();
	}
	
	/*
	 * TODO implementar GUI
	 */
	public void initComponents() {
		
	}
}
