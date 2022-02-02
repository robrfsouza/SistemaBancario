package banco.modelo;

public class ContaCorrente extends Conta {

	private double limite;
	private double juros;

	public ContaCorrente(double limite, double juros) {
		super();
		this.limite = limite;
		this.juros = juros;
	}

	public ContaCorrente() {
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public static void aplicarjuros() {

	}

}
