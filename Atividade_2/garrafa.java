package Atividade_2;

public class garrafa {
	//ATRIBUTO
	int ml;
	boolean aberta;
	
	//METODO
	public void integridade() {
	if(aberta == true) {
		System.out.println("Já foi aberta!");
	} else {
		System.out.println("Não foi aberta");
	}
	
	}
}