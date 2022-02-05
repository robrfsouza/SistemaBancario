package banco.modelo;

public class Cliente {

	protected String cidade, estado;
	private static int quantidade;
	protected int codigo;

	public Cliente() {
		quantidade++;
		codigo = quantidade;
		cidade = "Iraja";
		estado = "RJ";
	}

	public Cliente(String cidade, String estado) {
		quantidade++;
		codigo = quantidade;
		this.cidade = cidade;
		this.estado = estado;

	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String listarDados() {
		return "Codigo: " + codigo + "\n" + "Cidade: " + cidade + "\n" + "Estado: " + estado + "\n";
	}

	public static int qtdCliente() {
		return quantidade;
	}

}
