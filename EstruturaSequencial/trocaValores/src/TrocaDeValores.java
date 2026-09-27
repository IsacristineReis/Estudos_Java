public class TrocaDeValores {
    public static void main (String[] args) {

        int x = 10;
        int y = 5;
        int aux = x;

        System.out.println("o valor do x agora é: "+(x=y));
        System.out.println("o valor do y agora é: "+(y=aux));

    }
}
