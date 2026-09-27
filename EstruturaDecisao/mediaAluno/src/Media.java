import java.util.Scanner;
public class Media {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1° bimestre: ");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2° bimestre: ");
        double nota2 = sc.nextDouble();
        System.out.println("Nota 3° bimestre: ");
        double nota3 = sc.nextDouble();
        System.out.println("Nota 4° bimestre: ");
        double nota4 = sc.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        if (media >= 6.0){
            System.out.println("Aprovado");
        } else if (media >= 3.0 || media <=6.0) {
            System.out.println("Exame");
        } else{
            System.out.println("Reprovado");
        }

        System.out.printf("A média é 2%f%n%",media);
    }
}