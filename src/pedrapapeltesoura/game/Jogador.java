package pedrapapeltesoura.game;

import java.util.Scanner;

public class Jogador {
	
	Scanner sc = new Scanner(System.in);
	int usuario = sc.nextInt();
	
	public int player() {
		if(usuario==1||usuario==2||usuario==3){
			if(usuario==1) {System.out.println("\n\nJogador: [ 1 ] -> Pedra");}
			else if(usuario==2) {System.out.println("\n\nJogador: [ 2 ] -> Papel");}
			else if(usuario==3) {System.out.println("\n\nJogador: [ 3 ] -> Tesoura");}
			
			return usuario;
			}
		else {System.out.println("\nValor inválido");return player();}
	}

}
