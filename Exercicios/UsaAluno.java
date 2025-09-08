package Exercicios;

public class UsaAluno {
    public static void main(String[] args){
        Aluno murillo = new Aluno();
        murillo.setNota1(10);
        murillo.setNota2(7);
        double result = murillo.getMedia();
        System.out.println(result);
    }
}
