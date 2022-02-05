package banco.modelo;

public class PessoaJuridica extends Cliente {

	private String cnpj;
	private String razaoSocial;


	public PessoaJuridica(String cidade, String estado, String cnpj, String razaoSocial) {
		super(cidade, estado);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	

	public PessoaJuridica() {
		super();
		razaoSocial ="INDEFINIDO";
		cnpj="";
	}



	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaosocial) {
		this.razaoSocial = razaosocial;
	}

	public String listarDados() {
		return "Razao Social: "+razaoSocial+"\n"+"CNPJ "+cnpj+"\n"+super.listarDados();
	}
}
