public class AdaptadorFarenheit extends MedidorFarenheit implements MedidorTemperatura {
  public float temperaturaCelsius(){
    float temp = super.temperaturaFarenheit();
    System.out.println("Temperatura Farenheit= " +temp);
    return (temp-32)/1.8f;
  }
}