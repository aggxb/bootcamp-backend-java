public class PlanoOperadora {
  public static void main(String[] args) {
    String plano = "B";

    switch (plano) {
      case "T": {
        System.out.println("5GB YouTube");
      }
      case "M": {
        System.out.println("WhatsApp e Instagram grátis");
      }
      case "B": {
        System.out.println("100 minutos de ligação");
      }
    }
    // por não habilitar o 'break', as condições não param ao ser encontrado um caso correspondente
  }
}