package aula3.sincrono;


public class TestaJarra {
	public static void main(String[] args) {
		Jarra var = new Jarra();
		var.setMarca( "Philips");
		var.setVolumeMaximo(1500);
		
		
		System.out.println(var.getMarca());
		
		Jarra jarra2 = new Jarra("Walita",2000);
		
		jarra2.encher(1000);
		System.out.println(var.paraString());
		System.out.println(jarra2.paraString());
		
		jarra2.encher(1500);
		jarra2.encher(1000);
	
		System.out.println("enchendo a jarra...");
		System.out.println(jarra2.paraString());
	}
}
