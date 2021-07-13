package aula4.exercicios;

public class Cafe {
	private final char tipo;
	private final boolean doce;
	
	public Cafe(String tipo, boolean doce) {
		if(tipo.equals("Forte")) this.tipo='F';
		else this.tipo = 'T';
		this.doce=doce;
	}
	public String getTipo() {
		if(tipo=='F') return "Forte";
		else return "Tradicional";
	}
	public boolean isDoce() {
		return this.doce;
	}
	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(!o.getClass().isInstance(this)) return false;
		Cafe param = (Cafe) o;
		return (param.tipo==this.tipo && param.doce == this.doce);
	}
}
