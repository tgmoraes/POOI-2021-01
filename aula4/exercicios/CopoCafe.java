package aula4.exercicios;

public class CopoCafe {

	private int qtde; // quatidade em mililitros
	private final int capacidade; // em mL
	private Cafe tipoCafe;
	private static int totalCopos=0;
	
	public CopoCafe(int capacidade) {
		this.tipoCafe = null;
		this.qtde = 0;
		this.capacidade=capacidade;
		this.totalCopos++;
	}
	public static int getTotalCopos() {
		return CopoCafe.totalCopos;
	}
	public boolean encher(Cafe tipo) {
		return this.encher(tipo,this.capacidade);
	}
	
	public boolean encher(Cafe tipo, int qtde) {
		if(qtde<0) return false;
		if(this.qtde==0) {
			if(qtde>this.capacidade) this.qtde = this.capacidade;
			else this.qtde = qtde;
			this.tipoCafe = tipo;
			return true;
		} else {
			if(tipo.equals(this.tipoCafe)) {
				if(qtde>this.capacidade-this.qtde) this.qtde = this.capacidade;
				else this.qtde += qtde;
				return true;
			}
			return false;
		}
	}
	public void esvazia(int qtde) {
		if(qtde>0) {
			if(this.qtde>qtde)	this.qtde-=qtde;
			else {
				this.qtde =0;
				this.tipoCafe = null;
			}
		}
	}
	public Cafe getTipoCafe() {
		return this.tipoCafe;
	}
	public int getCapacidade() {
		return this.capacidade;
	}
	public int getQuantidade() {
		return this.qtde;
	}
	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(!o.getClass().isInstance(this)) return false;
		CopoCafe cp = (CopoCafe)o;
		if(cp.qtde>0 && this.qtde>0) {
			return cp.capacidade==this.capacidade &&
					cp.qtde==this.qtde &&
					this.tipoCafe.equals(cp.tipoCafe);
		} else {
			return cp.capacidade==this.capacidade &&
					cp.qtde==this.qtde;
		}
	}
	
	@Override
	public String toString() {
		String ret = "copo de "+this.capacidade+" mL";
		if(this.tipoCafe==null || this.qtde==0) ret+= " (vazio) ";
		else {
			ret+=" com "+this.qtde+" mL de café "+this.tipoCafe.getTipo()+" ";
			if(this.tipoCafe.isDoce()) ret+="adoçado";
			else ret+="sem açucar";
		}

		return ret;
	}
}
