/**
 *<h1>Variáveis e seus tipos</h1>
* <h3>Nessa seção temos presentes como declarar variáveis e seus tipos.</h3> 
 *<p>O que são variáveis ?\n
 *São espaço reservados na memoria ram (Ramdom access), que por
 *sua vez são memórias temporárias e estão presentes no momento
 *de execução</p>
*
 *@autor Lukas de oliveira   
 *@since Dezembro de 2022
 *@version 1.0
 **/



public class variaveisEtipos {
    
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        // Tipos primitivos
        // Classe String
        String nome = "Lukas";
        int idade = 25;
        final double PI = 3.14;
        double salario = 2500;
        float temperatura = 32.69F;
        System.out.println("Nome:".concat(" ")+nome);
        System.out.println("Idade".concat(" ")+idade);
        System.out.println("Valor de PI:".concat(" ")+PI);
        System.out.println("Salário".concat(" ")+salario);
        System.out.println("Temperatura:".concat(" ")+temperatura);
    
    }
}
