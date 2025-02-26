package helloWorld;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner( System.in);
		System.out.println("Digite um nome: ");
		String nome = scan.next();
		System.out.println("Hello " + nome +", World !");
	}

}
