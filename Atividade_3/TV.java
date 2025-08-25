package Atividade_3;

public class TV {
	//ATRIBUTOS
	boolean status;
	int volume;
	int canal;
	
	//METODOS
	/*public void mudarCanal() {
		if(status == true) {
			canal += 1;
		}else {
			System.out.println("A TV precisa estar ligada!");
		}
		
	}*/
	public void alterarCanalManual(int numCanal) {
		if(status==true) {
			canal = numCanal;
		}else {
			System.out.println("A TV precisa estar ligada!");
		}
	}
	public void mudarCanal(boolean alterarCanal) {
		if(status == true) {
			if(alterarCanal == true) {
				canal++;
			}else {
				canal--;
			}
		}else{
			System.out.println("A TV precisa estar ligada!");
		}
	}
	public void trocarVolume(boolean alterarCanal) {
		if(status == true) {
			if(alterarCanal == true) {
				volume++;
			}else {
				volume--;
			}
		}else {
			System.out.println("A TV precisa estar ligada!");
		}
	}

}
