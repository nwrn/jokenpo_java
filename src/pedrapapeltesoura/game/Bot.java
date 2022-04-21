package pedrapapeltesoura.game;

import java.util.concurrent.ThreadLocalRandom;

public class Bot {
	
	int bot = ThreadLocalRandom.current().nextInt(1,4);
	
	public String bot() {
		String imprimaBot = null;
		if(bot==1) {imprimaBot = "Bot:     [ 1 ] -> Pedra";}
		else if(bot==2) {imprimaBot = "Bot:     [ 2 ] -> Papel";}
		else if(bot==3) {imprimaBot = "Bot:     [ 3 ] -> Tesoura";}
		return imprimaBot;
	}
	
}
