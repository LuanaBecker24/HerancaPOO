
public class Cachorro extends Animal {
	//Atributos
	private String nome;
	private String raca;
	private String cor;
	private String porte;
	private boolean adestrado;
	private boolean castrado;
	
	//Métodos
	public String latir() {
		return "AUAUAU...";
	}
	public String reproduzir() {
		//Sobrescrita de métodos
		if(!this.castrado) {
			return "Reproduzindo little dogs...";
		} 
		return "Esse dog é castrado!";
	}
	public String morder() {
		return "Nhac Nhac";
	}
	
	//Getters e setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public boolean isAdestrado() {
		return adestrado;
	}
	public void setAdestrado(boolean adestrado) {
		this.adestrado = adestrado;
	}
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	public Cachorro(String nomeCientifico, float peso, String tamanho) {
		super(nomeCientifico, peso, tamanho);
		// TODO Auto-generated constructor stub
	}
}
