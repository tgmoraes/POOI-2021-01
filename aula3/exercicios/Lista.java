package aula3.exercicios;

public class Lista {
	private int[] valores;
	private int tamanho;
	private int passo;

	public Lista() {
		this.passo = 10;
		this.valores = new int[this.passo];
		this.tamanho = 0;
	}

	public void add(int valor) {
		if (this.cheio()) {
			this.alteraVet();
		}
		this.valores[this.tamanho] = valor;
		this.tamanho++;
	}

	public void remove(int index) {
		if (index >= 0 && index < this.tamanho) {
			for (int i = index; i < this.tamanho - 1; i++) {
				this.valores[i] = this.valores[i + 1];
			}
			this.tamanho--;
		}
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public int get(int index) {
		if (index >= 0 && index < this.tamanho) {
			return this.valores[index];
		}
		if(index<0) return this.valores[0];
		else return this.valores[this.tamanho];
	}

	private boolean cheio() {
		return this.tamanho == this.valores.length;
	}

	private void alteraVet() {
		int novoTamanho = this.valores.length + this.passo;
		int[] vetNovo = new int[novoTamanho];
		for (int i = 0; i < this.tamanho; i++) {
			vetNovo[i] = this.valores[i];
		}
		this.valores = vetNovo;	
	}
	
	@Override
	public String toString() {
		String ret = "tam:" + this.tamanho + " - tam físico:" + this.valores.length + " -->[";
		for (int i = 0; i < this.tamanho; i++) {
			ret += this.valores[i] + " ";
		}
		ret += "]";
		return ret;
	}
}
