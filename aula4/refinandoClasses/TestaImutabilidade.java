package aula4.refinandoClasses;

public class TestaImutabilidade {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Tiago", 75.5);
		Pessoa p2 = new Pessoa("Jorge", 80);
		
		
		//testando o toString herdado de object
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.getClass().getName()+"@"+
				Integer.toHexString(p1.hashCode()));
		}
}
