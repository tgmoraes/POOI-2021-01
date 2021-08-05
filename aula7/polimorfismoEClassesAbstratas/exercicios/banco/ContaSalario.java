package aula7.polimorfismoEClassesAbstratas.exercicios.banco;

public class ContaSalario extends ContaCorrente {
	private double salario;
	public ContaSalario(int numero, int limite, double salario) {
		super(numero, limite);
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double valor) {
		this.salario=valor;
	}
	public void recebe() {
		this.deposita(this.salario);
	}

}
