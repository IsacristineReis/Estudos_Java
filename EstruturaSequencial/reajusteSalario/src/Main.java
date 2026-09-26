import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o salário: ");
        float salario = sc.nextFloat();

        float reajuste = (salario*15)/100;

        System.out.println("O salário vale agora: "+(reajuste+salario));

        sc.close();

    }

}