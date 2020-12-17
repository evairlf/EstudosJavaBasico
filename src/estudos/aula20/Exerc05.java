package estudos.aula20;
import java.util.Scanner;

public class Exerc05 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[][][] agenda = new String[12][30][8];
    boolean confirm = true;
    boolean sair = true;
    char confirma;
    int hora;
    int dia;
    int mes;
    
    do {
      mes =0;
      dia = 0;
      hora = 0;
    System.out.println("digite o mes do compromisso: ");
    mes = sc.nextInt()-1;
    System.out.println("Digite o dia que quer agendar algo: ");
    dia = sc.nextInt()-1;
    System.out.println("Digite a hora do dia que deseja: ");
    hora = sc.nextInt()-1;
    do {
    if(dia<30 && hora<24) {
      do {
        System.out.println("Digite o compromisso: ");
        agenda[mes][dia][hora] = sc.nextLine();
        agenda[mes][dia][hora] += sc.nextLine();
        System.out.println("Compromisso registrado com sucesso!");
        System.out.println("Deseja registrar outro?");
        confirma = sc.next().charAt(0);
        if(confirma == 's' || confirma == 'S') {
          sair = true;
          confirm = false;
        }else {
          System.out.println("Ok");
          sair = false;
          confirm = false;
        }
      }while(confirm);
    }else {
      System.out.println("Nº invalido!");
      System.out.println("Deseja tentar novamente?");
      confirma = sc.next().charAt(0);
      if(confirma == 's' || confirma == 'S') {
        sair = true;
        confirm = true;
      }else {
        System.out.println("Ok");
        sair = false;
        confirm = false;
      }
    }
    }while(confirm);
  }while(sair);
  boolean out = false;
  do{
    System.out.println("Selecione o mes: ");
    int mez = sc.nextInt()-1;
    System.out.println("qual dia deseja ver os compromissos?");
    int compro = sc.nextInt()-1;
    System.out.println("qual a hora?");
    
      System.out.println("Compromisso dia -- "+compro);
      for(int j = 0;j<8 ;j++) {
    	  if(agenda[mez][compro][j]!=null) {
        System.out.println("Hora :"+(j+1)+" Compromisso: "+agenda[mez][compro][j]);
      }
      }
  }while(out);
  }
}