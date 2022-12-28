import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    
    
    /** 
     * @return de uma String com a mensagem seja bem vindo!;
     */
    public static String Saudacoes(){
        return "Seja Bem vindo";
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu primeiro nome");
        String nome = scanner.next();
        System.out.println("Digite o seu sobrenome");
        String sobreNome = scanner.next();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Nome Completo:".concat(nome).concat(" ").concat(sobreNome));
        System.out.println("Idade:"+idade);
    }
}
