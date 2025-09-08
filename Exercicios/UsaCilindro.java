package Exercicios;

public class UsaCilindro {
    public static void main(String[] args){
        Cilindro x = new Cilindro();
        x.setAltura(10);
        x.setRaioBase(5);
        double result = x.getAltura();
        double result2 = x.getRaioBase();
        System.out.println("A altura do Cilindro é: "+result+"\nE o raio é: "+result2);
    }
}
