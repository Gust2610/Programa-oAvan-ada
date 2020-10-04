class Main {
  public static void main(String[] args) {
    MedidorTemperatura medidor = new AdaptadorFarenheit();
    System.out.println("Temperatura em Celsius" +medidor.temperaturaCelsius());
  }
}