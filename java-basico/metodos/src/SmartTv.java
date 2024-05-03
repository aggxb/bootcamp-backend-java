public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 10;

  public void ligar() {
    ligada = true;
    System.out.println("Agora a TV está ligada");
  }

  public void desligar() {
    ligada = false;
    System.out.println("Agora a TV está desligada");
  }

  public void aumentarVolume() {
    volume++; // volume = volume + 1
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void diminuirVolume() {
    volume--; // volume = volume - 1
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
    System.out.println("Mudando o canal para: " + canal);
  }

  public void aumentarCanal() {
    canal++;
    System.out.println("Mudando o canal para: " + canal);
  }

  public void diminuirCanal() {
    canal--;
    System.out.println("Mudando o canal para: " + canal);
  }

}