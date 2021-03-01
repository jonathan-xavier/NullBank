package model;

import java.util.Scanner;

public abstract class Conta extends Pessoa {
	private int numero;
	private int agencia;
	private double saldo;
	private boolean contaAtiva = false;

	Scanner sc = new Scanner(System.in);

	public Conta() {

	}

	void abrirConta() {
		if (contaAtiva == false) {
			this.contaAtiva = true;
			System.out.println("Conta aberta com sucesso");
		} else {
			System.out.println("Conta j� existente");
		}

	}

	public void depositar(double valor) {
		if (contaAtiva != true) {
			System.out.println("Conta n�o ativa");
		} else if (valor > 0) {
			this.saldo = saldo + valor;
			System.out.println("Valor depositado com sucesso");
		} else {
			System.out.println("Falha na opera��o");
		}

	}

	public void sacar(double valor) {
		if (contaAtiva != true) {
			System.out.println("Conta n�o ativa");
			System.out.println("Deseja ativar a conta? \n1 - Sim\n2 - N�o");
			int a = sc.nextInt();
			if (a == 1) {
				abrirConta();
			} else {
				System.out.println("Imposs�vel realizar saque");
			}
		}
		if (saldo >= valor) {
			this.saldo = saldo - valor;
			System.out.println("Ope��o realizada com sucesso");
		}
	}

	public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
		if (contaOrigem.contaAtiva != true) {
			System.out.println("Conta n�o ativa");
			
				System.out.println("Deseja ativar a conta? \n1 - Sim\n2 - N�o");
					int opc = sc.nextInt();
			
			if (opc == 1) {
				abrirConta();
			}
			if (this.saldo >= valor) {
				contaOrigem.sacar(valor);
				contaDestino.depositar(valor);
				System.out.println("Transfer�ncia concluida com sucesso");
			} else {
				System.out.println("Falha na opera��o");
			}
		} else {
			System.out.println("Imposs�vel realizar transfer�ncia");
		}
		if (contaDestino.contaAtiva != true) {
			System.out.println("Imposs�vel ralizar transfer�ncia" + ",pois a conta de destino est� desativada");
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public boolean getContaAtiva() {
		return contaAtiva;
	}

	public void setContaAtiva(boolean contaAtiva) {
		this.contaAtiva = contaAtiva;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + ", contaAtiva=" + contaAtiva;
	}

}
