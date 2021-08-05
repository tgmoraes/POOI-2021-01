package aula7.polimorfismoEClassesAbstratas.exercicios.animais;

public abstract class Animal {
	private String nome;
	public Animal(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public abstract String seComunica();
}
