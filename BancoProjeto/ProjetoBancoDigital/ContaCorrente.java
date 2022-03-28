package ProjetoBancoDigital;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("__\tEXTRATO (CONTA CORRENTE)\t__");
		this.imprimirStatusConta();
		
	}

}
