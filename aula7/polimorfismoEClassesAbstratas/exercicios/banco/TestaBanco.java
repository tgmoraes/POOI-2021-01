package aula7.polimorfismoEClassesAbstratas.exercicios.banco;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestaBanco {
	public static void main(String[] args) {
		
		ArrayList<Conta> contas = new ArrayList<>();
		//testes contas correntes:
		ContaCorrente cc1, cc2;
		cc1 = new ContaCorrente(1, 200);
		cc2 = new ContaCorrente(2, 1500);
		cc1.deposita(1000);
		System.out.println(cc1.getLimite()==200);
		System.out.println(cc1.getNumero()==1);
		System.out.println(cc1.getSaldo()==1000);
		System.out.println(cc1.getSaldoDisponivel()==1200);
		System.out.println(cc1.transferePara(cc2, 1200)==false);
		System.out.println(cc1.transferePara(cc2, 1199)==true);
		System.out.println(cc1.getSaldo()==-200);
		System.out.println(cc2.getSaldoDisponivel()==2699);
		
		
		//testes contas salarios:
		ContaSalario cs1, cs2;
		cs1 = new ContaSalario(3,500,4500);
		cs1.recebe();
		cs1.recebe();
		System.out.println(cs1.getSaldo()==9000);
		cs1.transferePara(cc2, 2000);
		System.out.println(cc2.getSaldoDisponivel()==4699);
		System.out.println(cs1.getSaldoDisponivel()==7499);
		
		//inserindo 3 contas poupanças:
		ContaPoupanca cp1, cp2;
		cp1 = new ContaPoupanca(4);
		cp2 = new ContaPoupanca(5);
		
		cp1.deposita(100, LocalDate.of(2021, 1, 4));
		cp1.deposita(3500, LocalDate.of(2021, 3, 3));
		cp1.deposita(4400, LocalDate.of(2021, 4, 5));
		cp1.deposita(1000, LocalDate.of(2021, 7, 4));
		cs1.transferePara(cp1,300);
		cp1.atualizacaoMonetaria(1);
		cp1.atualizacaoMonetaria(1);
		System.out.printf("%.5f\n",cp1.getSaldoDisponivel());
		cp1.transferePara(cp2, 500);
		System.out.println(cp1.getSaldoDisponivel()==8815.4539);
		System.out.println(cp2.getSaldoDisponivel()==500);
		//testes agência:
		Agencia ag = new Agencia(1000,"032.655.659/98");
		ag.addConta(cc1);
		ag.addConta(cc2);
		ag.addConta(cs1);
		ag.addConta(cp1);
		ag.addConta(cp2);
		System.out.println(ag.getTotalContas()==5);
		System.out.println(
				ag.getTotalDepositadoDisponivel()
				==(7198+4699+0+8815.4539+500));
	}
}
