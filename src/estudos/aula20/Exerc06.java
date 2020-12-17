package estudos.aula20;
import java.util.Scanner;
public class Exerc06 {
	
	public static void main(String args[])
	   { 
	    Scanner sc = new Scanner(System.in);
	    String[][] jogo = new String[3][3];
	    String[] jogador = new String[2];
	    boolean win = true;
	    int jogada1 =0;
	    int jogada2 =0;
	    boolean valida = true;
	    
	   
	    //preenche jogador nome
	    for(int i = 0;i<jogador.length;i++){
	    System.out.println("digite o nome do "+(i+1)+"! jogador: ");
	    jogador[i] = sc.nextLine();
	    }
	    
	    //imprime jogo
	    for(int i =0;i<jogo.length;i++){
	      for(int j = 0;j<jogo[i].length;j++){
	        jogo[i][j] = "|-|";
	      }
	    }
	    
	    
	    /*imprime situacao
	    for(int i =0;i<jogo.length;i++){
	      System.out.println("");
	      for(int j = 0;j<jogo[i].length;j++){
	        System.out.print(jogo[i][j]);
	      }
	    }
	    */
	    
	    do{
	      
	      
	      
	      
	     int linha;
	     int coluna;
	    boolean jogada = true;
	      System.out.println("vez do jogador: "+jogador[0]);
	      System.out.println("voce possui o O");
	      System.out.println("a situacao do jogo e essa: ");
	      
	     for(int i =0;i<jogo.length;i++){
	      System.out.println("");
	      for(int j = 0;j<jogo[i].length;j++){
	        System.out.print(jogo[i][j]);
	      }
	      System.out.println("");
	    }
	    
	    
	    do{
	      
	      System.out.println("informe a linha e a coluna que deseja inserir o circulo: ");
	      linha = sc.nextInt()-1;
	      coluna = sc.nextInt()-1;
	      if((linha >=0 && linha <=2) && (coluna >=0 && coluna <=2)) {
	      if(jogo[linha][coluna] == "|X|" || jogo[linha][coluna] == "|O|"){
	        System.out.println("posicao ja ocupada use outra");
	        valida = true;
	      }else{
	        jogada2++;
	        valida = false;
	      }
	      }else {
	    	  System.out.println("Valor de linha ou coluna invalido!");
	    	  System.out.println("Valores validos para linha e coluna (1-2-3)");
	      }
	      }while(valida);
	      
	      jogada = true;
	       for(;jogada;){
	      for(;jogada;){
	        jogo[linha][coluna] = "|O|";
	        jogada1++;
	        jogada = false;
	      }
	    }
	      for(int i =0;i<jogo.length;i++){
	      System.out.println("");
	      for(int j = 0;j<jogo[i].length;j++){
	        System.out.print(jogo[i][j]);
	      }
	      System.out.println("");
	    }
	    //jogador 2
	    if(jogo[0][0]== "|O|" && jogo[0][1]=="|O|" && jogo[0][2]=="|O|"){
	      System.out.println("jogador "+jogador[0]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[1][0]== "|O|" && jogo[1][1]=="|O|" && jogo[1][2]=="|O|"){
	      System.out.println("jogador "+jogador[0]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[2][0]== "|O|" && jogo[2][1]=="|O|" && jogo[2][2]=="|O|"){
	      System.out.println("jogador "+jogador[0]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][1]== "|O|" && jogo[1][1]=="|O|" && jogo[2][1]=="|O|"){
	      System.out.println("jogador "+jogador[0]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][0]== "|O|" && jogo[1][1]=="|O|" && jogo[2][2]=="|O|"){
	      System.out.println("jogador "+jogador[0]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][2]== "|O|" && jogo[1][2]=="|O|" && jogo[2][0]=="|O|"){
	      System.out.println("jogador "+jogador[0]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][0]== "|O|" && jogo[1][0]=="|O|" && jogo[2][0]=="|O|"){
	      System.out.println("jogador "+jogador[0]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][2]== "|O|" && jogo[1][2]=="|O|" && jogo[2][2]=="|O|"){
	      System.out.println("jogador "+jogador[0]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][0]== "|X|" && jogo[0][1]=="|X|" && jogo[0][2]=="|O|"){
	      System.out.println("jogador "+jogador[1]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[1][0]== "|X|" && jogo[1][1]=="|X|" && jogo[1][2]=="|O|"){
	      System.out.println("jogador "+jogador[1]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[2][0]== "|X|" && jogo[2][1]=="|X|" && jogo[2][2]=="|O|"){
	      System.out.println("jogador "+jogador[1]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][1]== "|X|" && jogo[1][1]=="|X|" && jogo[2][1]=="|O|"){
	      System.out.println("jogador "+jogador[1]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][0]== "|X|" && jogo[1][1]=="|X|" && jogo[2][2]=="|O|"){
	      System.out.println("jogador "+jogador[1]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][2]== "|X|" && jogo[1][2]=="|X|" && jogo[2][0]=="|O|"){
	      System.out.println("jogador "+jogador[1]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][0]== "|X|" && jogo[1][0]=="|X|" && jogo[2][0]=="|O|"){
	      System.out.println("jogador "+jogador[1]+" Wins!");
	      win = false;
	      break;
	    }else if(jogo[0][2]== "|X|" && jogo[1][2]=="|X|" && jogo[2][2]=="|O|"){
	      System.out.println("jogador "+jogador[1]+" Wins!");
	      win = false;
	      break;
	    }
	    
	    
	      jogada = true;
	      System.out.println("vez do jogador: "+jogador[1]);
	      System.out.println("voce possui o X");
	      System.out.println("a situacao do jogo e essa: ");
	      
	     for(int i =0;i<jogo.length;i++){
	      System.out.println("");
	      for(int j = 0;j<jogo[i].length;j++){
	        System.out.print(jogo[i][j]);
	      }
	      System.out.println("");
	    }
	    
	    valida = true;
	    
	    do{
	      
	    	System.out.println("informe a linha e a coluna que deseja inserir o X: ");
		      linha = sc.nextInt()-1;
		      coluna = sc.nextInt()-1;
		      if((linha >=0 && linha <=2) && (coluna >=0 && coluna <=2)) {
		      if(jogo[linha][coluna] == "|X|" || jogo[linha][coluna] == "|O|"){
		        System.out.println("posicao ja ocupada use outra");
		        valida = true;
		      }else{
		        jogada2++;
		        valida = false;
		      }
		      }else {
		    	  System.out.println("Valor de linha ou coluna invalido!");
		    	  System.out.println("Valores validos para linha e coluna (1-2-3)");
		      }
		      }while(valida);
	      
	      jogada = true;
	       for(;jogada;){
	      for(;jogada;){
	        jogo[linha][coluna] = "|X|";
	        jogada2++;
	        jogada = false;
	      }
	    }
	      for(int i =0;i<jogo.length;i++){
	      System.out.println("");
	      for(int j = 0;j<jogo[i].length;j++){
	        System.out.print(jogo[i][j]);
	      }
	      System.out.println("");
	    }
	     
	    
	      
	    
	    
	      
	    
	        
	      
	    }while(win);
	    
	    
	    

	   }
	 }