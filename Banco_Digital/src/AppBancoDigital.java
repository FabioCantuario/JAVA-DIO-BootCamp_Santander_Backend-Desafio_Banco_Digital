import java.util.Scanner;

public class AppBancoDigital {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cliente clienteCC = new Cliente();
		Cliente clienteCP = new Cliente();
		
		String titular;
		//double saldoCC, saldoCP;
		
		System.out.print("Digite o titular para CC: ");
		titular = sc.nextLine(); 
		clienteCC.setNome(titular);
		
		
		System.out.print("Digite o titular para CP: ");
		titular = sc.nextLine();
		clienteCP.setNome(titular);
		
		Conta corrente = new ContaCorrente(clienteCC);
		Conta poupanca = new ContaPoupanca(clienteCP);
		
		
		corrente.extratoBancario();
		poupanca.extratoBancario();
		System.out.println();
		
		corrente.depositar(500);
		corrente.extratoBancario();
		poupanca.extratoBancario();
		System.out.println();
		
		corrente.sacar(200);
		corrente.extratoBancario();
		poupanca.extratoBancario();
		System.out.println();
		
		corrente.transferir(poupanca, 400);
		corrente.extratoBancario();
		poupanca.extratoBancario();
		
		sc.close();


	}

}
