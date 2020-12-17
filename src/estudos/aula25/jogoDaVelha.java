package estudos.aula25;

import java.util.*;
// Compiler version JDK 11.0.2

class jogoDaVelha {
	Scanner sc = new Scanner(System.in);
	char[][] jogo = new char[3][3];
	String[] nome = new String[2];
	int jogador = 1;

	public void imprimeJogo() {
		for (int i = 0; i < jogo.length; i++) {

			System.out.println("");
			for (int j = 0; j < jogo[i].length; j++) {
				System.out.print(jogo[i][j] + " | ");
			}
		}
		System.out.println();
	}

	public void nomeJogadores() {
		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite o nome do " + (i + 1) + "° jogador");
			nome[i] = sc.nextLine();
		}
	}

	public String saberNome(int i) {
		return nome[i];
	}

	public boolean verificaJogador() {
		if (jogador % 2 == 1) {
			jogador++;
			return true;
		}
		jogador++;
		return false;
	}

	public boolean verificarJogada(int linha, int coluna) {
		if (linha >= 0 && linha <= 2 && coluna >= 0 && coluna <= 2) {
			return true;
		}
		return false;
	}

	public boolean verificaSeJaTem(int linha,int coluna){
        if(jogo[linha][coluna] == 'X'  || jogo[linha][coluna] == 'O' ){
        return false;
        }
        return true;
    }

	public void insereNoJogo(int linha, int coluna, char sinal) {
		jogo[linha][coluna] = sinal;

	}

	public boolean verificarGanhador ( char sinal ){


    if((jogo[0][0]== sinal && jogo[0][1]==sinal && jogo[0][2]==sinal)||
        (jogo[1][0]== sinal && jogo[1][1]==sinal && jogo[1][2]==sinal)||
        (jogo[2][0]== sinal && jogo[2][1]==sinal && jogo[2][2]==sinal)||
        (jogo[0][1]== sinal && jogo[1][1]==sinal && jogo[2][1]==sinal)||
        (jogo[0][0]== sinal && jogo[1][1]==sinal && jogo[2][2]==sinal)||
        (jogo[0][2]== sinal && jogo[1][2]==sinal && jogo[2][0]==sinal)||
        (jogo[0][0]== sinal && jogo[1][0]==sinal && jogo[2][0]==sinal)||
        (jogo[0][2]== sinal && jogo[1][2]==sinal && jogo[2][2]==sinal)||
        (jogo[0][2]== sinal && jogo[1][1]==sinal && jogo[2][0]==sinal)){
        return true;
        }
        return false;
    }
}