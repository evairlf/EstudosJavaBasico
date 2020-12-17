package estudos.aula17;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String usuario;
		String senha;
		
		do {
		System.out.println("Digite a um usuário: ");
		usuario = sc.next();
		System.out.println("Digite a senha: ");
		senha = sc.next();
		
		if(senha.equalsIgnoreCase(usuario)) {
			System.out.println("Erro: senha igual usuario, mude o usuario ou sua senha!");
		}else {
			System.out.println("Cadastro Efetuado com sucesso!");
		}
		
		}while(senha.equalsIgnoreCase(usuario));
		System.out.println("Usuario: "+usuario+"\nSenha: "+senha);
	}

}
