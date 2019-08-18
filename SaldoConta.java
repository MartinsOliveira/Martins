package saldoconta;

public class SaldoConta {

	private String cliente;
	private String nr_conta;
	private double valor;

	public SaldoConta(String cliente, String nr_conta) {

		this.cliente = cliente;
		this.nr_conta = nr_conta;
	}

	public SaldoConta(String cliente, String nr_conta, double deposito_inicial) {

		this.cliente = cliente;
		this.nr_conta = nr_conta;
	    Deposito(deposito_inicial);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getNr_conta() {
		return nr_conta;
	}

	public double getValor() {
		return valor;
	}
	
	public void Deposito(double deposito) {
		 
      valor += deposito;	
	}
 
	public void Saque(double deposito) {
		
		valor -= deposito += 5.0;
	}
	
	public String toString() {
		
		return "Títular " + 
		          cliente +
		       ", Número da Conta " +
		          nr_conta + 
		          ", Saldo: $"
		          + String.format("%.2f", valor);
	}
}
