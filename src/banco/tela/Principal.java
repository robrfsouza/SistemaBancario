package banco.tela;

import javax.swing.JOptionPane;

import banco.modelo.Cliente;
import banco.modelo.Conta;
import banco.modelo.PessoaFisica;
import banco.modelo.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta = new Conta();
		Cliente cliente = new Cliente();
		String tipoCliente = JOptionPane.showInputDialog(null,
				"Escolha o tipo de cliente:\n" + "F - Pessoa Fisica\n J- Pessoa Juridica");

		if (tipoCliente.equals("F")) {
			cliente = new PessoaFisica();
			((PessoaFisica) cliente).setNome(JOptionPane.showInputDialog(null, "Nome do cliente:"));
			((PessoaFisica) cliente).setCpf(JOptionPane.showInputDialog(null, "CPF:"));
		} else if (tipoCliente.equals("J")) {
			cliente = new PessoaJuridica();
			((PessoaJuridica) cliente).setRazaoSocial(JOptionPane.showInputDialog(null, "Razao Social:"));
			((PessoaJuridica) cliente).setCnpj(JOptionPane.showInputDialog(null, "CNPJ"));
		} else {
			JOptionPane.showMessageDialog(null, "Opcao invalida, saindo do sistema");
			return;
		}

		cliente.setCidade(JOptionPane.showInputDialog(null, "Cidade"));
		cliente.setEstado(JOptionPane.showInputDialog(null, "Estado:"));

		JOptionPane.showMessageDialog(null, cliente.listarDados());

		int opcao = 0;
		String ret;

		do {
			String mensagem = "SALDO EM CONTA" + conta.getSaldoFormatado() + "\n\n"
					+ "OPCOES\n1 - Depositar\n2 - Sacar\n3 - Sair";
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,mensagem));
				switch (opcao) {
				case 1:
					ret = JOptionPane.showInputDialog(null, "Valor do depósito");
					conta.depositar(Double.parseDouble(ret));
					break;
				case 2:
					ret = JOptionPane.showInputDialog(null, "Valor do saque");
					if (conta.sacar(Double.parseDouble(ret))) {
						JOptionPane.showMessageDialog(null, "Saque realizado");
					} else
						JOptionPane.showMessageDialog(null, "Operacao nao concluida");
					break;
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, e);
			}
		}while ((opcao == 1) || (opcao == 2));

	}
}
