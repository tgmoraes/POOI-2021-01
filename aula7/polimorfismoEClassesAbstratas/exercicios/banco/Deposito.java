package aula7.polimorfismoEClassesAbstratas.exercicios.banco;

import java.time.LocalDate;

public class Deposito {
	private double valor;
	private final LocalDate data;
	private double lucro;

	public Deposito(double valor, LocalDate data) {
		this.valor = valor;
		this.data = data;
		this.lucro=0;
	}
	public double getSaldo() {
		return this.valor+this.lucro;
	}
	public LocalDate getData() {
		return this.data;
	}
	public void saca(double val) {
		if(val>0) {
			if(val>this.lucro) {
				val-=this.lucro;
				this.lucro=0;
				if(val>this.valor) this.valor=0;
				else this.valor-= val;
			} else	this.lucro-=val;
		}
	}
	//passada (valor entre 0 e 100) caso seja o aniversário do depósito. Considere as regras:
	//- a data deve ser anterior a data do sistema;
	//- a data do sistema deve ter o mesmo dia do mês da data de depósito ou caso a data do
	//sistema esteja no último dia do mês e o dia do depósito seja maior.
	public void atualizacaoMonetaria(double taxa) {
		LocalDate hoje = LocalDate.now();
		int diaHoje = hoje.getDayOfMonth();
		int diaDeposito = this.data.getDayOfMonth() ;
		if(hoje.isAfter(this.data)) {
			if((diaHoje==diaDeposito) ||
					(hoje.lengthOfMonth()==hoje.getDayOfMonth()&&
					diaHoje<diaDeposito)){
						this.lucro+=this.getSaldo()*taxa/100;
					}
		}
				
	}
}
