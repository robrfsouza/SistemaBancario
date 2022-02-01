package banco.tela;

import javax.swing.JOptionPane;

import banco.modelo.Cliente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente("Robson", "Sao Paulo", "SP");
		Cliente cliente2 = new Cliente ("Daniel", "Iraja", "RJ");
		Cliente cliente3 = new Cliente ("Hinata", "Ilha do Governador", "Rio de Janeiro");
		
		JOptionPane.showMessageDialog(null, cliente1.listarDados());
		JOptionPane.showMessageDialog(null, cliente2.listarDados());
		JOptionPane.showMessageDialog(null, cliente3.listarDados());
		
		JOptionPane.showMessageDialog(null, "Possuimos "+ Cliente.qtdCliente() + " cliente(s) Cadastrados");
	}

}
