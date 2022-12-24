public class metodos{
   // Execicio SmarTV
    // Devemos descrever o funcionamente de uma TV a partir
    // dos seus atributos e métodos.

    int numeroDoCanal = 10;
    int volume = 20;

    public static String ligarTv(){
        return "Aguarde um momento...\nLigado"; 
    }
    public static String DesligarTv(){
        return "Aguarde um momento..\nDesligado";
    }

    public int escolherCanal(int numeroCanal){
        numeroDoCanal = numeroCanal;
        return numeroDoCanal;

    }


    public int volumeTv(int numeroVolume){
        if(numeroVolume > volume){
            volume += numeroVolume;
            return volume;
        }
        else if(numeroVolume < volume ){
           return volume++;
        }
        else{
            return volume;
        }
        
        
    }



    public static void main(String[] args) {
        tv = metodos();
       String ligar_Tv = ligarTv();
       String desligar_Tv = DesligarTv();
       

       System.out.println();
       
    }

     
}
