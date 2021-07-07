package aula4.exercicios;

public class Livro implements Comparable<Livro>{
	private final String titulo;
	private final int paginas;
	private int pagsLidas;

	public Livro(String titulo, int pags) {
		this.pagsLidas = 0;
		this.titulo = titulo;
		this.paginas = pags;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public int getNumeroPaginas() {
		return this.paginas;
	}

	public int getNumeroPaginasLidas() {
		return this.pagsLidas;
	}

	public void recomeca() {
		this.pagsLidas = 0;
	}

	public boolean ler(int paginas) {
		if (paginas + this.pagsLidas > this.paginas) {
			this.pagsLidas = this.paginas;
			return true;
		} else {
			this.pagsLidas += paginas;
			return false;
		}
	}

	@Override
	public String toString() {
		return "Livro: "+ this.titulo + " ("+
				this.pagsLidas+"/"+this.paginas+")";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(!(o.getClass().isInstance(this))) return false;
		Livro parametro = (Livro) o;
		return (this.titulo.equals(parametro.titulo) && this.paginas==parametro.paginas);
	}
	
	@Override
	public int compareTo(Livro o) {
		if(this.paginas == o.paginas) return this.titulo.compareTo(o.titulo);
		if(this.paginas>o.paginas) return +1;
		else return -1;
	}
	
}
