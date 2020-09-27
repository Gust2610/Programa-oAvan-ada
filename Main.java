package Aula006;
class Main {
  public static void main(String[] args) {

    BancoDados bd1 = BancoDados.getInstance();
    BancoDados bd2 = BancoDados.getInstance();
    BancoDados bd3 = BancoDados.getInstance();

    // Todas as chamadas apresentam o mesmo hashCode, para provar que apenas uma instancia do Singleton é incializada.
    System.out.println("Primeira chamada da instancia: \n" +bd1.hashCode());
    System.out.println("\nSegunda chamada da instancia: \n" +bd2.hashCode());
    System.out.println("\nTerceira chamada da instancia: \n" +bd3.hashCode());
  }
}