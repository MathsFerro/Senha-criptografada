package br.matheus.main;

import java.util.Scanner;
import br.matheus.pilha.PilhaChar;
import br.matheus.pilha.PilhaChar.RetornoChar;

public class SalvarSenha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PilhaChar pilha = new PilhaChar();

		System.out.print("Digite a senha que você quer armazenar: ");
		pilha.senha = scan.nextLine();
		pilha.N = pilha.senha.length();
		pilha.dados = new char[pilha.N];

		for (int x = 0; x < pilha.senha.length(); x++) {
			pilha.push(pilha.senha.charAt(x));
		}

		String auxSenha = "";
		String senhaInvertida[] = new String[pilha.N];
		int x = pilha.senha.length() - 1;
		while (!pilha.isEmpty()) {
			pilha.pop();
			switch (pilha.senha.charAt(x)) {
			case 'a':
				pilha.dados[x] = '@';
				break;
			case 's':
				pilha.dados[x] = '$';
				break;
			case 'r':
				pilha.dados[x] = '*';
				break;
			case 'e':
				pilha.dados[x] = '&';
				break;
			case 'i':
				pilha.dados[x] = '!';
				break;
			case 'o':
				pilha.dados[x] = '(';
				break;
			case 'u':
				// pilha.senhaInvertida = pilha.senhaInvertida.replace("u", "+");
				pilha.dados[x] = '+';
				break;
			}
			auxSenha = auxSenha + String.valueOf(pilha.dados[x]);
			x--;
		}
		System.out.println("Senha criptografada: "+auxSenha.toUpperCase());

	}

	/*
	 * for (int x = pilha.senha.length() - 1; x >= 0; x--) { RetornoChar aux =
	 * pilha.pop(); switch (aux.elem) { case 'a': senhaInvertida[x] =
	 * String.valueOf(aux.elem = '@'); break; case 's': senhaInvertida[x] =
	 * String.valueOf(aux.elem = '$'); break; case 'r': senhaInvertida[x] =
	 * String.valueOf(aux.elem = '*'); break; case 'e': senhaInvertida[x] =
	 * String.valueOf(aux.elem = '&'); break; case 'i': senhaInvertida[x] =
	 * String.valueOf(aux.elem = '!'); break; case 'o': senhaInvertida[x] =
	 * String.valueOf(aux.elem = '('); break; case 'u': senhaInvertida[x] =
	 * String.valueOf(aux.elem = '+'); break;
	 * 
	 * } senhaInvertida[x] = String.valueOf(aux.elem);
	 * System.out.print(senhaInvertida[x].toUpperCase()); }
	 */
}
