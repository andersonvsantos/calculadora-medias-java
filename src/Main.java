import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("****************************");


        System.out.println("Informe a primeira nota: ");
        double nota1 = ler.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = ler.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = ler.nextDouble();
        System.out.println("Informe a quarta nota: ");
        double nota4 = ler.nextDouble();

        System.out.println("****************************");
        System.out.println("****************************");

        double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A media do aluno foi: " + mediaFinal);
        calcularMedia(mediaFinal);

        System.out.println("****************************");

    }

    public static void calcularMedia (double media) {

        if(media >= 7) {
            System.out.println("Aluno aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno ficou de recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}