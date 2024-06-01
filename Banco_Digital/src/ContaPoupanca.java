
public class ContaPoupanca extends Conta {

	private double juros;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		this.juros = 0.1;
	}

	public double getJuros() {
		return juros;
	}
	
	@Override
	public void extratoBancario() {
		System.out.println("====== EXTRATO CONTA POUPANÇA ======");
		super.impressaoInfosComuns();
		System.out.println(String.format("Juros: %.2f", juros));
		
	}

}
