package estudos.dev_media;

public class Cobranca {
	private Fatura fatura = new Fatura();
	private double porcentagemDesconto;
	private double valorTotal;

	public void multaAPagar() {

		double multa = fatura.getValor();

		porcentagemDesconto = 0.01;

		valorTotal = multa - (multa * porcentagemDesconto);

		System.out.println("A multa a pagar é " + valorTotal);
	}
}