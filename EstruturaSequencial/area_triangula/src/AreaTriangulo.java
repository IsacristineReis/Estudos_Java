import java.util.*;

public class AreaTriangulo{

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero inteiro para base do triangulo: ");
        int base = sc.nextInt();

        System.out.println("Insira um numero inteiro para altura do triangulo: ");
        int altura = sc.nextInt();

        int areaTriangulo = (base * altura)/2;

        System.out.printf("A area do triângulo é %d%n",areaTriangulo);
        sc.close();

    }

}