import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num = sc.nextInt();

        int areaQuadrado = num*num;

        System.out.printf("A area do quadrado é igual a %d%n", areaQuadrado);

        sc.close();
    }
}