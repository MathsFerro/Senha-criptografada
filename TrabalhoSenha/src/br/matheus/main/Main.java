package br.matheus.main;

import java.util.Scanner;
import br.matheus.pilha.PilhaChar;
import br.matheus.pilha.PilhaChar.RetornoChar;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PilhaChar pilha = new PilhaChar();

		String auxSenha = "";
		if (pilha.isEmpty()) {
			System.out.print("Digite a senha que você quer armazenar: ");
			pilha.senha = scan.nextLine();
			pilha.N = pilha.senha.length();
			pilha.dados = new char[pilha.N];
			for (int x = 0; x < pilha.senha.length(); x++) {
				pilha.push(pilha.senha.charAt(x));
			}
			String senhaInvertida[] = new String[pilha.N];
			for (int x = pilha.senha.length() - 1; x >= 0; x--) {
				RetornoChar aux = pilha.pop();
				switch (aux.elem) {
				case 'a':
					senhaInvertida[x] = String.valueOf(aux.elem = '@');
					break;
				case 's':
					senhaInvertida[x] = String.valueOf(aux.elem = '$');
					break;
				case 'r':
					senhaInvertida[x] = String.valueOf(aux.elem = '*');
					break;
				case 'e':
					senhaInvertida[x] = String.valueOf(aux.elem = '&');
					break;
				case 'i':
					senhaInvertida[x] = String.valueOf(aux.elem = '!');
					break;
				case 'o':
					senhaInvertida[x] = String.valueOf(aux.elem = '(');
					break;
				case 'u':
					senhaInvertida[x] = String.valueOf(aux.elem = '+');
					break;
				}
				senhaInvertida[x] = String.valueOf(aux.elem);
				System.out.print(senhaInvertida[x].toUpperCase());
			}
		}


	}
}
