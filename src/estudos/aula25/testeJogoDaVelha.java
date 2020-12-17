package estudos.aula25;

import java.util.*;

public class testeJogoDaVelha{
    public static void main ( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        jogoDaVelha jogo = new jogoDaVelha();
        char sinal = '0';
        int linha  = 0;
        int coluna = 0;
        boolean ganhador = false;
        boolean validar = false;

        System.out.println("jogador 1 possui os X");
        System.out.println("jogador 2 possui os O");

        jogo.nomeJogadores();

        while ( !ganhador )
        {
            if ( jogo.verificaJogador() )
            {
                System.out.println("vez do jogador 1");
                sinal = 'X';
            }
            else
            {
                System.out.println("vez do jogador 2");
                sinal = 'O';
            }

            jogo.imprimeJogo();
            validar = false;
            while ( !validar )
            {

                System.out.println("digite a linha e a coluna que deseja inserir o " + sinal);
                System.out.println("Posicoes permitidas (1-2-3)");
                linha = sc.nextInt() - 1;
                coluna = sc.nextInt() - 1;

                if ( jogo.verificarJogada(linha, coluna) )
                {
                    if ( jogo.verificaSeJaTem(linha, coluna) )
                    {
                        validar = true;
                    }
                    else
                    {
                        System.out.println("posicao ja usada tente novamente");
                        validar = false;
                    }
                }
                else
                {
                    System.out.println("valor invalido tente novamente");
                    jogo.imprimeJogo();
                }
            }

            jogo.insereNoJogo(linha, coluna, sinal);
            if ( jogo.verificarGanhador(sinal) ){
            ganhador = true;
            if(sinal == 'X'){
                System.out.println("jogador 1 venceu!");
                System.out.println("Parabens "+jogo.saberNome(0)+"!");
                jogo.imprimeJogo();
            }else{
                System.out.println("Jogador 2 venceu!");
                System.out.println("Parabens "+jogo.saberNome(1)+"!");
                jogo.imprimeJogo();
            }
            }
        }

    }

}