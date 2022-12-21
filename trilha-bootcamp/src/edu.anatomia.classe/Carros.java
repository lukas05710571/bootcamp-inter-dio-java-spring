public class Carros {
    
   String cor = "Azul";
   String modelo = "XNY";
   int ano = 2010;
   int rodas = 4;
   int portas = 4;

   public static String AcelerarCarro(){
    return "Acelerando..";
  }

   public static String Breque(){
    return "Brecando";
  }

  public static String Ligar(){
    return "Ligado";
  }

  public static String Desligar(){
    return "Desligado";
  }



    public static void main(String[] args) {
        
     String alecerarCarro = AcelerarCarro(); 
     String brecarCarro = Breque();
     String ligarCarro = Ligar();
     String desligarCarro = Desligar();
    
     System.out.println(desligarCarro);
    }
}
