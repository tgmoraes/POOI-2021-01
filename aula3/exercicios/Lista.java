package aula3.exercicios;

public class Lista {
	private Integer[] valores;
	private int tamanho;
	private int tamFisico;
	
	public Lista() {
		this.tamFisico=5;
		this.valores = new Integer[this.tamFisico];
		this.tamanho=0;
	}
	public void add(Integer valor) {
		if(!this.cheio()) {
			this.alteraVet(5);
		}
		this.valores[this.tamanho] = valor;
		this.tamanho++;
	}
	public void remove(int index) {
		if(index>=0 && index<this.tamanho) {
			for(int i = index;i<this.tamanho-1;i++) {
				this.valores[i]=this.valores[i+1]; 
			}
			this.tamanho--;
		}
	}
	public int getTamanho() {
		return this.tamanho;
	}
	public Integer get(int pos) {
		return this.valores[pos];
	}
	private boolean cheio() {
		return this.tamanho==this.tamFisico;
	}
	private void alteraVet(int val) {
		if(this.tamFisico+val>0) {
			this.tamFisico+=val;
			Integer[] vetNovo = new Integer[this.tamFisico];
			for(int i=0;i<this.tamanho;i++) {
				vetNovo[i] = this.valores[i];
			}
			this.valores = vetNovo;
		}
	}
}
