package estudos.dev_media;


import java.math.BigDecimal;

// imports omitidos

public class Subtracao implements Operacao {

  @Override
  public BigDecimal calcular(BigDecimal x, BigDecimal y) {
    BigDecimal resultado = null;
    // se nenhum dos operadores for nulo
    resultado = (x != null && y != null ? x.subtract(y) : null);
    return resultado;
  }