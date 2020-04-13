package br.matheus.main;

import java.util.Scanner;

import br.matheus.func.Funcs;
import br.matheus.pilha.PilhaChar;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PilhaChar pilha = new PilhaChar();

		String auxSenha="";
		if (pilha.isEmpty()) {
			System.out.print("Digite a senha que você quer armazenar: ");
			pilha.senha = scan.nextLine();
			for (int x = 0; x < pilha.senha.length(); x++) {
				pilha.push(pilha.senha.charAt(x));
			}	
			for (int x = pilha.senha.length() - 1; x >= 0; x--) {
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
					//pilha.senhaInvertida = pilha.senhaInvertida.replace("u", "+");
					pilha.dados[x] = '+';
					break;
				}
				auxSenha = auxSenha + String.valueOf(pilha.dados[x]);
			}
			System.out.println("Senha invertida encriptografada: "+ auxSenha.toUpperCase());			
		} else {
			System.out.println("Pilha está full");
		}
	}

}
