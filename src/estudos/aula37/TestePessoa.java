package estudos.aula37;

import java.util.ArrayList;

public class TestePessoa {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		//Criando Pessoa Juridica
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setCnpj("76.788.084/0001-31");
		pj1.setNome("Gustavao da motoneta");
		pj1.setRendaBruta(10000);
		pessoas.add(pj1);
		//------------
		PessoaJuridica pj2 = new PessoaJuridica();
		pj2.setCnpj("12.294.426/0001-84");
		pj2.setNome("Loja de Crack");
		pj2.setRendaBruta(100000000);
		pessoas.add(pj2);
		//------------
		PessoaJuridica pj3 = new PessoaJuridica();
		pj3.setCnpj("71.158.817/0001-30");
		pj3.setNome("Lampadas e Maçanetas");
		pj3.setRendaBruta(15000);
		pessoas.add(pj3);
		
		//Criando Pessoa Fisica
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setCpf("033.238.500-09");
		pf1.setNome("Evair Leite Feldmann");
		pf1.setSalario(1500);
		pessoas.add(pf1);
		//------------
		PessoaFisica pf2 = new PessoaFisica();
		pf2.setCpf("026.617.960-61");
		pf2.setNome("Macarrão de queijo");
		pf2.setSalario(2500);
		pessoas.add(pf2);
		//-------------
		PessoaFisica pf3 = new PessoaFisica();
		pf3.setCpf("409.733.810-27");
		pf3.setNome("Couve Frita no Almoço");
		pf3.setSalario(4000);
		pessoas.add(pf3);

		System.out.println(pessoas.toString().replace("[", "").replace("]", "").replace(",", "\n------------------------------\n"));
	}

}
