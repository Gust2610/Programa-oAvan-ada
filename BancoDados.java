package Aula006;
public final class BancoDados {
private static BancoDados instance;
 
//Utilizando a Variação de Singleton Static Block, onde a criação da Instancia é feito após uma validação e não logo
// de cara como outras variações.
  private BancoDados(){
  }

 static{
    try{
      instance = new BancoDados();
    } catch(Exception e){
      // Em caso de erro, será direcionado para esse parte do codigo, onde não é possivel a criação da instancia.
      throw new RuntimeException("Não foi possivel a criação da instancia Singleton");
    }
 }
 public static BancoDados getInstance(){
     
  return instance;
  }
}
