package Exercicios;

public class Aluno {

    //atributos
    private double nota1;
    private double nota2;
    private double media;

    public void setNota1(double n1){
        nota1 = n1;
    }
    public void setNota2(double n2){
        nota2 = n2;
    }


    public double getMedia(){
        if(nota1 < 0 || nota1 > 10){
            System.out.println("Digite uma nota válida entre 0 e 10.");
        } else if (nota2 < 0 || nota2 > 10) {
            System.out.println("Digite uma nota válida entre 0 e 10.");
        }else {
        media = (nota1 + nota2) /2;
        }
        return media;
    }

}
