package Atividade_3;

public class Main {

	public static void main(String[] args) {
		TV tv1 = new TV();
		
		tv1.status=false;
		tv1.canal = 1;
		tv1.mudarCanal(true);
		tv1.alterarCanalManual(12);
		tv1.trocarVolume(true);
		
		System.out.println("CANAL: "+tv1.canal
				+"\nVOLUME: " + tv1.volume);
		
		
	}

}
