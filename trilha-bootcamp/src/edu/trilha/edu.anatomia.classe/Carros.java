public class Carros {
    
   String cor = "Azul";
   String modelo = "XNY";
   int ano = 2010;
   int rodas = 4;
   int portas = 4;

   
   /** 
    * @return String
    */
   public static String AcelerarCarro(){
    return "Acelerando..";
  }

   
   /** 
    * @return String
    */
   public static String Breque(){
    return "Brecando";
  }

  
  /** 
   * @return String
   */
  public static String Ligar(){
    return "Ligado";
  }

  
  /** 
   * @return String
   */
  public static String Desligar(){
    return "Desligado";
  }

    /** 
     * @param args
     */
    public static void main(String[] args) {
        
     String alecerarCarro = AcelerarCarro(); 
     String brecarCarro = Breque();
     String ligarCarro = Ligar();
     String desligarCarro = Desligar();
    
     System.out.println(desligarCarro);
    }
}
