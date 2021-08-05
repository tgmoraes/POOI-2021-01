package aula7.polimorfismoEClassesAbstratas.exercicios.animais;

public class Pato extends Animal {

	public Pato(String nome) {
		super(nome);
	}

	@Override
	public String seComunica() {
		return "quack";
	}

}
