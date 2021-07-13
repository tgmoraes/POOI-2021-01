package aula4.exercicios;

public class MaquinaCafe {
	private final String voltagem; 
	private final String marca;
	private int qtdeAgua;
	private int qtdeAcucar;
	private int qtdeCafe;
	//(em gramas) e quantidade de café (em gramas)
	public MaquinaCafe(String marca, String voltagem) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.qtdeAcucar=0;
		this.qtdeAgua=0;
		this.qtdeCafe=0;
	}
	public String getVoltagem() {
		return this.voltagem;
	}
	public String getMarca() {
		return this.marca;
	}
	public int getQtdeAgua() {
		return this.qtdeAgua;
	}
	public int getQtdeAcucar() {
		return this.qtdeAcucar;
	}
	public int getQtdeCafe() {
		return this.qtdeCafe;
	}
	public void abasteceAgua(int x) {
		this.qtdeAgua+=x;
	}
	public void abasteceCafe(int x) {
		this.qtdeCafe+=x;
	}
	public void abasteceAcucar(int x) {
		this.qtdeAcucar+=x;
	}
	
	public boolean preparaCafeForte(CopoCafe c, boolean duplo, boolean adocado) {
		//receita café forte simples: 50mL de água, 10g de café e caso adoçado, 10g de açúcar
		int acucar;
		if(adocado) acucar = 10;
		else acucar = 0;
				
		if(duplo) return this.preparaCafe(c, 100, 20, acucar*2, "Forte");
		else return this.preparaCafe(c, 50, 10, acucar, "Forte");
	}
	
	public boolean preparaCafeTradicional(CopoCafe c, boolean duplo, boolean adocado) {
		//receita café tradicional simples: 50mL de água, 5g de café e caso adoçado, 10g de açúcar
		int acucar = adocado ? 10: 0; // if ternário: se a exp lógica é true vale 10 se não vale 0 
		
		if(duplo) return this.preparaCafe(c, 100, 10, acucar*2, "Tradicional");
		else return this.preparaCafe(c, 50, 5, acucar, "Tradicional");
	}
	
	private boolean preparaCafe(CopoCafe c, int gastoAgua, int gastoCafe, int gastoAcucar, String tipo) {
		//verifica se tem agua e café para o preparo
		if(gastoCafe>this.qtdeCafe || gastoAgua>this.qtdeAgua ) return false;
		
		Cafe cafe;
		//café sem acucar
		if(gastoAcucar==0 || gastoAcucar>this.qtdeAcucar) {
			cafe = new Cafe(tipo, false);
			gastoAcucar=0;
		}
		//cafe com acucar
		else cafe = new Cafe(tipo, true);
		
		//verifica se tem café e o café no copo é de tipo diferente
		if (c.getQuantidade()>0 && !(c.getTipoCafe().equals(cafe))) return false;
		
		//faz o café
		this.qtdeAgua-=gastoAgua;
		this.qtdeCafe-=gastoCafe;
		this.qtdeAcucar-=gastoAcucar;
		c.encher(cafe,gastoAgua);
		return true;
	}
}

