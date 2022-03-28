package ProjetoBancoDigital;
public abstract  class Conta extends Cliente {

	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;

	protected int agencia, tipoConta;
	protected int numConta;
	protected double saldo;
	protected boolean status;
	protected String tipo;
	protected Cliente cliente;
	

	// MÉTODO CONTRUTOR 
	public Conta(Cliente cliente) { 
		this.agencia = AGENCIA_PADRAO;
		this.numConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void abrirConta(String t){
	        this.setTipo(t);
	        this.setStatus(true);
	        
	        if ("CC".equals(t)) {
	            this.setSaldo(50f);
	            tipoConta = 5;
	        } else if ("CP".equals(t)) {
	            this.setSaldo(150f);
	            tipoConta =7; 
	        }
	        
	        System.out.println("===============================================================");
	        System.out.println("Sr.(a) " + this.cliente.getNome() + " SUA CONTA FOI ABERTA COM SUCESSO!!!");
	        System.out.printf("Saldo Atual R$ %.2f ", this.saldo);
	        System.out.println("\n===============================================================");
	        System.out.println();
	    }
	 
	public void fecharConta(){
	        if (this.getSaldo() > 0) {
	            System.out.println("CONTA COM DINHEIRO!!! NÁO PODE SER FECHADA.");
	            System.out.println("Sr. (a), " + this.cliente.getNome() + " favor SACAR O TOTAL de sua conta");
	            System.out.println();    
	        }
	        else if(this.getSaldo() < 0) {
	            System.out.println("CONTA EM DÉBITO!!! NÁO PODE SER FECHADA.");
	                  
	        }
	        else {
	            this.setStatus (false);
	            System.out.println("CONTA FECHADA COM SUCESSO!!!");
	            System.out.println();
	        }
	    }

	public void sacar(double valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("====\tSAQUE\t=====");
				System.out.println("Realizado na Conta de " + this.cliente.getNome());
				System.out.printf("no valor de R$ %.2f", valor);
				System.out.println("\n");
				System.out.println();
			} else {
				System.out.println("SALDO INSUFICIENTE!!!");
			}
		} else {
			System.out.println("IMPOSSÍVEL SACAR!!!");
		}

	}

	public void depositar(double valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("====\tDEPÓSITO\t====");
			System.out.println("Realizado na conta de " + this.cliente.getNome());
			System.out.printf("no valor de R$ %.2f ",  valor);
			System.out.println("\n");
			System.out.println();
		} else {
			System.out.println("IMPOSSÍVEL DEPOSITAR!!!");
		}

	}

	public void trasnferir(double valor, Conta contaDestino) {

		if (this.getStatus()) {
			
			
			System.out.println("---- \tTRASNFERÊNCIA REALIZADA\t ---- ");
			System.out.println("Conta Origem: " + this.cliente.getNome());
			System.out.printf("Valor da Transação R$ %.2f", valor);
			System.out.println("\nConta Destino " + contaDestino.cliente.getNome());
			System.out.println();
			
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("IMPOSSÍVEL TRANSFERIR!!!");
		}

	}

	public void imprimirExtrato() {
	
	}

	protected void imprimirStatusConta() {
		
		System.out.println("Número Conta: 0000" + this.getNumConta()+ "-"+ tipoConta);
		System.out.println("Agència: 000" + this.getAgencia());
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.printf("Saldo: : R$ %.2f " , this.getSaldo());
		System.out.println("\nConta Ativa: " + this.getStatus());
		System.out.println();
	}
	
	public void listarClientes() {


}

	public void fichaClientes() {
	
	System.out.println("________\tFICHA CADASTRAL DE CLIENTE\t________");
	System.out.println("Num. Conta: 0000" + this.getNumConta() + "-"+ tipoConta +"  Agência: 000" + this.getAgencia() + "   Tipo: " + this.getTipo());
	System.out.println("Titular: " + this.cliente.getNome());
	System.out.println("Endereço: " + this.cliente.getEndereco());
	System.out.println("Data de Nasc: " + this.cliente.getDataNasc());
	System.out.println("Telefone: " + this.cliente.getTelefone());
	System.out.println("E-mail: " + this.cliente.getEmail());
	System.out.printf("Saldo Total : R$ %.2f ", this.getSaldo());
	System.out.println("\nStatus: Conta Ativa? " + this.getStatus());
	System.out.println("________________________________________________________");
	
}

	// MÉTODOS ESPECIAIS
	public int getAgencia() {
		return agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	

	

}