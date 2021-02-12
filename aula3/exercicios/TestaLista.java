package aula3.exercicios;

import java.util.ArrayList;
public class TestaLista {

	static int getTamanho(int[] vet) {
		return vet.length;
	}
	public static void main(String[] args) {
		int[] vet1 = new int[10];
		int[] vet2 = new int[5];
		System.out.println("tamanho vet1: "+getTamanho(vet1));
		System.out.println("tamanho vet1: "+getTamanho(vet2));
		System.out.println(Math.floor(Math.random()*10+1));
		
		Lista l = new Lista();
		l.add(4);
		l.add(6);
		l.add(8);
		l.add(10);
		l.add(12);
		l.add(14);
		
		System.out.println("valor 5:"+l.get(5));
		System.out.println("valor tam:"+l.getTamanho());
		
		
	}

}
