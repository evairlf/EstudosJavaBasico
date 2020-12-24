package estudos.dev_media;

import java.math.BigDecimal;

public class Calculadora {

    private static final BigDecimal ZERO = new BigDecimal(0);

    private static BigDecimal x = Calculadora.ZERO;
    private static BigDecimal y = Calculadora.ZERO;
    private static BigDecimal z = Calculadora.ZERO;

    private static String opcao = "";

    public static void main(String[] args) {

      Operacao operacao = null;
      solicitarOperacao();

      // Se nada foi informado
      if ("".equals(opcao)) {
        apresentarMensagemOpcaoInvalida();
      }
      else {
        // mudar todas as letras para mai�sculas...
        opcao = opcao.toUpperCase();

        // Se mais de uma letra foi informada, apenas a primeira ser� considerada
        char opt = opcao.charAt(0);

        // verificamos se a letra est� entre aquelas que nos interessam
        switch (opt) {

          // Para cada op��o escolhida instanciamos uma especializa��o
          // de Operacao
          case 'A':
            operacao = new Adicao();
            break;
          case 'D':
            operacao = new Divisao();
            break;
          case 'M':
            operacao = new Multiplicacao();
            break;
          case 'S':
            operacao = new Subtracao();
            break;
          default:
            apresentarMensagemOpcaoInvalida();

        }
        solicitarValores();
        z = operacao.calcular(x, y);
        apresentarResultado();
      }

    }

    private static void apresentarResultado() {

      StringBuilder sbMsg = new StringBuilder("");
      sbMsg.append("Resultado: \n");
      sbMsg.append(z);

      JOptionPane.showMessageDialog(null, sbMsg.toString(), "Calculadora",
          JOptionPane.INFORMATION_MESSAGE);
      System.exit(0);
    }

    private static void apresentarMensagemOpcaoInvalida() {

      StringBuilder sbMsg = new StringBuilder("");
      sbMsg.append("Nenhuma op��o v�lida informada! \n");
      sbMsg.append("Abandonando o programa.");

      JOptionPane.showMessageDialog(null, sbMsg.toString(), "Calculadora",
          JOptionPane.WARNING_MESSAGE);
      System.exit(0);
    }

    private static void solicitarOperacao() {

      StringBuilder sbSolicitacao = new StringBuilder(
          "Escolha uma das op��es: \n");
      sbSolicitacao.append("A - Adi��o \n");
      sbSolicitacao.append("D - Divis�o \n");
      sbSolicitacao.append("M - Multiplica��o \n");
      sbSolicitacao.append("S - Subtra��o ");

      opcao = JOptionPane.showInputDialog(null, sbSolicitacao.toString(),
          "Calculadora", JOptionPane.QUESTION_MESSAGE);
    }

    private static void solicitarValores() {
      x = solicitarValor();
      y = solicitarValor();
    }

    private static BigDecimal solicitarValor() {

      NumberFormat numberFormat = new DecimalFormat("#,##0.00");
      // se um valor inv�lido for informado, o padr�o ser� ZERO
      BigDecimal valor = Calculadora.ZERO;
      String resposta = "";
      resposta = JOptionPane.showInputDialog(null, "Informe um valor",
          "Solicitar Valor", JOptionPane.QUESTION_MESSAGE);

      // se nada foi informado...
      if ("".equals(resposta)) { return valor; }
      // se a resposta for um valor n�o num�rico lan�ar� uma exce��o,
      // e neste caso vamos retornar o valor padr�o
      try {
        valor = new BigDecimal(numberFormat.parse(resposta).toString());
      }
      catch (ParseException e) {
        valor = Calculadora.ZERO;
      }
      return valor;

    }

  }