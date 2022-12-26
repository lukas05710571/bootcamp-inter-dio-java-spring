public class SmartTv{
   // Execicio SmarTV
    // Devemos descrever o funcionamente de uma TV a partir
    // dos seus atributos e métodos.

    int numeroDoCanal = 10;
    boolean ligada = false;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        numeroDoCanal++;
    }

    public void diminuirCanal(){
        numeroDoCanal--;
    }

    public int escolherCanal(int novoCanal){
        numeroDoCanal = novoCanal;
        return numeroDoCanal;
    }


     
}
