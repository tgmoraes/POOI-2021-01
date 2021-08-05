package aula7.polimorfismoEClassesAbstratas.exercicios.banco;

import java.util.ArrayList;

public class Agencia {
	private final int codigo;
	private final String cnpj;
	private ArrayList<Conta> contas;
	
	public Agencia(int codigo, String cnpj) {
		this.codigo=codigo;
		this.cnpj = cnpj;
		this.contas = new ArrayList<Conta>();
	}
	public int getCodigo() {
		return codigo;
	}

	public String getCnpj() {
		return cnpj;
	}
	public void addConta(Conta c) {
		this.contas.add(c);
	}
	public int getTotalContas() {
		return this.contas.size();
	}
	public double getTotalDepositadoDisponivel() {
		double total =0;
		for(Conta c:contas) total+=c.getSaldoDisponivel();
		return total;
	}
}


//Classe: Agencia
//addConta(Conta c)  adiciona uma conta
//getTotalContas()  retorna quantas contas
//getTotalDepositadoDisponível()  retorna o somatório dos saldos disponíveis nas contas