package banco.tela;

import javax.swing.JOptionPane;

import banco.modelo.Cliente;
import banco.modelo.Conta;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta= new Conta();
		Cliente cliente1 = new Cliente("Robson", "Sao Paulo", "SP");
		Cliente cliente2 = new Cliente ("Daniel", "Iraja", "RJ");
		Cliente cliente3 = new Cliente ("Hinata", "Ilha do Governador", "Rio de Janeiro");
		
		JOptionPane.showMessageDialog(null, cliente1.listarDados());
		JOptionPane.showMessageDialog(null, cliente2.listarDados());
		JOptionPane.showMessageDialog(null, cliente3.listarDados());
		
		JOptionPane.showMessageDialog(null, "Possuimos "+ Cliente.qtdCliente() + " cliente(s) Cadastrados");
		
		int opcao =0;
		String ret;
		
		do {
			String mensagem = "Saldo em Conta: " + conta.getSaldoFormatado() + "\n\n"+
					"Opcoes:\n1	- Depositar \n2 - Sacar \n3 - Sair";
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
				
				switch (opcao) {
				case 1:
					ret = JOptionPane.showInputDialog(null, "Valor do depósito:");
					conta.depositar(Double.parseDouble(ret));
					JOptionPane.showMessageDialog(null, "Deposito conluido");
					break;
				case 2:
					ret = JOptionPane.showInputDialog(null, "Valor do saque:");
					if (conta.sacar(Double.parseDouble(ret))) {
						JOptionPane.showMessageDialog(null, "Saque concluido");
					}
					else {
						JOptionPane.showConfirmDialog(null, "Operacao nao realizada");
					}
					
				
				}
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "VALOR INVALIDO");
			}
					
		}while ((opcao==1)||(opcao==2));
	}

}
