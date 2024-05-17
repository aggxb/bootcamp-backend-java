public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; // não permite que um número do tipo 'int' seja modificado para 'short'

        int numero = 5;

        numero = 10;
        System.out.println(numero);

        final double VALOR_PI = 3.14; // o valor da variável não poderá ser modificado
        System.out.println(VALOR_PI);
    }
}
