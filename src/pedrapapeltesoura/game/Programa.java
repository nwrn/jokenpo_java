package pedrapapeltesoura.game;

public class Programa {
	public static void main(String[] args) {
		

		System.out.printf("[ 1 ] -> Pedra\n[ 2 ] -> Papel\n[ 3 ] -> Tesoura\nSelecione: ");
		
		Jogador play = new Jogador();
		Bot robo = new Bot();
		Mecanica gameplay = new Mecanica();
		
		play.player();
		System.out.println(robo.bot());
		
		gameplay.jogo(play.usuario, robo.bot);
		
	}
}
