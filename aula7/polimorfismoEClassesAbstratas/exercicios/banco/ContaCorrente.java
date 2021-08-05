package aula7.polimorfismoEClassesAbstratas.exercicios.banco;

public class ContaCorrente extends Conta {
	

	private int limite;
	private int saldo;
	
	public ContaCorrente(int numero, int limite) {
		super(numero);
		this.limite = limite;
		this.saldo = 0;
	}
	@Override
	public void deposita(double valor) {
		if(valor>0) this.saldo+=valor;

	}

	@Override
	public boolean saca(double valor) {
		if(this.getSaldoDisponivel()+1<=valor) {
			this.saldo-=valor+1;
			return true;
		}
		return false;
	}

	@Override
	public boolean transferePara(Conta conta, double valor) {
		if(this.getSaldoDisponivel()-1>=valor) {
			this.saldo-=(valor+1); // this.saldo = this.saldo - (valor+1)
			conta.deposita(valor);
			return true;
		}
		return false;
	}

	@Override
	public double getSaldoDisponivel() {
		// TODO Auto-generated method stub
		return this.saldo + this.limite;
	}
	//Métodos: gettters, setLimite()
	
	public void setLimite(int limite) {
		this.limite=limite;
	}
	public int getLimite() {
		return this.limite;
	}
	public double getSaldo() {
		return this.saldo;
	}
	@Override
	public String toString() {
		return super.toString()+"| limite: "+this.limite;
	}
}

