import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try(Scanner entrada = new Scanner(System.in)){
            System.out.println("digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Qual sua idade " + nome+"?");
        int idade = entrada.nextInt();

        if(idade > 18){
            System.out.println("""
            Nome: %s
            Idade: %d
            Status: maior de idade
            """.formatted(nome,idade));
        } else{
            System.out.println("""
            Nome: %s
            Idade: %d
            Status: menor de idade
            """.formatted(nome,idade));
        }
        }
    }
}
