package estudos.dev_media;

import java.math.BigDecimal;

public class Multiplicacao implements Operacao {

    @Override
    public BigDecimal calcular(BigDecimal x, BigDecimal y) {
      BigDecimal resultado = null;
      // se nenhum dos operadores for nulo
      resultado = (x != null && y != null ? x.multiply(y) : null);
      return resultado;
    }
  }