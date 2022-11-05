package Banco;


public class Main {

	public static void main(String[] args) {
		
		Cliente edivonaldo = new Cliente("Edivonaldo");
		
		Conta cc = new ContaCorrente(edivonaldo); //polimorfismo
		
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(edivonaldo); // polimorfismo
		cc.transferir(70, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
