package aula4.exercicios;

public class TestaCafeteira {

	public static void main(String[] args) {
		MaquinaCafe maq = new MaquinaCafe("TabajaraPresso", "220");
		maq.abasteceAgua(550);
		maq.abasteceCafe(50);
		maq.abasteceAcucar(50);
		
		CopoCafe c1,c2,c4,cf, c3 = new CopoCafe(300);
		c1 = new CopoCafe(200);
		c2 = new CopoCafe(200);
		c4 = new CopoCafe(200);
		cf = new CopoCafe(200);
		
		maq.preparaCafeForte(cf, true, true); 		//gasta 100(agua), 20(cafe), 20(acucar)
		maq.preparaCafeTradicional(c1, false, true);	//gasta 50(agua), 5(cafe), 10(acucar)
		maq.preparaCafeTradicional(c2, false, true);	//gasta 50(agua), 5(cafe), 10(acucar)
		maq.preparaCafeTradicional(c3, false, true);	//gasta 50(agua), 5(cafe), 10(acucar) //acaba com acucar
		maq.preparaCafeTradicional(c4, false, true);	//gasta 50(agua), 5(cafe), 0(acucar)
		
		System.out.println(c1+"\n"+c2+"\n"+c3+"\n"+c4+"\n"+cf);
		System.out.println(c1.equals(c2)==true);
		System.out.println(c3.equals(c4)==false);
		System.out.println(c3.equals(c1)==false);
		System.out.println(c3.equals(c2)==false);
		System.out.println(c3.equals(cf)==false);
		System.out.println(c4.equals(c1)==false);
		System.out.println(c4.equals(c2)==false);
		System.out.println(c4.equals(cf)==false);
		
		c1.esvazia(10);
		System.out.println(c1.equals(c2)==false);
		//sem acucar
		System.out.println(maq.preparaCafeTradicional(c1, false, false)==false);
		
		maq.abasteceAcucar(65);
		System.out.println(maq.preparaCafeTradicional(c1, true, true)==true); 
		CopoCafe cpnovo = new CopoCafe(400);
		
		//sem cafe
		System.out.println(maq.preparaCafeTradicional(cpnovo, true, true)==false);
		
		maq.abasteceCafe(35);
		System.out.println(maq.preparaCafeTradicional(cpnovo, true, true)==true);
		
		//sem agua
		System.out.println(maq.preparaCafeTradicional(cpnovo, true, true)==false);
		
		maq.abasteceAgua(50);
		System.out.println(maq.preparaCafeTradicional(cpnovo, true, true)==true);
		
		System.out.println(CopoCafe.getTotalCopos()==6);
		
	}

}

