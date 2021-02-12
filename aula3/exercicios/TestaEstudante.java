package aula3.exercicios;

public class TestaEstudante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante e = new Estudante("Júlio", 18);
		
		//System.out.println("Média: "+ e.calculaMedia());
		e.insereNota(9);
		e.insereNota(8);
		System.out.println("Média: "+ e.calculaMedia());
		e.insereNota(8);
		
		e.fazAniversario();
		e.fazAniversario();
		e.fazAniversario();
		System.out.println("Nome: "+ e.getNome()+ "\nidade:"+e.getIdade());
		System.out.println("Média: "+ e.calculaMedia());
	}

}
