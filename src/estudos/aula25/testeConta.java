package estudos.aula25;

public class testeConta {

	public static void main(String[] args) {
		contaCorrente conta = new contaCorrente(344213,1500.34,true,500);
		conta.consultarChequeEspecial();
		System.out.println("Saldo: "+conta.consultarSaldo());
		conta.depositarDinheiro(1200.20);
		conta.realizaSaque(3000.24);
		
		System.out.println();
		
		contaCorrente conta1 = new contaCorrente(344213,1500.34,false,500);
		conta1.consultarChequeEspecial();
		System.out.println("Saldo: "+conta1.consultarSaldo());
		conta1.depositarDinheiro(1200.20);
		conta1.realizaSaque(3000.24);
	}

}
