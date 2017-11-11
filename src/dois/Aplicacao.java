package dois;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws FileNotFoundException {

		FactoryLogger factory = new FactoryLogger();
		Scanner s = new Scanner(System.in);
		System.out.println("Digite 'a' para registrar em arquivo ou 'c' para console");
		String opcao = s.next();
		System.out.println("Digite uma verbosidade");
		int opcaoo = s.nextInt();
		factory.getLogger(opcaoo, opcao);

		s.close();
	}

}
