package ProjetoBancoDigital;
public class Main {

	public static void main(String[] args) {
		Banco bc = new Banco();
		Cliente usuario1 = new Cliente();
		Cliente usuario2 = new Cliente();
				
		
		
		Conta cc = new ContaCorrente(usuario1);
		usuario1.setNome("Alberto Rodrigues");
		usuario1.setEndereco("Rua das margaridas num. 24 - São Paulo");
		usuario1.setDataNasc("23/04/1975");
		usuario1.setTelefone("(11) 3215-5547");
		usuario1.setEmail("rodrigues@internet.com");
	    
		cc.abrirConta("CC");
	   
		Conta cp = new ContaPoupanca(usuario2);
		usuario2.setNome("João da Silva Peixoto");
		usuario2.setEndereco("Rua Juscelino Kubitschek num. 72 - São Paulo");
		usuario2.setDataNasc("03/09/1983");
		usuario2.setTelefone("(11) 3269-1411");
		usuario2.setEmail("peixoto.joao@internet.com");
	    cp.abrirConta("CP");
	   
		cc.depositar(200);
		cc.trasnferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		cc.fecharConta();
		cc.sacar(200);
		cc.fecharConta();
		
		cp.fichaClientes();
		
		
		}

}
