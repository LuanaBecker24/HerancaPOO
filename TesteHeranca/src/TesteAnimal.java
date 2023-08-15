
public class TesteAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal("Homo Sapiens", 40, "Grande");
		System.out.println("---- CACHORRO ----");
		Cachorro doguinho = new Cachorro("Canis Lupus Familiaris", 20, "Médio");
		
		System.out.println(doguinho.latir());
		System.out.println(doguinho.alimentar("Ração"));
		System.out.println(doguinho.repousar(5, "min"));
		
		Animal bicho = new Animal();
		
		bicho = new Cachorro("Canis Lupus Familiaris", 20, "Médio");
		
		Cachorro dog2 = (Cachorro)bicho;
		
		System.out.println(bicho.reproduzir());
		System.out.println(doguinho.reproduzir());
		
		System.out.println("---- PEIXE ----");
		
		Peixe dory = new Peixe("Paracanthurus hepatus", 2, "Pequeno");
		
		System.out.println(dory.bolhinhas());
		System.out.println(dory.alimentar("alga"));
		System.out.println(dory.nadar());
		
		System.out.println("---- SAPO ----");
				
		Sapo sapinho = new Sapo("Rhinella marina", 1, "Médio");
		
		System.out.println(sapinho.coaxar());
		System.out.println(sapinho.alimentar("Mosca"));
		System.out.println(sapinho.pegandoComida());
		System.out.println(sapinho.saltando(10, "cm"));

	}
}
