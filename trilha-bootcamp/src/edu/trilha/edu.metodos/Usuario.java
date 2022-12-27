public class Usuario {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)throws Exception {
        SmartTv smartTv = new SmartTv(); 
// Verificando se a TV está ligada
        System.out.println("A tv está ligada ?\n"+smartTv.ligada);
        // Ligando Tv e verificando o seu estado.
        smartTv.ligar();
        System.out.println("A Tv já está ligada ?\n"+smartTv.ligada);
        // Verificar se o volume da Tv está funcionando
        System.out.println("Volume padrão:"+smartTv.volume);
        // Aumentando o volume 3 vezes , pela logica o resultado
        // Deve ser 13 no fim da compilação
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual:"+smartTv.volume);
        // Diminuindo o volume da tv , e pela lógica ele deve
        // Retornar 11
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Depois de diminuir:"+smartTv.volume);

        // Escolhendo Canal:
        smartTv.escolherCanal(20);
        System.out.println("Canal escolhido:"+smartTv.numeroDoCanal);
        // Aumentando o Canal a lógica é que ele aumenta para 22
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal depois de aumentado:"+smartTv.numeroDoCanal);
        // Diminuindo o canal (decrementando)a idéia é que ele volta para 20
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal depois de diminuir:"+smartTv.numeroDoCanal);
        
    }
    
}
