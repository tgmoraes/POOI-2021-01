package aula7.polimorfismoEClassesAbstratas.exercicios.animais;

public class Gato extends Animal {

	public Gato(String nome) {
		super(nome);
	}

	@Override
	public String seComunica() {
		return "miau";
	}

}
