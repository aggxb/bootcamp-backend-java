public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 30.0;
    double valorSolicitado = 13.75;

    if(valorSolicitado < saldo) 
      saldo = saldo - valorSolicitado;

    System.out.println("O saldo atual é " + saldo);

  }
}
