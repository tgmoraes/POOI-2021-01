package aula7.polimorfismoEClassesAbstratas.exercicios.animais;

public class Cachorro extends Animal {
	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	public String seComunica() {
		return "au au";
	}

}
