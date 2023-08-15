
//Exercício
public class Peixe extends Animal {
	
	//Atributos específicos 
	private boolean estimacao;
	private String grupo; //cartilaginosos, ósseos...
	private String tipoAlimento; //ração, outros peixes...
		
	//Métodos específicos + reescrever os métodos da classe Animal
	
	public String nadar(){
		return "Nadando...";
	}
	public String bolhinhas() {
		return "GLU GLU";
	}
	
	//Getters e setters
	
	public boolean isEstimacao() {
		return estimacao;
	}
	public void setEstimacao(boolean estimacao) {
		this.estimacao = estimacao;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getTipoAlimento() {
		return tipoAlimento;
	}
	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
		
	//Construtores
	
	public Peixe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Peixe(String nomeCientifico, float peso, String tamanho) {
		super(nomeCientifico, peso, tamanho);
		// TODO Auto-generated constructor stub
	}
}
