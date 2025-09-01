package Exemplos;

public class Main {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.nome = "Animal generico";
		animal1.especie = "Generica";
		animal1.peso = 100;
		
		System.out.println(animal1.nome + " "+animal1.especie+" "+animal1.peso);
		
		animal1.emitirSom();
		
		Raposa raposa1 = new Raposa();
		raposa1.nome = "Mozilla";
		raposa1.especie = "Cauda vermelha";
		raposa1.peso = 8;
		
		System.out.println(raposa1.nome + " "+raposa1.especie+" "+raposa1.peso);
		raposa1.emitirSom();
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.nome = "Bilu";
		cachorro1.especie = "Caramelo";
		cachorro1.peso = 15;
		
		System.out.println(cachorro1.nome + " "+cachorro1.especie+" "+cachorro1.peso);
		cachorro1.emitirSom();
		
		Gato gato1 = new Gato();
		gato1.nome = "Felix";
		gato1.especie = "Siames";
		gato1.peso = 5;
		
		System.out.println(gato1.nome + " "+gato1.especie+" "+gato1.peso);
		gato1.emitirSom();
	}

}
