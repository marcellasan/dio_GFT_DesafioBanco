package ProjetoBancoDigital;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("___\tEXTRATO (CONTA POUPANÇA)\t___");
		this.imprimirStatusConta();
	}
}
