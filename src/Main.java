import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		Diretor diretor = new Diretor();
		
		System.out.println("Informe o NOME do GERENTE: ");
		String nomeGerente = sc.nextLine();
		
		System.out.println("Informe o IDADE do GERENTE: ");
		String idadeGerente = sc.nextLine();
		
		System.out.println("Informe o SALÁRIO do GERENTE: ");
		String salarioGerente = sc.nextLine();
		
		System.out.println("Informe o NOME do GERENTE: ");
		String bonusAnualGerente = sc.nextLine();
		
		Gerente gerente = new Gerente();
	}

}
