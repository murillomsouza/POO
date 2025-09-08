package Exemplo;

public class UsaCirculo {
    public static void main(String[] args){
        TesteCirculo c = new TesteCirculo();
        c.setRaio(20);
        double result = c.getRaio();
        System.out.println(result);
    }
}
