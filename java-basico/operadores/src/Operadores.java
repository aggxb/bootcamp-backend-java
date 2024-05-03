public class Operadores {
    public static void main(String[] args) throws Exception {
        // operadores aritméticos (+ para concatenação)
        System.out.println("Aritméticos");
        System.out.println("---------------");
        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        // operadores unários
        System.out.println("Unários");
        System.out.println("---------------");
        int numero = 5;
        System.out.println(- numero);

        numero++;
        System.out.println(numero);

        numero--;
        System.out.println(numero);

        boolean verdadeiro = false;
        System.out.println("Inverteu: " + !verdadeiro);

        // operador ternário
        System.out.println("Ternário");
        System.out.println("---------------");
        int a = 5;
        int b = 5;

        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        // operadores relacionais
        System.out.println("Relacionais");
        System.out.println("---------------");
        int numero1 = 1;
        int numero2 = 2;

        System.out.println(numero1 == numero2);
        System.out.println(numero1 != numero2);
        System.out.println(numero1 > numero2);
        System.out.println(numero1 >= numero2);
        System.out.println(numero1 < numero2);
        System.out.println(numero1 <= numero2);

        String nome1 = "Gabriel";
        String nome2 = "Gabriel";
        String nome3 = new String("Gabriel");

        System.out.println(nome1 == nome2);
        System.out.println(nome1 == nome3);

        System.out.println(nome1.equals(nome3));

        // operadores lógicos
        System.out.println("Lógicos");
        System.out.println("---------------");
        boolean condicao1 = false;
        boolean condicao2 = true;

        String resultado1 = condicao1 && condicao2 ? "verdadeiro" : "falso";
        String resultado2 = condicao1 || condicao2 ? "verdadeiro" : "falso";

        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
