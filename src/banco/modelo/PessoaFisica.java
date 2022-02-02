package banco.modelo;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String nome;

	public PessoaFisica(String cidade, String estado, String cpf, String nome) {
		super(cidade, estado);
		this.cpf = cpf;
		this.nome = nome;
	}

	public PessoaFisica() {
		super();
		nome = "INDEFINIDO";
		cpf = "";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String listarDados() {
		return "Nome: "+nome+"\n"+" CPF: "+cpf+"\n"+super.listarDados();	
	}
}
