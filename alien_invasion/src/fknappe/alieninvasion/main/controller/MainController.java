package fknappe.alieninvasion.main.controller;

import fknappe.alieninvasion.patterns.Controller;
import fknappe.alieninvasion.main.view.MainWindow;

/**
 * Classe responsavel por intemediar as acoes do jogador
 * com o aplicativo
 * 
 * @author fknappe
 *
 */
public class MainController extends Controller {

	/**
	 * Construtor
	 * Constroi uma instancia do controlador para
	 * mediar as acoes do usuario com a janela
	 * especificada
	 * 
	 * @param j
	 */
	public MainController(MainWindow j) {
		super(j);
	}
	
	/*
	 * TODO implementar as acoes dos eventos da GUI 
	 */
	@Override
	public void registraEventos() {

	}
	
	/*
	 * TODO implementar a acao de inicializar o jogo 
	 */
	public void iniciar() {
		
	}
	
	/*
	 * TODO implementar a acao de pausar o jogo 
	 */
	public void pausar() {
		
	}
	
	/*
	 * TODO implementar a acao de parar o jogo
	 *
	 */
	public void parar() {
		
	}
	
	/*
	 * TODO implementar a acao de silenciar o jogo 
	 */
	public void silenciar() {
		
	}
}
