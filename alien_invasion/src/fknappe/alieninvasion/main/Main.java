package fknappe.alieninvasion.main;

import java.awt.DisplayMode;

import fknappe.alieninvasion.main.view.MainWindow;


public class Main {
	
	public static void main(String[] args) {

        // Declaracao das variaveis locais
		DisplayMode displayMode = null;

        if (args.length == 3) {
            displayMode = new DisplayMode(
                Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2]),
                DisplayMode.REFRESH_RATE_UNKNOWN);
        }
        else {
            displayMode = new DisplayMode(800, 600, 16,
                DisplayMode.REFRESH_RATE_UNKNOWN);
        }

        MainWindow game = new MainWindow("Alien Invasion");
        //game.run(displayMode);
    }
}
