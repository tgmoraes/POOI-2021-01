package aula7.polimorfismoEClassesAbstratas.exercicios.banco;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContaPoupanca extends Conta {
	

	private ArrayList<Deposito> depositos;
	
	public ContaPoupanca(int numero) {
		super(numero);
		this.depositos = new ArrayList<Deposito>();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean saca(double valor) {
		if(this.getSaldoDisponivel()>=valor) {
			for(int i = depositos.size()-1; i>=0 && valor>0; i--) {
				Deposito d = depositos.get(i);
				double vd = d.getSaldo();
				d.saca(valor);
				valor-= vd;
				if(d.getSaldo()==0) depositos.remove(i);
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean transferePara(Conta conta, double valor) {
		boolean ret = this.saca(valor);
		if(ret) conta.deposita(valor);
		return ret;
	}

	@Override
	public double getSaldoDisponivel() {
		double saldoFinal = 0;
		for(Deposito d: this.depositos) {
			saldoFinal+= d.getSaldo();
		}
		return saldoFinal;
	}
	
	@Override
	public void deposita(double valor) {
		this.deposita(valor, LocalDate.now());
	}
	public void deposita(double valor, LocalDate data) {
		if(valor>0) depositos.add(new Deposito(valor, data));
	}

	//[deposito 1, deposito 2, deposito 3]
	
	public void atualizacaoMonetaria(double taxaSelic) {
		double taxa = taxaSelic*0.7;
		for(Deposito d: this.depositos) d.atualizacaoMonetaria(taxa);
	}

}


//toString()  com o tipo, saldo e lucro.
