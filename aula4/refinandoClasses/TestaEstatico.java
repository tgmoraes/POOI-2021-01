package aula4.refinandoClasses;

public class TestaEstatico {
	public static void main(String[] args) {
	
		System.out.println(Pessoa.getPopulacao());
		
		Pessoa p1 = new Pessoa("Iago", 75.5);
		
		System.out.println(Pessoa.getPopulacao());
		
		Pessoa p2 = new Pessoa("Jorge", 80);
		
		System.out.println(Pessoa.getPopulacao());
	}
}
