
import java.util.Scanner;

public class AppBancoDigital {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cliente clienteCC = new Cliente();
		Cliente clienteCP = new Cliente();

		String titularNome;
		long titularCpf;

		System.out.print("Digite o titular para CC: ");
		titularNome = sc.nextLine();
		clienteCC.setNome(titularNome);
		System.out.print("Digite o CPF do titular: ");
		titularCpf = sc.nextLong();
		sc.nextLine();
		clienteCC.setCpf(titularCpf);

		System.out.print("Digite o titular para CP: ");
		titularNome = sc.nextLine();
		clienteCP.setNome(titularNome);
		System.out.print("Digite o CPF do titular: ");
		titularCpf = sc.nextLong();
		sc.nextLine();
		clienteCP.setCpf(titularCpf);

		Conta corrente = new ContaCorrente(clienteCC);
		Conta poupanca = new ContaPoupanca(clienteCP);
 // Extrato da Conta após criada
		corrente.extratoBancario();
		poupanca.extratoBancario();
		System.out.println();
// Extrato da Conta com deposito
		corrente.depositar(500);
		corrente.extratoBancario();
		poupanca.extratoBancario();
		System.out.println();
// Extrato da Conta após saque
		corrente.sacar(200);
		corrente.extratoBancario();
		poupanca.extratoBancario();
		System.out.println();
// Extrato da Conta após transferencia
		corrente.transferir(poupanca, 150);
		corrente.extratoBancario();
		poupanca.extratoBancario();

		sc.close();

	}

}
