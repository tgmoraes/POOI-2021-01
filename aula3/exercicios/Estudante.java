package aula3.exercicios;
//exercicio 2
public class Estudante {
	private String nome;
	private int idade;
	private Lista notas;
	
	
	public Estudante() {
		this.notas=new Lista();
	}
	public Estudante(String nome,int idade) {
		this.notas=new Lista();
		this.setIdade(idade); 
		this.setNome(nome);
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		if(idade>=5) this.idade = idade;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void fazAniversario() {
		this.setIdade(this.idade+1);
	}
	public void insereNota(Integer nota) {
		this.notas.add(nota);
	}
	public double calculaMedia() {
		int i=0;
		double sum=0;
		for (i = 0;i<this.notas.getTamanho();i++) {
			
			sum+=notas.get(i);
		}
		return sum/i;
	}
}
