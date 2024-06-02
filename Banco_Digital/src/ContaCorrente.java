
public class ContaCorrente extends Conta {

	private double limiteEmprestimo;
	private double tarifaServico;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.limiteEmprestimo = 500;
		this.tarifaServico = 0.01;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public double getTarifaServico() {
		return tarifaServico;
	}

	public void emprestarLimite() {

	}

	@Override
	public void extratoBancario() {
		System.out.println("====== EXTRATO CONTA CORRENTE ======");
		super.impressaoInfosComuns();
		System.out.println(String.format("Limite: %.2f", limiteEmprestimo));
		System.out.println(String.format("Tarifa: %.2f", tarifaServico));

	}

}
