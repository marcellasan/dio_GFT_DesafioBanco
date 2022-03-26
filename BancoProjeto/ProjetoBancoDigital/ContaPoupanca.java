package ProjetoBancoDigital;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("____EXTRATO (CONTA POUPANÇA)_____");
		this.imprimirStatusConta();
	}
}
