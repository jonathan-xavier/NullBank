package model;

public class ContaCorrente extends Conta {

	public ContaCorrente(String nome, String cpf, String endereco, String dataNascimento, int agencia, int numero,
			int saldo, boolean contaAtiva) {
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setDataNascimento(dataNascimento);
		setAgencia(agencia);
		setNumero(numero);
		setSaldo(saldo);
		setContaAtiva(contaAtiva);

	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor); 
	}
		

		/*System.out.println("Deseja solicitar emprestimo?");
		System.out.println("1 - Sim\n2 - Não");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("Sim");
			break;
		case 2:
			System.out.println("Saldo insuficiente");
			break;
		}

	}*/

	@Override
	public String toString() {
		return "Nome()=" + getNome() + ", Cpf()=" + getCpf() + ", Endereco()=" + getEndereco() + ", DataNascimento()="
				+ getDataNascimento() + ", Agencia" + getAgencia() + ", Numero=" + getNumero() + ", Saldo=" + getSaldo()
				+ ", Conta Ativa=" + getContaAtiva();
	}

}
