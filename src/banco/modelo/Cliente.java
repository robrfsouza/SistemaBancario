package banco.modelo;

public class Cliente {
	
	public String nome, cidade, estado;
	static int quantidade;
	public int codigo;
	
	public Cliente() {
		quantidade ++;
		codigo = quantidade;
		nome = "indefinido";
		cidade = "Iraja";
		estado = "RJ";
	}
	public Cliente(String nome, String cidade, String estado) {
		quantidade ++;
		codigo=quantidade;
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		return  "Codigo: "+codigo+"\n"+
				"Nome: "+nome+"\n"+
				"Cidade: "+ cidade+ "\n"+
				"Estado: "+ estado+ "\n";
	}
	public static int qtdCliente() {
		return quantidade;
	}
	

}
