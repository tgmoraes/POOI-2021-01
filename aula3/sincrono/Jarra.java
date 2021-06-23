package aula3.sincrono;

//--> public: acesso livre para qualquer um
//--> private: acesso livre apenas na classe (internamente)
//--> "":default, package: publico dentro do package e para quem herda

//implementa a ideia de uma Jarra Eletrica
public class Jarra {
	// definição de atributos - variaves da classe
	private String marca;
	private int volumeMaximo;
	private int volumePreenchido;
	public boolean ligado;
	//construtores
	public Jarra() {
		this.volumePreenchido=0;
	}
	public Jarra(String marca) {
		this();
		this.marca=marca;
	}
	public Jarra(String marca, int volMax) {
		this(marca);
		this.volumeMaximo=volMax;
	}
	
	//getters e setters:
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public int getVolumeMaximo() {
		return this.volumeMaximo;
	}
	public void setVolumeMaximo(int vol) {
		this.volumeMaximo = vol;
	}
	
	public int getVolumePreenchido() {
		return this.volumePreenchido;
	}
	
	// definição dos métodos
	public String paraString() {
		return "marca: " + this.marca + " (vol: " + this.volumePreenchido + "/" + this.volumeMaximo + ")";
	}

	public void encher(int qtde) {
		if (qtde + this.volumePreenchido > this.volumeMaximo) {
			this.volumePreenchido = this.volumeMaximo;
		} else {
			this.volumePreenchido += qtde;
		}
	}

	public int esvaziar(int volume) {
		int retorno;
		if(volume> this.volumePreenchido) {
			retorno = this.volumePreenchido;
			this.volumePreenchido=0;
		} else {
			retorno = volume;
			this.volumePreenchido -= volume;
		}
		return volume;
	}
}
