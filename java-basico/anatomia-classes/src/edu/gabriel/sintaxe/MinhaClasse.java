package edu.gabriel.sintaxe;

public class MinhaClasse {
  
  public static void main (String [] args) {
    // Declaração de variáveis (tipo nome = valor)

    String nome = "Gabriel";
    String sobrenome = "Augusto";

    String nomeCompleto = nomeCompleto(nome, sobrenome);

    System.out.print(nomeCompleto);
  }

  // Declaração de métodos (tipoRetorno nomeInfinitivo (parâmetros))
  public static String nomeCompleto (String nome, String sobrenome) {
    return "Resultado do método: " + nome.concat(" ").concat(sobrenome);
  }

}
