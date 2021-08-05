package aula7.polimorfismoEClassesAbstratas.exercicios.banco;

public abstract class Conta {
	private final int numero;
	public Conta(int numero) {
		this.numero = numero;
	}
	public abstract void deposita(double valor); 
	public abstract boolean saca(double valor);
	public abstract boolean transferePara(Conta conta, double valor);
	public abstract double getSaldoDisponivel();
	public int getNumero() {
		return this.numero;
	}
	
	@Override
	public String toString() {
		return "número: "+this.numero+
				"|tipo conta: "+this.getClass().getSimpleName()+
				"|saldo disponível: "+ this.getSaldoDisponivel();
	}
}