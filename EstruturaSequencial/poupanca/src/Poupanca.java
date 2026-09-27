import java.util.Scanner;
public class Poupanca {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor para depositar: ");
        int deposito = sc.nextInt();

        double calculo = deposito*0.013;

        System.out.println("Rendeu em 1 mês: "+(calculo+deposito));

    }

}