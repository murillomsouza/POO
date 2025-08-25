package Exemplo;

public class Main {

	public static void main(String[] args) {
		// instanciar um objeto cachorro
		cachorro cachorro1 = new cachorro();
		cachorro cachorro2 = new cachorro();
		
		cachorro1.nome = "Rex";
		cachorro1.idade = 2;
		cachorro1.raca = "Labrador";
		cachorro1.pelagem = "Longo";
		
		cachorro2.nome = "Thanos";
		cachorro2.idade = 3;
		cachorro2.raca = "Dobermann";
		cachorro2.pelagem = "curta";
		
		cachorro1.latir();
		cachorro2.latir();
		
		System.out.println("Dados dos cachorros: ");
		System.out.println("Nome: "+cachorro1.nome+
				 "\nIdade: "+cachorro1.idade+
				 "\nRaça: "+cachorro1.raca+
				 "\nPelagem: "+cachorro1.pelagem);
		
		System.out.println("Dados dos cachorros: ");
		System.out.println("Nome: "+cachorro2.nome+
				 "\nIdade: "+cachorro2.idade+
				 "\nRaça: "+cachorro2.raca+
				 "\nPelagem: "+cachorro2.pelagem);
		
	}
}
		