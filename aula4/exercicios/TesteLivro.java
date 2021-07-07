package aula4.exercicios;

public class TesteLivro {
	public static void main(String[] args) {
		String s = null;
		Livro l = new Livro("Use a cabeça - Padroês de Projeto", 470);
		
		System.out.println(l.equals(s));
		s = new String("oi");
		System.out.println(l.equals(s));
		
		Livro l1 = new Livro("oi", 10);
		System.out.println(l.equals(l1));
		
	}
}
