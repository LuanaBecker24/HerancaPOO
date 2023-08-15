
public class Sapo extends Animal {
	private boolean venenoso;
	private float alturaSalto;
	
	public String coaxar() {
		return "QUACH QUACH";
	}
	public String saltando(float alturaSalto, String unidade) {
		return "Saltando " + alturaSalto + unidade;
	}
	public String pegandoComida() {
		return "Pegando uma mosca com a língua";
	}
	public String soltandoVeneno() {
		if(!venenoso) {
			return "Tudo bem sou amigável";
		}
		return "Soltando veneno";
	}
	
	public boolean Venenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public float getAlturaSalto() {
		return alturaSalto;
	}
	public void setAlturaSalto(float alturaSalto) {
		this.alturaSalto = alturaSalto;
	}
	
	public Sapo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sapo(String nomeCientifico, float peso, String tamanho) {
		super(nomeCientifico, peso, tamanho);
		// TODO Auto-generated constructor stub
	}
}
