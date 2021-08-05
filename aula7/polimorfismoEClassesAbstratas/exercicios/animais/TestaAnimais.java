package aula7.polimorfismoEClassesAbstratas.exercicios.animais;

public class TestaAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animais = new Animal[5];
		animais[0] = new Pato("Duck");
		animais[3] = new Pato("Donald");
		animais[1] = new Gato("Brita");
		animais[2] = new Cachorro("Toto");
		animais[4] = new Cachorro("Tobby");
		
		for(Animal item: animais) {
			System.out.println(item.seComunica());
		}
	}

}
