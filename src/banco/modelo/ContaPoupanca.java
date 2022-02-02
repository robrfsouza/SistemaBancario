package banco.modelo;

import java.util.Date;

public class ContaPoupanca extends Conta {

	private Date aniversario;
	private double rendimento;

	public ContaPoupanca(Date aniversario, double rendimento) {
		super();
		this.aniversario = aniversario;
		this.rendimento = rendimento;
	}

	public ContaPoupanca() {
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public static void aplicarRendimento() {

	}

}
