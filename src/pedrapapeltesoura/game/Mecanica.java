package pedrapapeltesoura.game;

public class Mecanica {

	public int jogo(int jogador, int bot) {
		if(jogador==bot) {System.out.println("Empate");}
		else if(jogador==1&&bot==2) {System.out.println("Bot Ganhou!");}
		else if(jogador==1&&bot==3) {System.out.println("Jogador Ganhou!");}
		else if(jogador==2&&bot==1) {System.out.println("Jogador Ganhou!");}
		else if(jogador==2&&bot==3) {System.out.println("Bot Ganhou!");}
		else if(jogador==3&&bot==1) {System.out.println("Bot Ganhou!");}
		else if(jogador==3&&bot==2) {System.out.println("Jogador Ganhou!");}
		
		return 0;
	}
	
}
